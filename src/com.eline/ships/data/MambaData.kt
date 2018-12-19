import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val mambaData = ShipData(
        "Mamba",
        25, 28, 5,
        1,
        0,
        4900.0,
        0,
        150,
        25,
        90,
        30,
        2,
        9,

        listOf(
                ShipPoint(0, 0, 64, 31, 1, 0, 3, 2),
                ShipPoint(-64, -8, -32, 31, 2, 0, 4, 4),
                ShipPoint(-32, 8, -32, 30, 2, 1, 4, 4),
                ShipPoint(32, 8, -32, 30, 3, 1, 4, 4),
                ShipPoint(64, -8, -32, 31, 3, 0, 4, 4),
                ShipPoint(-4, 4, 16, 14, 1, 1, 1, 1),
                ShipPoint(4, 4, 16, 14, 1, 1, 1, 1),
                ShipPoint(8, 3, 28, 13, 1, 1, 1, 1),
                ShipPoint(-8, 3, 28, 13, 1, 1, 1, 1),
                ShipPoint(-20, -4, 16, 20, 0, 0, 0, 0),
                ShipPoint(20, -4, 16, 20, 0, 0, 0, 0),
                ShipPoint(-24, -7, -20, 20, 0, 0, 0, 0),
                ShipPoint(-16, -7, -20, 16, 0, 0, 0, 0),
                ShipPoint(16, -7, -20, 16, 0, 0, 0, 0),
                ShipPoint(24, -7, -20, 20, 0, 0, 0, 0),
                ShipPoint(-8, 4, -32, 13, 4, 4, 4, 4),
                ShipPoint(8, 4, -32, 13, 4, 4, 4, 4),
                ShipPoint(8, -4, -32, 14, 4, 4, 4, 4),
                ShipPoint(-8, -4, -32, 14, 4, 4, 4, 4),
                ShipPoint(-32, 4, -32, 7, 4, 4, 4, 4),
                ShipPoint(32, 4, -32, 7, 4, 4, 4, 4),
                ShipPoint(36, -4, -32, 7, 4, 4, 4, 4),
                ShipPoint(-36, -4, -32, 7, 4, 4, 4, 4),
                ShipPoint(-38, 0, -32, 5, 4, 4, 4, 4),
                ShipPoint(38, 0, -32, 5, 4, 4, 4, 4)
        ),

        listOf(
                ShipLine(31, 2, 0, 0, 1),
                ShipLine(31, 3, 0, 0, 4),
                ShipLine(31, 4, 0, 1, 4),
                ShipLine(30, 4, 2, 1, 2),
                ShipLine(30, 4, 1, 2, 3),
                ShipLine(30, 4, 3, 3, 4),
                ShipLine(14, 1, 1, 5, 6),
                ShipLine(12, 1, 1, 6, 7),
                ShipLine(13, 1, 1, 7, 8),
                ShipLine(12, 1, 1, 5, 8),
                ShipLine(20, 0, 0, 9, 11),
                ShipLine(16, 0, 0, 9, 12),
                ShipLine(16, 0, 0, 10, 13),
                ShipLine(20, 0, 0, 10, 14),
                ShipLine(14, 0, 0, 13, 14),
                ShipLine(14, 0, 0, 11, 12),
                ShipLine(13, 4, 4, 15, 16),
                ShipLine(14, 4, 4, 17, 18),
                ShipLine(12, 4, 4, 15, 18),
                ShipLine(12, 4, 4, 16, 17),
                ShipLine(7, 4, 4, 20, 21),
                ShipLine(5, 4, 4, 20, 24),
                ShipLine(5, 4, 4, 21, 24),
                ShipLine(7, 4, 4, 19, 22),
                ShipLine(5, 4, 4, 19, 23),
                ShipLine(5, 4, 4, 22, 23),
                ShipLine(30, 2, 1, 0, 2),
                ShipLine(30, 3, 1, 0, 3)
        ),

        listOf(
                ShipFaceNormal(30, 0, -24, 2),
                ShipFaceNormal(30, 0, 24, 2),
                ShipFaceNormal(30, -32, 64, 16),
                ShipFaceNormal(30, 32, 64, 16),
                ShipFaceNormal(30, 0, 0, -127)
        )

)