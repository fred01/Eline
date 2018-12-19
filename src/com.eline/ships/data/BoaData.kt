import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val boaData = ShipData(
        "Boa",
        13, 24, 13,
        5,
        0,
        4900.0,
        0,
        0,
        40,
        250,
        24,
        4,
        14,

        listOf(
                ShipPoint(0, 0, 93, 31, 15, 15, 15, 15),
                ShipPoint(0, 40, -87, 24, 0, 2, 3, 3),
                ShipPoint(38, -25, -99, 24, 0, 1, 4, 4),
                ShipPoint(-38, -25, -99, 24, 1, 2, 5, 5),
                ShipPoint(-38, 40, -59, 31, 2, 3, 6, 9),
                ShipPoint(38, 40, -59, 31, 0, 3, 6, 11),
                ShipPoint(62, 0, -67, 31, 0, 4, 8, 11),
                ShipPoint(24, -65, -79, 31, 1, 4, 8, 10),
                ShipPoint(-24, -65, -79, 31, 1, 5, 7, 10),
                ShipPoint(-62, 0, -67, 31, 2, 5, 7, 9),
                ShipPoint(0, 7, -107, 22, 0, 2, 10, 10),
                ShipPoint(13, -9, -107, 22, 0, 1, 10, 10),
                ShipPoint(-13, -9, -107, 22, 1, 2, 12, 12)
        ),

        listOf(
                ShipLine(31, 6, 11, 0, 5),
                ShipLine(31, 8, 10, 0, 7),
                ShipLine(31, 7, 9, 0, 9),
                ShipLine(29, 6, 9, 0, 4),
                ShipLine(29, 8, 11, 0, 6),
                ShipLine(29, 7, 10, 0, 8),
                ShipLine(31, 3, 6, 4, 5),
                ShipLine(31, 0, 11, 5, 6),
                ShipLine(31, 4, 8, 6, 7),
                ShipLine(31, 1, 10, 7, 8),
                ShipLine(31, 5, 7, 8, 9),
                ShipLine(31, 2, 9, 4, 9),
                ShipLine(24, 2, 3, 1, 4),
                ShipLine(24, 0, 3, 1, 5),
                ShipLine(24, 2, 5, 3, 9),
                ShipLine(24, 1, 5, 3, 8),
                ShipLine(24, 0, 4, 2, 6),
                ShipLine(24, 1, 4, 2, 7),
                ShipLine(22, 0, 2, 1, 10),
                ShipLine(22, 0, 1, 2, 11),
                ShipLine(22, 1, 2, 3, 12),
                ShipLine(14, 0, 12, 10, 11),
                ShipLine(14, 1, 12, 11, 12),
                ShipLine(14, 2, 12, 12, 10)
        ),

        listOf(
                ShipFaceNormal(31, 43, 37, -60),
                ShipFaceNormal(31, 0, -45, -89),
                ShipFaceNormal(31, -43, 37, -60),
                ShipFaceNormal(31, 0, 40, 0),
                ShipFaceNormal(31, 62, -32, -20),
                ShipFaceNormal(31, -62, -32, -20),
                ShipFaceNormal(31, 0, 23, 6),
                ShipFaceNormal(31, -23, -15, 9),
                ShipFaceNormal(31, 23, -15, 9),
                ShipFaceNormal(31, -26, 13, 10),
                ShipFaceNormal(31, 0, -31, 12),
                ShipFaceNormal(31, 26, 13, 10),
                ShipFaceNormal(14, 0, 0, -107)
        )

)