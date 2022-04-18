package ru.farkhodkhaknazarov.googlemapfakecarmotion

object LocationHelper {
    private var firstRouteList: List<Route>  = getFirstRoute()
    private var secondRouteList: List<Route>  = getSecondRouteList()
    private var firstListNextIndex = 0
    private var secondListNextIndex = 0

    fun getFirstRoute(): List<Route> {
        val list = listOf(
            Route(
                lat = 59.8668,
                lng = 30.26164,
                rotation = 352.0F
            ),
            Route(
                lat = 59.8668233,
                lng = 30.2616333,
                rotation = 352.0F
            ),
            Route(
                lat = 59.8668483,
                lng = 30.2616267,
                rotation = 352.0F
            ),
            Route(
                lat = 59.8668967,
                lng = 30.2616133,
                rotation = 352.0F
            ),
            Route(
                lat = 59.8669217,
                lng = 30.2616067,
                rotation = 352.0F
            ),
            Route(
                lat = 59.8669467,
                lng = 30.2616017,
                rotation = 352.0F
            ),
            Route(
                lat = 59.8669717,
                lng = 30.261595,
                rotation = 352.0F
            ),
            Route(
                lat = 59.866995,
                lng = 30.2615883,
                rotation = 352.0F
            ),
            Route(
                lat = 59.86702,
                lng = 30.2615817,
                rotation = 352.0F
            ),
            Route(
                lat = 59.867045,
                lng = 30.261575,
                rotation = 352.0F
            ),
            Route(
                lat = 59.86707,
                lng = 30.26157,
                rotation = 352.0F
            ),
            Route(
                lat = 59.8670883,
                lng = 30.2615983,
                rotation = 36.0F
            ),
            Route(
                lat = 59.8671083,
                lng = 30.2616283,
                rotation = 36.0F
            ),
            Route(
                lat = 59.86713,
                lng = 30.261655,
                rotation = 32.0F
            ),
            Route(
                lat = 59.86715,
                lng = 30.26168,
                rotation = 32.0F
            ),
            Route(
                lat = 59.86715,
                lng = 30.26168,
                rotation = 23.0F
            ),
            Route(
                lat = 59.8671717,
                lng = 30.2616983,
                rotation = 23.0F
            ),
            Route(
                lat = 59.8672167,
                lng = 30.2617383,
                rotation = 23.0F
            ),
            Route(
                lat = 59.8672433,
                lng = 30.26174,
                rotation = 0.0F
            ),
            Route(
                lat = 59.8672683,
                lng = 30.26174,
                rotation = 0.0F
            ),
            Route(
                lat = 59.8672933,
                lng = 30.26174,
                rotation = 0.0F
            ),
            Route(
                lat = 59.8673217,
                lng = 30.2617217,
                rotation = 339.0F
            ),
            Route(
                lat = 59.867345,
                lng = 30.261705,
                rotation = 339.0F
            ),
            Route(
                lat = 59.8673683,
                lng = 30.2616867,
                rotation = 339.0F
            ),
            Route(
                lat = 59.8674017,
                lng = 30.2616567,
                rotation = 333.0F
            ),
            Route(
                lat = 59.8674233,
                lng = 30.261635,
                rotation = 333.0F
            ),
            Route(
                lat = 59.86744,
                lng = 30.26162,
                rotation = 333.0F
            ),
            Route(
                lat = 59.8674883,
                lng = 30.2616083,
                rotation = 353.0F
            ),
            Route(
                lat = 59.8675133,
                lng = 30.2616017,
                rotation = 353.0F
            ),
            Route(
                lat = 59.8675383,
                lng = 30.2615967,
                rotation = 353.0F
            ),
            Route(
                lat = 59.8675383,
                lng = 30.2615967,
                rotation = 353.0F
            )
        )

        return list
    }

    fun getNextRouteFromFirstList(): Route? {
        val route = firstRouteList.getOrNull(firstListNextIndex)
        firstListNextIndex = firstListNextIndex + 1

        return route
    }

    fun getSecondRouteList(): List<Route> {

        val list = listOf(
            Route(
                lat = 59.8668733,
                lng = 30.26162,
                rotation = 352.0F
            ),
            Route(
                lat = 59.86801,
                lng = 30.2614,
                rotation = 165.0F
            ),
            Route(
                lat = 59.8679833,
                lng = 30.2614117,
                rotation = 165.0F
            ),
            Route(
                lat = 59.86797,
                lng = 30.26142,
                rotation = 165.0F
            ),
            Route(
                lat = 59.86795,
                lng = 30.26143,
                rotation = 165.0F
            ),
            Route(
                lat = 59.8679233,
                lng = 30.2614383,
                rotation = 170.0F
            ),
            Route(
                lat = 59.8679,
                lng = 30.26146,
                rotation = 153.0F
            ),
            Route(
                lat = 59.86789,
                lng = 30.26149,
                rotation = 90.0F
            ),
            Route(
                lat = 59.86788,
                lng = 30.26151,
                rotation = 134.0F
            ),
            Route(
                lat = 59.86788,
                lng = 30.2615483,
                rotation = 90.0F
            ),
            Route(
                lat = 59.86788,
                lng = 30.2615483,
                rotation = 90.0F
            ),
            Route(
                lat = 59.86788,
                lng = 30.26156,
                rotation = 90.0F
            ),
            Route(
                lat = 59.86788,
                lng = 30.2615783,
                rotation = 86.0F
            ),
            Route(
                lat = 59.86788,
                lng = 30.2615983,
                rotation = 86.0F
            ),
            Route(
                lat = 59.8678817,
                lng = 30.2616167,
                rotation = 86.0F
            ),
            Route(
                lat = 59.8678817,
                lng = 30.2616367,
                rotation = 86.0F
            ),
            Route(
                lat = 59.8678817,
                lng = 30.2616567,
                rotation = 86.0F
            ),
            Route(
                lat = 59.8678833,
                lng = 30.261675,
                rotation = 86.0F
            ),
            Route(
                lat = 59.8678833,
                lng = 30.261695,
                rotation = 86.0F
            ),
            Route(
                lat = 59.8678833,
                lng = 30.261715,
                rotation = 86.0F
            ),
            Route(
                lat = 59.867885,
                lng = 30.2617333,
                rotation = 86.0F
            ),
            Route(
                lat = 59.867885,
                lng = 30.2617533,
                rotation = 86.0F
            ),
            Route(
                lat = 59.867885,
                lng = 30.2617733,
                rotation = 86.0F
            ),
            Route(
                lat = 59.8678867,
                lng = 30.2617917,
                rotation = 86.0F
            ),
            Route(
                lat = 59.8678867,
                lng = 30.2618117,
                rotation = 86.0F
            ),
            Route(
                lat = 59.8678867,
                lng = 30.2618317,
                rotation = 86.0F
            ),
            Route(
                lat = 59.8678883,
                lng = 30.26185,
                rotation = 86.0F
            ),
            Route(
                lat = 59.8678883,
                lng = 30.26187,
                rotation = 86.0F
            ),
            Route(
                lat = 59.86789,
                lng = 30.26189,
                rotation = 86.0F
            ),
            Route(
                lat = 59.8678933,
                lng = 30.2619267,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8678983,
                lng = 30.261965,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8679033,
                lng = 30.2620017,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8679083,
                lng = 30.26204,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8679133,
                lng = 30.2620767,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8679183,
                lng = 30.262115,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8679233,
                lng = 30.2621533,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8679283,
                lng = 30.26219,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8679333,
                lng = 30.2622283,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8679383,
                lng = 30.262265,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8679433,
                lng = 30.2623033,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8679483,
                lng = 30.2623417,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8679533,
                lng = 30.2623783,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8679583,
                lng = 30.2624167,
                rotation = 75.0F
            ),
            Route(
                lat = 59.8679167,
                lng = 30.2624283,
                rotation = 173.0F
            ),
            Route(
                lat = 59.8678733,
                lng = 30.2624383,
                rotation = 173.0F
            ),
            Route(
                lat = 59.8678317,
                lng = 30.2624467,
                rotation = 173.0F
            ),
            Route(
                lat = 59.8677883,
                lng = 30.2624567,
                rotation = 173.0F
            ),
            Route(
                lat = 59.8677467,
                lng = 30.262465,
                rotation = 173.0F
            ),
            Route(
                lat = 59.8677033,
                lng = 30.262475,
                rotation = 173.0F
            ),
            Route(
                lat = 59.86766,
                lng = 30.2624833,
                rotation = 173.0F
            ),
            Route(
                lat = 59.8676183,
                lng = 30.2624933,
                rotation = 173.0F
            ),
            Route(
                lat = 59.867575,
                lng = 30.2625033,
                rotation = 173.0F
            ),
            Route(
                lat = 59.8675333,
                lng = 30.2625117,
                rotation = 173.0F
            ),
            Route(
                lat = 59.86749,
                lng = 30.2625217,
                rotation = 173.0F
            ),
            Route(
                lat = 59.8674483,
                lng = 30.26253,
                rotation = 173.0F
            ),
            Route(
                lat = 59.867405,
                lng = 30.26254,
                rotation = 173.0F
            ),
            Route(
                lat = 59.8673617,
                lng = 30.2625483,
                rotation = 173.0F
            ),
            Route(
                lat = 59.8673617,
                lng = 30.2625483,
                rotation = 173.0F
            ),
            Route(
                lat = 59.8673617,
                lng = 30.2625483,
                rotation = 173.0F
            )
        )
        return list
    }

    fun getNextRouteFromSecondList(): Route? {
        val route = secondRouteList.getOrNull(secondListNextIndex)
        secondListNextIndex = secondListNextIndex + 1

        return route
    }
}
