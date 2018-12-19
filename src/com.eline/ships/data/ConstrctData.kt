import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val constrctData = ShipData(
        "Constrictor",
        17, 24, 10,
        3,
        0,
        4225.0,
        0,
        0,
        45,
        252,
        36,
        4,
        26,

        listOf(
                ShipPoint(20, -7, 80, 31, 0, 2, 9, 9),
                ShipPoint(-20, -7, 80, 31, 0, 1, 9, 9),
                ShipPoint(-54, -7, 40, 31, 1, 4, 9, 9),
                ShipPoint(-54, -7, -40, 31, 4, 5, 8, 9),
                ShipPoint(-20, 13, -40, 31, 5, 6, 8, 8),
                ShipPoint(20, 13, -40, 31, 6, 7, 8, 8),
                ShipPoint(54, -7, -40, 31, 3, 7, 8, 9),
                ShipPoint(54, -7, 40, 31, 2, 3, 9, 9),
                ShipPoint(20, 13, 5, 31, 15, 15, 15, 15),
                ShipPoint(-20, 13, 5, 31, 15, 15, 15, 15),
                ShipPoint(20, -7, 62, 18, 9, 9, 9, 9),
                ShipPoint(-20, -7, 62, 18, 9, 9, 9, 9),
                ShipPoint(25, -7, -25, 18, 9, 9, 9, 9),
                ShipPoint(-25, -7, -25, 18, 9, 9, 9, 9),
                ShipPoint(15, -7, -15, 10, 9, 9, 9, 9),
                ShipPoint(-15, -7, -15, 10, 9, 9, 9, 9),
                ShipPoint(0, -7, 0, 0, 9, 15, 0, 1)
        ),

        listOf(
                ShipLine(31, 0, 9, 0, 1),
                ShipLine(31, 1, 9, 1, 2),
                ShipLine(31, 0, 1, 1, 9),
                ShipLine(31, 0, 2, 0, 8),
                ShipLine(31, 2, 9, 0, 7),
                ShipLine(31, 2, 3, 7, 8),
                ShipLine(31, 1, 4, 2, 9),
                ShipLine(31, 4, 9, 2, 3),
                ShipLine(31, 3, 9, 6, 7),
                ShipLine(31, 3, 7, 6, 8),
                ShipLine(31, 6, 7, 5, 8),
                ShipLine(31, 5, 6, 4, 9),
                ShipLine(31, 4, 5, 3, 9),
                ShipLine(31, 5, 8, 3, 4),
                ShipLine(31, 6, 8, 4, 5),
                ShipLine(31, 7, 8, 5, 6),
                ShipLine(31, 8, 9, 3, 6),
                ShipLine(31, 0, 6, 8, 9),
                ShipLine(18, 9, 9, 10, 12),
                ShipLine(5, 9, 9, 12, 14),
                ShipLine(10, 9, 9, 14, 10),
                ShipLine(10, 9, 9, 11, 15),
                ShipLine(5, 9, 9, 13, 15),
                ShipLine(18, 9, 9, 11, 13)
        ),

        listOf(
                ShipFaceNormal(31, 0, 55, 15),
                ShipFaceNormal(31, -24, 75, 20),
                ShipFaceNormal(31, 24, 75, 20),
                ShipFaceNormal(31, 44, 75, 0),
                ShipFaceNormal(31, -44, 75, 0),
                ShipFaceNormal(31, -44, 75, 0),
                ShipFaceNormal(31, 0, 53, 0),
                ShipFaceNormal(31, 44, 75, 0),
                ShipFaceNormal(31, 0, 0, -160),
                ShipFaceNormal(31, 0, -27, 0)
        )

)