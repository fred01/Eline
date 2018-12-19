import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val kraitData = ShipData(
        "Krait",
        17, 21, 6,
        1,
        0,
        3600.0,
        0,
        100,
        20,
        80,
        30,
        0,
        8,

        listOf(
                ShipPoint(0, 0, 96, 31, 0, 1, 2, 3),
                ShipPoint(0, 18, -48, 31, 0, 3, 4, 5),
                ShipPoint(0, -18, -48, 31, 1, 2, 4, 5),
                ShipPoint(90, 0, -3, 31, 0, 1, 4, 4),
                ShipPoint(-90, 0, -3, 31, 2, 3, 5, 5),
                ShipPoint(90, 0, 87, 30, 0, 1, 1, 1),
                ShipPoint(-90, 0, 87, 30, 2, 3, 3, 3),
                ShipPoint(0, 5, 53, 9, 0, 0, 3, 3),
                ShipPoint(0, 7, 38, 6, 0, 0, 3, 3),
                ShipPoint(-18, 7, 19, 9, 3, 3, 3, 3),
                ShipPoint(18, 7, 19, 9, 0, 0, 0, 0),
                ShipPoint(18, 11, -39, 8, 4, 4, 4, 4),
                ShipPoint(18, -11, -39, 8, 4, 4, 4, 4),
                ShipPoint(36, 0, -30, 8, 4, 4, 4, 4),
                ShipPoint(-18, 11, -39, 8, 5, 5, 5, 5),
                ShipPoint(-18, -11, -39, 8, 5, 5, 5, 5),
                ShipPoint(-36, 0, -30, 8, 5, 5, 5, 5)
        ),

        listOf(
                ShipLine(31, 0, 3, 0, 1),
                ShipLine(31, 1, 2, 0, 2),
                ShipLine(31, 0, 1, 0, 3),
                ShipLine(31, 2, 3, 0, 4),
                ShipLine(31, 3, 5, 1, 4),
                ShipLine(31, 2, 5, 4, 2),
                ShipLine(31, 1, 4, 2, 3),
                ShipLine(31, 0, 4, 3, 1),
                ShipLine(30, 0, 1, 3, 5),
                ShipLine(30, 2, 3, 4, 6),
                ShipLine(8, 4, 5, 1, 2),
                ShipLine(9, 0, 0, 7, 10),
                ShipLine(6, 0, 0, 8, 10),
                ShipLine(9, 3, 3, 7, 9),
                ShipLine(6, 3, 3, 8, 9),
                ShipLine(8, 4, 4, 11, 13),
                ShipLine(8, 4, 4, 13, 12),
                ShipLine(7, 4, 4, 12, 11),
                ShipLine(7, 5, 5, 14, 15),
                ShipLine(8, 5, 5, 15, 16),
                ShipLine(8, 5, 5, 16, 14)
        ),

        listOf(
                ShipFaceNormal(31, 3, 24, 3),
                ShipFaceNormal(31, 3, -24, 3),
                ShipFaceNormal(31, -3, -24, 3),
                ShipFaceNormal(31, -3, 24, 3),
                ShipFaceNormal(31, 38, 0, -77),
                ShipFaceNormal(31, -38, 0, -77)
        )

)