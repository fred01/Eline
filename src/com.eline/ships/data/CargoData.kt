import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val cargoData = ShipData(
        "Cargo Canister",
        10, 15, 7,
        0,
        0,
        400.0,
        0,
        0,
        12,
        17,
        15,
        0,
        0,

        listOf(
                ShipPoint(24, 16, 0, 31, 1, 0, 5, 5),
                ShipPoint(24, 5, 15, 31, 1, 0, 2, 2),
                ShipPoint(24, -13, 9, 31, 2, 0, 3, 3),
                ShipPoint(24, -13, -9, 31, 3, 0, 4, 4),
                ShipPoint(24, 5, -15, 31, 4, 0, 5, 5),
                ShipPoint(-24, 16, 0, 31, 5, 1, 6, 6),
                ShipPoint(-24, 5, 15, 31, 2, 1, 6, 6),
                ShipPoint(-24, -13, 9, 31, 3, 2, 6, 6),
                ShipPoint(-24, -13, -9, 31, 4, 3, 6, 6),
                ShipPoint(-24, 5, -15, 31, 5, 4, 6, 6)
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
                ShipFaceNormal(31, 96, 0, 0),
                ShipFaceNormal(31, 0, 41, 30),
                ShipFaceNormal(31, 0, -18, 48),
                ShipFaceNormal(31, 0, -51, 0),
                ShipFaceNormal(31, 0, -18, -48),
                ShipFaceNormal(31, 0, 41, -30),
                ShipFaceNormal(31, -96, 0, 0)
        )

)