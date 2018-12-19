import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val geckoData = ShipData(
        "Gecko",
        12, 17, 9,
        0,
        0,
        9801.0,
        0,
        55,
        18,
        70,
        30,
        0,
        8,

        listOf(
                ShipPoint(-10, -4, 47, 31, 0, 3, 4, 5),
                ShipPoint(10, -4, 47, 31, 0, 1, 2, 3),
                ShipPoint(-16, 8, -23, 31, 0, 5, 6, 7),
                ShipPoint(16, 8, -23, 31, 0, 1, 7, 8),
                ShipPoint(-66, 0, -3, 31, 4, 5, 6, 6),
                ShipPoint(66, 0, -3, 31, 1, 2, 8, 8),
                ShipPoint(-20, -14, -23, 31, 3, 4, 6, 7),
                ShipPoint(20, -14, -23, 31, 2, 3, 7, 8),
                ShipPoint(-8, -6, 33, 16, 3, 3, 3, 3),
                ShipPoint(8, -6, 33, 17, 3, 3, 3, 3),
                ShipPoint(-8, -13, -16, 16, 3, 3, 3, 3),
                ShipPoint(8, -13, -16, 17, 3, 3, 3, 3)
        ),

        listOf(
                ShipLine(31, 0, 3, 0, 1),
                ShipLine(31, 1, 2, 1, 5),
                ShipLine(31, 1, 8, 5, 3),
                ShipLine(31, 0, 7, 3, 2),
                ShipLine(31, 5, 6, 2, 4),
                ShipLine(31, 4, 5, 4, 0),
                ShipLine(31, 2, 8, 5, 7),
                ShipLine(31, 3, 7, 7, 6),
                ShipLine(31, 4, 6, 6, 4),
                ShipLine(29, 0, 5, 0, 2),
                ShipLine(30, 0, 1, 1, 3),
                ShipLine(29, 3, 4, 0, 6),
                ShipLine(30, 2, 3, 1, 7),
                ShipLine(20, 6, 7, 2, 6),
                ShipLine(20, 7, 8, 3, 7),
                ShipLine(16, 3, 3, 8, 10),
                ShipLine(17, 3, 3, 9, 11)
        ),

        listOf(
                ShipFaceNormal(31, 0, 31, 5),
                ShipFaceNormal(31, 4, 45, 8),
                ShipFaceNormal(31, 25, -108, 19),
                ShipFaceNormal(31, 0, -84, 12),
                ShipFaceNormal(31, -25, -108, 19),
                ShipFaceNormal(31, -4, 45, 8),
                ShipFaceNormal(31, -88, 16, -214),
                ShipFaceNormal(31, 0, 0, -187),
                ShipFaceNormal(31, 88, 16, -214)
        )

)