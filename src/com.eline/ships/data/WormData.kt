import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val wormData = ShipData(
        "Worm",
        10, 16, 8,
        0,
        0,
        9801.0,
        0,
        0,
        19,
        30,
        23,
        0,
        4,

        listOf(
                ShipPoint(10, -10, 35, 31, 0, 2, 7, 7),
                ShipPoint(-10, -10, 35, 31, 0, 3, 7, 7),
                ShipPoint(5, 6, 15, 31, 0, 1, 2, 4),
                ShipPoint(-5, 6, 15, 31, 0, 1, 3, 5),
                ShipPoint(15, -10, 25, 31, 2, 4, 7, 7),
                ShipPoint(-15, -10, 25, 31, 3, 5, 7, 7),
                ShipPoint(26, -10, -25, 31, 4, 6, 7, 7),
                ShipPoint(-26, -10, -25, 31, 5, 6, 7, 7),
                ShipPoint(8, 14, -25, 31, 1, 4, 6, 6),
                ShipPoint(-8, 14, -25, 31, 1, 5, 6, 6)
        ),

        listOf(
                ShipLine(31, 0, 7, 0, 1),
                ShipLine(31, 3, 7, 1, 5),
                ShipLine(31, 5, 7, 5, 7),
                ShipLine(31, 6, 7, 7, 6),
                ShipLine(31, 4, 7, 6, 4),
                ShipLine(31, 2, 7, 4, 0),
                ShipLine(31, 0, 2, 0, 2),
                ShipLine(31, 0, 3, 1, 3),
                ShipLine(31, 2, 4, 4, 2),
                ShipLine(31, 3, 5, 5, 3),
                ShipLine(31, 1, 4, 2, 8),
                ShipLine(31, 4, 6, 8, 6),
                ShipLine(31, 1, 5, 3, 9),
                ShipLine(31, 5, 6, 9, 7),
                ShipLine(31, 0, 1, 2, 3),
                ShipLine(31, 1, 6, 8, 9)
        ),

        listOf(
                ShipFaceNormal(31, 0, 88, 70),
                ShipFaceNormal(31, 0, 69, 14),
                ShipFaceNormal(31, 70, 66, 35),
                ShipFaceNormal(31, -70, 66, 35),
                ShipFaceNormal(31, 64, 49, 14),
                ShipFaceNormal(31, -64, 49, 14),
                ShipFaceNormal(31, 0, 0, -200),
                ShipFaceNormal(31, 0, -80, 0)
        )

)