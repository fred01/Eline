import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val alloyData = ShipData(
        "Alloy",
        4, 4, 1,
        0,
        8,
        100.0,
        0,
        0,
        5,
        16,
        16,
        0,
        0,

        listOf(
                ShipPoint(-15, -22, -9, 31, 15, 15, 15, 15),
                ShipPoint(-15, 38, -9, 31, 15, 15, 15, 15),
                ShipPoint(19, 32, 11, 20, 15, 15, 15, 15),
                ShipPoint(10, -46, 6, 20, 15, 15, 15, 15)
        ),

        listOf(
                ShipLine(31, 15, 15, 0, 1),
                ShipLine(16, 15, 15, 1, 2),
                ShipLine(20, 15, 15, 2, 3),
                ShipLine(16, 15, 15, 3, 0)
        ),

        listOf(
                ShipFaceNormal(0, 0, 0, 0)
        )

)