package ru.farkhodkhaknazarov.googlemapfakecarmotion

import android.annotation.SuppressLint
import android.location.Location
import android.os.Bundle
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.location.*
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import io.reactivex.Observable.interval
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    private var map: GoogleMap? = null
    private lateinit var locationProviderClient: FusedLocationProviderClient
    private var locationRequest: LocationRequest? = null
    private lateinit var mapView: SupportMapFragment
    private lateinit var firstMarkerOptions: MarkerOptions
    private lateinit var secondMarkerOptions: MarkerOptions
    private var firstMarker: Marker? = null
    private var secondMarker: Marker? = null
    private val locationCallBack = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult) {
            super.onLocationResult(locationResult)
            if (map != null) {
                Log.d(
                    "LOCATION_UPDATE",
                    "lat: ${locationResult.lastLocation.latitude}" +
                            "lng: ${locationResult.lastLocation.longitude}" +
                            "rotation: ${locationResult.lastLocation.bearing}"
                )

                //setUserLocationMarker(locationResult.lastLocation)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mapView = supportFragmentManager.findFragmentById(R.id.mapView) as SupportMapFragment
        mapView.getMapAsync(this)

        locationProviderClient = LocationServices.getFusedLocationProviderClient(this)
        locationRequest = LocationRequest.create().apply {
            interval = 500L
            fastestInterval = 500L
            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        }
    }

    @SuppressLint("MissingPermission", "CheckResult")
    override fun onResume() {
        super.onResume()
        locationRequest?.let { request ->
            locationProviderClient.requestLocationUpdates(
                request,
                locationCallBack,
                Looper.getMainLooper()
            )
        }

        var disposable: Disposable? = null
        disposable = interval(1000L, 500L, TimeUnit.MILLISECONDS)
            .subscribeOn(AndroidSchedulers.mainThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                LocationHelper.getNextRouteFromFirstList()?.let {
                    setUserLocationMarker(it, firstMarker)
                } ?: disposable?.dispose()
            }

        var disposableSecond: Disposable? = null
        disposableSecond = interval(1000L, 500L, TimeUnit.MILLISECONDS)
            .subscribeOn(AndroidSchedulers.mainThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                LocationHelper.getNextRouteFromSecondList()?.let {
                    setUserLocationMarker(it, secondMarker)
                } ?: disposableSecond?.dispose()
            }
    }

    override fun onPause() {
        super.onPause()
        locationProviderClient.removeLocationUpdates(locationCallBack)
    }

    @SuppressLint("MissingPermission")
    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        map?.apply {
            uiSettings.isZoomControlsEnabled = true
            uiSettings.isZoomGesturesEnabled = true
            setOnCameraMoveListener {

            }
//            isMyLocationEnabled = true
//            uiSettings?.isMyLocationButtonEnabled = true
        }

        val latlng = LatLng(
            59.8668,
            30.26164
        )
        val cameraUpdate = CameraUpdateFactory.newLatLngZoom(
            latlng, 17f
        )

        firstMarkerOptions = MarkerOptions()
        firstMarkerOptions.position(latlng)
        firstMarkerOptions.anchor(0.5F, 0.5F)
        firstMarkerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.top_car))
        firstMarker = map?.addMarker(firstMarkerOptions)

        secondMarkerOptions = MarkerOptions()
        secondMarkerOptions.position(LatLng(59.8668733, 30.26162))
        secondMarkerOptions.anchor(0.5F, 0.5F)
        secondMarkerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.top_car_orange))
        secondMarker = map?.addMarker(secondMarkerOptions)

        map?.moveCamera(cameraUpdate)
    }

    fun setUserLocationMarker(location: Location) {
        val latlng = LatLng(location.latitude, location.longitude)
        firstMarker?.let {
            it.position = latlng
            it.rotation = location.bearing
        }

        map?.moveCamera(CameraUpdateFactory.newLatLngZoom(latlng, 17F))
    }

    fun setUserLocationMarker(route: Route, marker: Marker?) {
        val latlng = LatLng(route.lat, route.lng)
        marker?.let {
            it.position = latlng
            it.rotation = route.rotation
        }

        //map?.moveCamera(CameraUpdateFactory.newLatLngZoom(latlng, 17F))
    }
}