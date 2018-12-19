import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val coriolisData = ShipData(
        "Coriolis Space Station",
        16, 28, 14,
        0,
        0,
        25600.0,
        0,
        0,
        120,
        240,
        0,
        6,
        3,

        listOf(
                ShipPoint(160, 0, 160, 31, 1, 0, 6, 2),
                ShipPoint(0, 160, 160, 31, 2, 0, 8, 3),
                ShipPoint(-160, 0, 160, 31, 3, 0, 7, 4),
                ShipPoint(0, -160, 160, 31, 1, 0, 5, 4),
                ShipPoint(160, -160, 0, 31, 5, 1, 10, 6),
                ShipPoint(160, 160, 0, 31, 6, 2, 11, 8),
                ShipPoint(-160, 160, 0, 31, 7, 3, 12, 8),
                ShipPoint(-160, -160, 0, 31, 5, 4, 9, 7),
                ShipPoint(160, 0, -160, 31, 10, 6, 13, 11),
                ShipPoint(0, 160, -160, 31, 11, 8, 13, 12),
                ShipPoint(-160, 0, -160, 31, 9, 7, 13, 12),
                ShipPoint(0, -160, -160, 31, 9, 5, 13, 10),
                ShipPoint(10, -30, 160, 30, 0, 0, 0, 0),
                ShipPoint(10, 30, 160, 30, 0, 0, 0, 0),
                ShipPoint(-10, 30, 160, 30, 0, 0, 0, 0),
                ShipPoint(-10, -30, 160, 30, 0, 0, 0, 0)
        ),

        listOf(
                ShipLine(31, 1, 0, 0, 3),
                ShipLine(31, 2, 0, 0, 1),
                ShipLine(31, 3, 0, 1, 2),
                ShipLine(31, 4, 0, 2, 3),
                ShipLine(31, 5, 1, 3, 4),
                ShipLine(31, 6, 1, 0, 4),
                ShipLine(31, 6, 2, 0, 5),
                ShipLine(31, 8, 2, 5, 1),
                ShipLine(31, 8, 3, 1, 6),
                ShipLine(31, 7, 3, 2, 6),
                ShipLine(31, 7, 4, 2, 7),
                ShipLine(31, 5, 4, 3, 7),
                ShipLine(31, 13, 10, 8, 11),
                ShipLine(31, 13, 11, 8, 9),
                ShipLine(31, 13, 12, 9, 10),
                ShipLine(31, 13, 9, 10, 11),
                ShipLine(31, 10, 5, 4, 11),
                ShipLine(31, 10, 6, 4, 8),
                ShipLine(31, 11, 6, 5, 8),
                ShipLine(31, 11, 8, 5, 9),
                ShipLine(31, 12, 8, 6, 9),
                ShipLine(31, 12, 7, 6, 10),
                ShipLine(31, 9, 7, 7, 10),
                ShipLine(31, 9, 5, 7, 11),
                ShipLine(30, 0, 0, 12, 13),
                ShipLine(30, 0, 0, 13, 14),
                ShipLine(30, 0, 0, 14, 15),
                ShipLine(30, 0, 0, 15, 12)
        ),

        listOf(
                ShipFaceNormal(31, 0, 0, 160),
                ShipFaceNormal(31, 107, -107, 107),
                ShipFaceNormal(31, 107, 107, 107),
                ShipFaceNormal(31, -107, 107, 107),
                ShipFaceNormal(31, -107, -107, 107),
                ShipFaceNormal(31, 0, -160, 0),
                ShipFaceNormal(31, 160, 0, 0),
                ShipFaceNormal(31, -160, 0, 0),
                ShipFaceNormal(31, 0, 160, 0),
                ShipFaceNormal(31, -107, -107, -107),
                ShipFaceNormal(31, 107, -107, -107),
                ShipFaceNormal(31, 107, 107, -107),
                ShipFaceNormal(31, -107, 107, -107),
                ShipFaceNormal(31, 0, 0, -160)
        )

)