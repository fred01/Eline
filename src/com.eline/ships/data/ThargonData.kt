import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val thargonData = ShipData(
        "Thargon",
        10, 15, 7,
        0,
        15,
        1600.0,
        0,
        50,
        20,
        20,
        30,
        0,
        8,

        listOf(
                ShipPoint(-9, 0, 40, 31, 0, 1, 5, 5),
                ShipPoint(-9, -38, 12, 31, 0, 1, 2, 2),
                ShipPoint(-9, -24, -32, 31, 0, 2, 3, 3),
                ShipPoint(-9, 24, -32, 31, 0, 3, 4, 4),
                ShipPoint(-9, 38, 12, 31, 0, 4, 5, 5),
                ShipPoint(9, 0, -8, 31, 1, 5, 6, 6),
                ShipPoint(9, -10, -15, 31, 1, 2, 6, 6),
                ShipPoint(9, -6, -26, 31, 2, 3, 6, 6),
                ShipPoint(9, 6, -26, 31, 3, 4, 6, 6),
                ShipPoint(9, 10, -15, 31, 4, 5, 6, 6)
        ),

        listOf(
                ShipLine(31, 1, 0, 0, 1),
                ShipLine(31, 2, 0, 1, 2),
                ShipLine(31, 3, 0, 2, 3),
                ShipLine(31, 4, 0, 3, 4),
                ShipLine(31, 5, 0, 0, 4),
                ShipLine(31, 5, 1, 0, 5),
                ShipLine(31, 2, 1, 1, 6),
                ShipLine(31, 3, 2, 2, 7),
                ShipLine(31, 4, 3, 3, 8),
                ShipLine(31, 5, 4, 4, 9),
                ShipLine(31, 6, 1, 5, 6),
                ShipLine(31, 6, 2, 6, 7),
                ShipLine(31, 6, 3, 7, 8),
                ShipLine(31, 6, 4, 8, 9),
                ShipLine(31, 6, 5, 9, 5)
        ),

        listOf(
                ShipFaceNormal(31, -36, 0, 0),
                ShipFaceNormal(31, 20, -5, 7),
                ShipFaceNormal(31, 46, -42, -14),
                ShipFaceNormal(31, 36, 0, -104),
                ShipFaceNormal(31, 46, 42, -14),
                ShipFaceNormal(31, 20, 5, 7),
                ShipFaceNormal(31, 36, 0, 0)
        )

)