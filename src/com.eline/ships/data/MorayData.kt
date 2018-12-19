import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val morayData = ShipData(
        "Moray Star Boat",
        14, 19, 9,
        1,
        0,
        900.0,
        0,
        50,
        40,
        100,
        25,
        0,
        8,

        listOf(
                ShipPoint(15, 0, 65, 31, 0, 2, 7, 8),
                ShipPoint(-15, 0, 65, 31, 0, 1, 6, 7),
                ShipPoint(0, 18, -40, 17, 15, 15, 15, 15),
                ShipPoint(-60, 0, 0, 31, 1, 3, 6, 6),
                ShipPoint(60, 0, 0, 31, 2, 5, 8, 8),
                ShipPoint(30, -27, -10, 24, 4, 5, 7, 8),
                ShipPoint(-30, -27, -10, 24, 3, 4, 6, 7),
                ShipPoint(-9, -4, -25, 7, 4, 4, 4, 4),
                ShipPoint(9, -4, -25, 7, 4, 4, 4, 4),
                ShipPoint(0, -18, -16, 7, 4, 4, 4, 4),
                ShipPoint(13, 3, 49, 5, 0, 0, 0, 0),
                ShipPoint(6, 0, 65, 5, 0, 0, 0, 0),
                ShipPoint(-13, 3, 49, 5, 0, 0, 0, 0),
                ShipPoint(-6, 0, 65, 5, 0, 0, 0, 0)
        ),

        listOf(
                ShipLine(31, 0, 7, 0, 1),
                ShipLine(31, 1, 6, 1, 3),
                ShipLine(24, 3, 6, 3, 6),
                ShipLine(24, 4, 7, 5, 6),
                ShipLine(24, 5, 8, 4, 5),
                ShipLine(31, 2, 8, 0, 4),
                ShipLine(15, 6, 7, 1, 6),
                ShipLine(15, 7, 8, 0, 5),
                ShipLine(15, 0, 2, 0, 2),
                ShipLine(15, 0, 1, 1, 2),
                ShipLine(17, 1, 3, 2, 3),
                ShipLine(17, 2, 5, 2, 4),
                ShipLine(13, 4, 5, 2, 5),
                ShipLine(13, 3, 4, 2, 6),
                ShipLine(5, 4, 4, 7, 8),
                ShipLine(7, 4, 4, 7, 9),
                ShipLine(7, 4, 4, 8, 9),
                ShipLine(5, 0, 0, 10, 11),
                ShipLine(5, 0, 0, 12, 13)
        ),

        listOf(
                ShipFaceNormal(31, 0, 43, 7),
                ShipFaceNormal(31, -10, 49, 7),
                ShipFaceNormal(31, 10, 49, 7),
                ShipFaceNormal(24, -59, -28, -101),
                ShipFaceNormal(24, 0, -52, -78),
                ShipFaceNormal(24, 59, -28, -101),
                ShipFaceNormal(31, -72, -99, 50),
                ShipFaceNormal(31, 0, -83, 30),
                ShipFaceNormal(31, 72, -99, 50)
        )

)