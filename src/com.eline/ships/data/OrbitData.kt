import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val orbitData = ShipData(
        "Orbit Shuttle",
        19, 30, 13,
        15,
        0,
        2500.0,
        0,
        0,
        22,
        32,
        8,
        0,
        0,

        listOf(
                ShipPoint(0, -17, 23, 31, 15, 15, 15, 15),
                ShipPoint(-17, 0, 23, 31, 15, 15, 15, 15),
                ShipPoint(0, 18, 23, 31, 15, 15, 15, 15),
                ShipPoint(18, 0, 23, 31, 15, 15, 15, 15),
                ShipPoint(-20, -20, -27, 31, 1, 2, 3, 9),
                ShipPoint(-20, 20, -27, 31, 3, 4, 5, 9),
                ShipPoint(20, 20, -27, 31, 5, 6, 7, 9),
                ShipPoint(20, -20, -27, 31, 1, 7, 8, 9),
                ShipPoint(5, 0, -27, 16, 9, 9, 9, 9),
                ShipPoint(0, -2, -27, 16, 9, 9, 9, 9),
                ShipPoint(-5, 0, -27, 9, 9, 9, 9, 9),
                ShipPoint(0, 3, -27, 9, 9, 9, 9, 9),
                ShipPoint(0, -9, 35, 16, 0, 10, 11, 12),
                ShipPoint(3, -1, 31, 7, 15, 15, 0, 2),
                ShipPoint(4, 11, 25, 8, 0, 1, 15, 4),
                ShipPoint(11, 4, 25, 8, 10, 1, 3, 15),
                ShipPoint(-3, -1, 31, 7, 6, 11, 2, 3),
                ShipPoint(-3, 11, 25, 8, 15, 8, 12, 0),
                ShipPoint(-10, 4, 25, 8, 4, 15, 1, 8)
        ),

        listOf(
                ShipLine(31, 0, 2, 0, 1),
                ShipLine(31, 4, 10, 1, 2),
                ShipLine(31, 6, 11, 2, 3),
                ShipLine(31, 8, 12, 0, 3),
                ShipLine(31, 1, 8, 0, 7),
                ShipLine(24, 1, 2, 0, 4),
                ShipLine(31, 2, 3, 1, 4),
                ShipLine(24, 3, 4, 1, 5),
                ShipLine(31, 4, 5, 2, 5),
                ShipLine(12, 5, 6, 2, 6),
                ShipLine(31, 6, 7, 3, 6),
                ShipLine(24, 7, 8, 3, 7),
                ShipLine(31, 3, 9, 4, 5),
                ShipLine(31, 5, 9, 5, 6),
                ShipLine(31, 7, 9, 6, 7),
                ShipLine(31, 1, 9, 4, 7),
                ShipLine(16, 0, 12, 0, 12),
                ShipLine(16, 0, 10, 1, 12),
                ShipLine(16, 10, 11, 2, 12),
                ShipLine(16, 11, 12, 3, 12),
                ShipLine(16, 9, 9, 8, 9),
                ShipLine(7, 9, 9, 9, 10),
                ShipLine(9, 9, 9, 10, 11),
                ShipLine(7, 9, 9, 8, 11),
                ShipLine(5, 11, 11, 13, 14),
                ShipLine(8, 11, 11, 14, 15),
                ShipLine(7, 11, 11, 13, 15),
                ShipLine(5, 10, 10, 16, 17),
                ShipLine(8, 10, 10, 17, 18),
                ShipLine(7, 10, 10, 16, 18)
        ),

        listOf(
                ShipFaceNormal(31, -55, -55, 40),
                ShipFaceNormal(31, 0, -74, 4),
                ShipFaceNormal(31, -51, -51, 23),
                ShipFaceNormal(31, -74, 0, 4),
                ShipFaceNormal(31, -51, 51, 23),
                ShipFaceNormal(31, 0, 74, 4),
                ShipFaceNormal(31, 51, 51, 23),
                ShipFaceNormal(31, 74, 0, 4),
                ShipFaceNormal(31, 51, -51, 23),
                ShipFaceNormal(31, 0, 0, -107),
                ShipFaceNormal(31, -41, 41, 90),
                ShipFaceNormal(31, 41, 41, 90),
                ShipFaceNormal(31, 55, -55, 40)
        )

)