import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val asp2Data = ShipData(
        "Asp MkII",
        19, 28, 12,
        0,
        0,
        3600.0,
        8,
        200,
        40,
        150,
        40,
        1,
        20,

        listOf(
                ShipPoint(0, -18, 0, 22, 0, 1, 2, 2),
                ShipPoint(0, -9, -45, 31, 1, 2, 11, 11),
                ShipPoint(43, 0, -45, 31, 1, 6, 11, 11),
                ShipPoint(69, -3, 0, 31, 1, 6, 7, 9),
                ShipPoint(43, -14, 28, 31, 0, 1, 7, 7),
                ShipPoint(-43, 0, -45, 31, 2, 5, 11, 11),
                ShipPoint(-69, -3, 0, 31, 2, 5, 8, 10),
                ShipPoint(-43, -14, 28, 31, 0, 2, 8, 8),
                ShipPoint(26, -7, 73, 31, 0, 4, 7, 9),
                ShipPoint(-26, -7, 73, 31, 0, 4, 8, 10),
                ShipPoint(43, 14, 28, 31, 3, 4, 6, 9),
                ShipPoint(-43, 14, 28, 31, 3, 4, 5, 10),
                ShipPoint(0, 9, -45, 31, 3, 5, 6, 11),
                ShipPoint(-17, 0, -45, 10, 11, 11, 11, 11),
                ShipPoint(17, 0, -45, 9, 11, 11, 11, 11),
                ShipPoint(0, -4, -45, 10, 11, 11, 11, 11),
                ShipPoint(0, 4, -45, 8, 11, 11, 11, 11),
                ShipPoint(0, -7, 73, 10, 0, 4, 0, 4),
                ShipPoint(0, -7, 83, 10, 0, 4, 0, 4)
        ),

        listOf(
                ShipLine(22, 1, 2, 0, 1),
                ShipLine(22, 0, 1, 0, 4),
                ShipLine(22, 0, 2, 0, 7),
                ShipLine(31, 1, 11, 1, 2),
                ShipLine(31, 1, 6, 2, 3),
                ShipLine(16, 7, 9, 3, 8),
                ShipLine(31, 0, 4, 8, 9),
                ShipLine(16, 8, 10, 6, 9),
                ShipLine(31, 2, 5, 5, 6),
                ShipLine(31, 2, 11, 1, 5),
                ShipLine(31, 1, 7, 3, 4),
                ShipLine(31, 0, 7, 4, 8),
                ShipLine(31, 2, 8, 6, 7),
                ShipLine(31, 0, 8, 7, 9),
                ShipLine(31, 6, 11, 2, 12),
                ShipLine(31, 5, 11, 5, 12),
                ShipLine(22, 3, 6, 10, 12),
                ShipLine(22, 3, 5, 11, 12),
                ShipLine(22, 3, 4, 10, 11),
                ShipLine(31, 5, 10, 6, 11),
                ShipLine(31, 4, 10, 9, 11),
                ShipLine(31, 6, 9, 3, 10),
                ShipLine(31, 4, 9, 8, 10),
                ShipLine(10, 11, 11, 13, 15),
                ShipLine(9, 11, 11, 15, 14),
                ShipLine(8, 11, 11, 14, 16),
                ShipLine(8, 11, 11, 16, 13),
                ShipLine(10, 0, 4, 18, 17)
        ),

        listOf(
                ShipFaceNormal(31, 0, -35, 5),
                ShipFaceNormal(31, 8, -38, -7),
                ShipFaceNormal(31, -8, -38, -7),
                ShipFaceNormal(22, 0, 24, -1),
                ShipFaceNormal(31, 0, 43, 19),
                ShipFaceNormal(31, -6, 28, -2),
                ShipFaceNormal(31, 6, 28, -2),
                ShipFaceNormal(31, 59, -64, 31),
                ShipFaceNormal(31, -59, -64, 31),
                ShipFaceNormal(31, 80, 46, 50),
                ShipFaceNormal(31, -80, 46, 50),
                ShipFaceNormal(31, 0, 0, -90)
        )

)