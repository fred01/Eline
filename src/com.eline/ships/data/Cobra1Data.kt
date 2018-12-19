import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val cobra1Data = ShipData(
        "Cobra MkI",
        11, 18, 10,
        3,
        0,
        9801.0,
        10,
        75,
        19,
        90,
        26,
        2,
        9,

        listOf(
                ShipPoint(-18, -1, 50, 31, 0, 1, 2, 3),
                ShipPoint(18, -1, 50, 31, 0, 1, 4, 5),
                ShipPoint(-66, 0, 7, 31, 2, 3, 8, 8),
                ShipPoint(66, 0, 7, 31, 4, 5, 9, 9),
                ShipPoint(-32, 12, -38, 31, 2, 6, 7, 8),
                ShipPoint(32, 12, -38, 31, 4, 6, 7, 9),
                ShipPoint(-54, -12, -38, 31, 1, 3, 7, 8),
                ShipPoint(54, -12, -38, 31, 1, 5, 7, 9),
                ShipPoint(0, 12, -6, 20, 0, 2, 4, 6),
                ShipPoint(0, -1, 50, 2, 0, 1, 1, 1),
                ShipPoint(0, -1, 60, 31, 0, 1, 1, 1)
        ),

        listOf(
                ShipLine(31, 0, 1, 1, 0),
                ShipLine(31, 2, 3, 0, 2),
                ShipLine(31, 3, 8, 2, 6),
                ShipLine(31, 1, 7, 6, 7),
                ShipLine(31, 5, 9, 7, 3),
                ShipLine(31, 4, 5, 3, 1),
                ShipLine(31, 2, 8, 2, 4),
                ShipLine(31, 6, 7, 4, 5),
                ShipLine(31, 4, 9, 5, 3),
                ShipLine(20, 0, 2, 0, 8),
                ShipLine(20, 0, 4, 8, 1),
                ShipLine(16, 2, 6, 4, 8),
                ShipLine(16, 4, 6, 8, 5),
                ShipLine(31, 7, 8, 4, 6),
                ShipLine(31, 7, 9, 5, 7),
                ShipLine(20, 1, 3, 0, 6),
                ShipLine(20, 1, 5, 1, 7),
                ShipLine(2, 0, 1, 10, 9)
        ),

        listOf(
                ShipFaceNormal(31, 0, 41, 10),
                ShipFaceNormal(31, 0, -27, 3),
                ShipFaceNormal(31, -8, 46, 8),
                ShipFaceNormal(31, -12, -57, 12),
                ShipFaceNormal(31, 8, 46, 8),
                ShipFaceNormal(31, 12, -57, 12),
                ShipFaceNormal(31, 0, 49, 0),
                ShipFaceNormal(31, 0, 0, -154),
                ShipFaceNormal(31, -121, 111, -62),
                ShipFaceNormal(31, 121, 111, -62)
        )

)