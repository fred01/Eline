import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val anacndaData = ShipData(
        "Anaconda",
        15, 25, 12,
        7,
        0,
        10000.0,
        12,
        0,
        36,
        252,
        14,
        7,
        31,

        listOf(
                ShipPoint(0, 7, -58, 30, 0, 1, 5, 5),
                ShipPoint(-43, -13, -37, 30, 0, 1, 2, 2),
                ShipPoint(-26, -47, -3, 30, 0, 2, 3, 3),
                ShipPoint(26, -47, -3, 30, 0, 3, 4, 4),
                ShipPoint(43, -13, -37, 30, 0, 4, 5, 5),
                ShipPoint(0, 48, -49, 30, 1, 5, 6, 6),
                ShipPoint(-69, 15, -15, 30, 1, 2, 7, 7),
                ShipPoint(-43, -39, 40, 31, 2, 3, 8, 8),
                ShipPoint(43, -39, 40, 31, 3, 4, 9, 9),
                ShipPoint(69, 15, -15, 30, 4, 5, 10, 10),
                ShipPoint(-43, 53, -23, 31, 15, 15, 15, 15),
                ShipPoint(-69, -1, 32, 31, 2, 7, 8, 8),
                ShipPoint(0, 0, 254, 31, 15, 15, 15, 15),
                ShipPoint(69, -1, 32, 31, 4, 9, 10, 10),
                ShipPoint(43, 53, -23, 31, 15, 15, 15, 15)
        ),

        listOf(
                ShipLine(30, 0, 1, 0, 1),
                ShipLine(30, 0, 2, 1, 2),
                ShipLine(30, 0, 3, 2, 3),
                ShipLine(30, 0, 4, 3, 4),
                ShipLine(30, 0, 5, 0, 4),
                ShipLine(29, 1, 5, 0, 5),
                ShipLine(29, 1, 2, 1, 6),
                ShipLine(29, 2, 3, 2, 7),
                ShipLine(29, 3, 4, 3, 8),
                ShipLine(29, 4, 5, 4, 9),
                ShipLine(30, 1, 6, 5, 10),
                ShipLine(30, 1, 7, 6, 10),
                ShipLine(30, 2, 7, 6, 11),
                ShipLine(30, 2, 8, 7, 11),
                ShipLine(31, 3, 8, 7, 12),
                ShipLine(31, 3, 9, 8, 12),
                ShipLine(30, 4, 9, 8, 13),
                ShipLine(30, 4, 10, 9, 13),
                ShipLine(30, 5, 10, 9, 14),
                ShipLine(30, 5, 6, 5, 14),
                ShipLine(30, 6, 11, 10, 14),
                ShipLine(31, 7, 11, 10, 12),
                ShipLine(31, 7, 8, 11, 12),
                ShipLine(31, 9, 10, 12, 13),
                ShipLine(31, 10, 11, 12, 14)
        ),

        listOf(
                ShipFaceNormal(30, 0, -51, -49),
                ShipFaceNormal(30, -51, 18, -87),
                ShipFaceNormal(30, -77, -57, -19),
                ShipFaceNormal(31, 0, -90, 16),
                ShipFaceNormal(30, 77, -57, -19),
                ShipFaceNormal(30, 51, 18, -87),
                ShipFaceNormal(30, 0, 111, -20),
                ShipFaceNormal(31, -97, 72, 24),
                ShipFaceNormal(31, -108, -68, 34),
                ShipFaceNormal(31, 108, -68, 34),
                ShipFaceNormal(31, 97, 72, 24),
                ShipFaceNormal(31, 0, 94, 18)
        )

)