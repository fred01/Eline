import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val esccaps_data = ShipData(
        "Escape Capsule",
        4, 6, 4,
        0,
        2,
        256.0,
        0,
        0,
        8,
        17,
        8,
        0,
        0,

        listOf(
                ShipPoint(-7, 0, 36, 31, 1, 2, 3, 3),
                ShipPoint(-7, -14, -12, 31, 0, 2, 3, 3),
                ShipPoint(-7, 14, -12, 31, 0, 1, 3, 3),
                ShipPoint(21, 0, 0, 31, 0, 1, 2, 2)
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
                ShipFaceNormal(31, 52, 0, -122),
                ShipFaceNormal(31, 39, 103, 30),
                ShipFaceNormal(31, 39, -103, 30),
                ShipFaceNormal(31, -112, 0, 0)
        )

)