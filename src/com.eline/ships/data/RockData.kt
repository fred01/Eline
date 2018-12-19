import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val rockData = ShipData(
        "Rock",
        4, 6, 4,
        0,
        11,
        256.0,
        0,
        0,
        8,
        20,
        10,
        0,
        0,

        listOf(
                ShipPoint(-24, -25, 16, 31, 1, 2, 3, 3),
                ShipPoint(0, 12, -10, 31, 0, 2, 3, 3),
                ShipPoint(11, -6, 2, 31, 0, 1, 3, 3),
                ShipPoint(12, 42, 7, 31, 0, 1, 2, 2)
        ),

        listOf(
                ShipLine(31, 2, 3, 0, 1),
                ShipLine(31, 0, 3, 1, 2),
                ShipLine(31, 0, 1, 2, 3),
                ShipLine(31, 1, 2, 3, 0),
                ShipLine(31, 1, 3, 0, 2),
                ShipLine(31, 0, 2, 3, 1)
        ),

        listOf(
                ShipFaceNormal(18, 30, 0, 0),
                ShipFaceNormal(20, 22, 32, -8),
                ShipFaceNormal(0, 0, 2, 0),
                ShipFaceNormal(0, 17, 23, 95)
        )

)