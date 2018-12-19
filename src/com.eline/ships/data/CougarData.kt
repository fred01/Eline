import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val cougarData = ShipData(
        "Cougar",
        19, 25, 6,
        3,
        0,
        4900.0,
        0,
        0,
        34,
        252,
        40,
        4,
        26,

        listOf(
                ShipPoint(0, 5, 67, 31, 0, 2, 4, 4),
                ShipPoint(-20, 0, 40, 31, 0, 1, 2, 2),
                ShipPoint(-40, 0, -40, 31, 0, 1, 5, 5),
                ShipPoint(0, 14, -40, 30, 0, 4, 5, 5),
                ShipPoint(0, -14, -40, 30, 1, 2, 3, 5),
                ShipPoint(20, 0, 40, 31, 2, 3, 4, 4),
                ShipPoint(40, 0, -40, 31, 3, 4, 5, 5),
                ShipPoint(-36, 0, 56, 31, 0, 1, 1, 1),
                ShipPoint(-60, 0, -20, 31, 0, 1, 1, 1),
                ShipPoint(36, 0, 56, 31, 3, 4, 4, 4),
                ShipPoint(60, 0, -20, 31, 3, 4, 4, 4),
                ShipPoint(0, 7, 35, 18, 0, 0, 4, 4),
                ShipPoint(0, 8, 25, 20, 0, 0, 4, 4),
                ShipPoint(-12, 2, 45, 20, 0, 0, 0, 0),
                ShipPoint(12, 2, 45, 20, 4, 4, 4, 4),
                ShipPoint(-10, 6, -40, 20, 5, 5, 5, 5),
                ShipPoint(-10, -6, -40, 20, 5, 5, 5, 5),
                ShipPoint(10, -6, -40, 20, 5, 5, 5, 5),
                ShipPoint(10, 6, -40, 20, 5, 5, 5, 5)
        ),

        listOf(
                ShipLine(31, 0, 2, 0, 1),
                ShipLine(31, 0, 1, 1, 7),
                ShipLine(31, 0, 1, 7, 8),
                ShipLine(31, 0, 1, 8, 2),
                ShipLine(30, 0, 5, 2, 3),
                ShipLine(30, 4, 5, 3, 6),
                ShipLine(30, 1, 5, 2, 4),
                ShipLine(30, 3, 5, 4, 6),
                ShipLine(31, 3, 4, 6, 10),
                ShipLine(31, 3, 4, 10, 9),
                ShipLine(31, 3, 4, 9, 5),
                ShipLine(31, 2, 4, 5, 0),
                ShipLine(27, 0, 4, 0, 3),
                ShipLine(27, 1, 2, 1, 4),
                ShipLine(27, 2, 3, 5, 4),
                ShipLine(26, 0, 1, 1, 2),
                ShipLine(26, 3, 4, 5, 6),
                ShipLine(20, 0, 0, 12, 13),
                ShipLine(18, 0, 0, 13, 11),
                ShipLine(18, 4, 4, 11, 14),
                ShipLine(20, 4, 4, 14, 12),
                ShipLine(18, 5, 5, 15, 16),
                ShipLine(20, 5, 5, 16, 18),
                ShipLine(18, 5, 5, 18, 17),
                ShipLine(20, 5, 5, 17, 15)
        ),

        listOf(
                ShipFaceNormal(31, -16, 46, 4),
                ShipFaceNormal(31, -16, -46, 4),
                ShipFaceNormal(31, 0, -27, 5),
                ShipFaceNormal(31, 16, -46, 4),
                ShipFaceNormal(31, 16, 46, 4),
                ShipFaceNormal(30, 0, 0, -160)
        )

)