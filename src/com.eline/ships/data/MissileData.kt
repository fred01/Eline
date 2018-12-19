import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val missileData = ShipData(
        "Missile",
        17, 24, 9,
        0,
        0,
        1600.0,
        0,
        0,
        14,
        2,
        44,
        0,
        0,

        listOf(
                ShipPoint(0, 0, 68, 31, 1, 0, 3, 2),
                ShipPoint(8, -8, 36, 31, 2, 1, 5, 4),
                ShipPoint(8, 8, 36, 31, 3, 2, 7, 4),
                ShipPoint(-8, 8, 36, 31, 3, 0, 7, 6),
                ShipPoint(-8, -8, 36, 31, 1, 0, 6, 5),
                ShipPoint(8, 8, -44, 31, 7, 4, 8, 8),
                ShipPoint(8, -8, -44, 31, 5, 4, 8, 8),
                ShipPoint(-8, -8, -44, 31, 6, 5, 8, 8),
                ShipPoint(-8, 8, -44, 31, 7, 6, 8, 8),
                ShipPoint(12, 12, -44, 8, 7, 4, 8, 8),
                ShipPoint(12, -12, -44, 8, 5, 4, 8, 8),
                ShipPoint(-12, -12, -44, 8, 6, 5, 8, 8),
                ShipPoint(-12, 12, -44, 8, 7, 6, 8, 8),
                ShipPoint(-8, 8, -12, 8, 7, 6, 7, 7),
                ShipPoint(-8, -8, -12, 8, 6, 5, 6, 6),
                ShipPoint(8, 8, -12, 8, 7, 4, 7, 7),
                ShipPoint(8, -8, -12, 8, 5, 4, 5, 5)
        ),

        listOf(
                ShipLine(31, 2, 1, 0, 1),
                ShipLine(31, 3, 2, 0, 2),
                ShipLine(31, 3, 0, 0, 3),
                ShipLine(31, 1, 0, 0, 4),
                ShipLine(31, 2, 4, 1, 2),
                ShipLine(31, 5, 1, 1, 4),
                ShipLine(31, 6, 0, 3, 4),
                ShipLine(31, 7, 3, 2, 3),
                ShipLine(31, 7, 4, 2, 5),
                ShipLine(31, 5, 4, 1, 6),
                ShipLine(31, 6, 5, 4, 7),
                ShipLine(31, 7, 6, 3, 8),
                ShipLine(31, 8, 6, 7, 8),
                ShipLine(31, 8, 7, 5, 8),
                ShipLine(31, 8, 4, 5, 6),
                ShipLine(31, 8, 5, 6, 7),
                ShipLine(8, 8, 5, 6, 10),
                ShipLine(8, 8, 7, 5, 9),
                ShipLine(8, 8, 7, 8, 12),
                ShipLine(8, 8, 5, 7, 11),
                ShipLine(8, 7, 4, 9, 15),
                ShipLine(8, 5, 4, 10, 16),
                ShipLine(8, 7, 6, 12, 13),
                ShipLine(8, 6, 5, 11, 14)
        ),

        listOf(
                ShipFaceNormal(31, -64, 0, 16),
                ShipFaceNormal(31, 0, -64, 16),
                ShipFaceNormal(31, 64, 0, 16),
                ShipFaceNormal(31, 0, 64, 16),
                ShipFaceNormal(31, 32, 0, 0),
                ShipFaceNormal(31, 0, -32, 0),
                ShipFaceNormal(31, -32, 0, 0),
                ShipFaceNormal(31, 0, 32, 0),
                ShipFaceNormal(31, 0, 0, -176)
        )

)