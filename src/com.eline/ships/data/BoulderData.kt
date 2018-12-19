import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val boulderData = ShipData(
        "Boulder",
        7, 15, 10,
        0,
        0,
        900.0,
        0,
        1,
        20,
        20,
        30,
        0,
        0,

        listOf(
                ShipPoint(-18, 37, -11, 31, 0, 1, 5, 9),
                ShipPoint(30, 7, 12, 31, 1, 2, 5, 6),
                ShipPoint(28, -7, -12, 31, 2, 3, 6, 7),
                ShipPoint(2, 0, -39, 31, 3, 4, 7, 8),
                ShipPoint(-28, 34, -30, 31, 0, 4, 8, 9),
                ShipPoint(5, -10, 13, 31, 15, 15, 15, 15),
                ShipPoint(20, 17, -30, 31, 15, 15, 15, 15)
        ),

        listOf(
                ShipLine(31, 1, 5, 0, 1),
                ShipLine(31, 2, 6, 1, 2),
                ShipLine(31, 3, 7, 2, 3),
                ShipLine(31, 4, 8, 3, 4),
                ShipLine(31, 0, 9, 4, 0),
                ShipLine(31, 0, 1, 0, 5),
                ShipLine(31, 1, 2, 1, 5),
                ShipLine(31, 2, 3, 2, 5),
                ShipLine(31, 3, 4, 3, 5),
                ShipLine(31, 0, 4, 4, 5),
                ShipLine(31, 5, 9, 0, 6),
                ShipLine(31, 5, 6, 1, 6),
                ShipLine(31, 6, 7, 2, 6),
                ShipLine(31, 7, 8, 3, 6),
                ShipLine(31, 8, 9, 4, 6)
        ),

        listOf(
                ShipFaceNormal(31, -15, -3, 8),
                ShipFaceNormal(31, -7, 12, 30),
                ShipFaceNormal(31, 32, -47, 24),
                ShipFaceNormal(31, -3, -39, -7),
                ShipFaceNormal(31, -5, -4, -1),
                ShipFaceNormal(31, 49, 84, 8),
                ShipFaceNormal(31, 112, 21, -21),
                ShipFaceNormal(31, 76, -35, -82),
                ShipFaceNormal(31, 22, 56, -137),
                ShipFaceNormal(31, 40, 110, -38)
        )

)