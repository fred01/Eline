import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val sidewndData = ShipData(
        "Sidewinder",
        10, 15, 7,
        0,
        0,
        4225.0,
        0,
        50,
        20,
        70,
        37,
        0,
        8,

        listOf(
                ShipPoint(-32, 0, 36, 31, 1, 0, 5, 4),
                ShipPoint(32, 0, 36, 31, 2, 0, 6, 5),
                ShipPoint(64, 0, -28, 31, 3, 2, 6, 6),
                ShipPoint(-64, 0, -28, 31, 3, 1, 4, 4),
                ShipPoint(0, 16, -28, 31, 1, 0, 3, 2),
                ShipPoint(0, -16, -28, 31, 4, 3, 6, 5),
                ShipPoint(-12, 6, -28, 15, 3, 3, 3, 3),
                ShipPoint(12, 6, -28, 15, 3, 3, 3, 3),
                ShipPoint(12, -6, -28, 12, 3, 3, 3, 3),
                ShipPoint(-12, -6, -28, 12, 3, 3, 3, 3)
        ),

        listOf(
                ShipLine(31, 5, 0, 0, 1),
                ShipLine(31, 6, 2, 1, 2),
                ShipLine(31, 2, 0, 1, 4),
                ShipLine(31, 1, 0, 0, 4),
                ShipLine(31, 4, 1, 0, 3),
                ShipLine(31, 3, 1, 3, 4),
                ShipLine(31, 3, 2, 2, 4),
                ShipLine(31, 4, 3, 3, 5),
                ShipLine(31, 6, 3, 2, 5),
                ShipLine(31, 6, 5, 1, 5),
                ShipLine(31, 5, 4, 0, 5),
                ShipLine(15, 3, 3, 6, 7),
                ShipLine(12, 3, 3, 7, 8),
                ShipLine(12, 3, 3, 6, 9),
                ShipLine(12, 3, 3, 8, 9)
        ),

        listOf(
                ShipFaceNormal(31, 0, 32, 8),
                ShipFaceNormal(31, -12, 47, 6),
                ShipFaceNormal(31, 12, 47, 6),
                ShipFaceNormal(31, 0, 0, -112),
                ShipFaceNormal(31, -12, -47, 6),
                ShipFaceNormal(31, 0, -32, 8),
                ShipFaceNormal(31, 12, -47, 6)
        )

)