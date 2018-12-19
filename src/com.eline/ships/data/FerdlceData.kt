import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val ferdlceData = ShipData(
        "Fer-de-Lance",
        19, 27, 10,
        0,
        0,
        1600.0,
        0,
        0,
        40,
        160,
        30,
        2,
        9,

        listOf(
                ShipPoint(0, -14, 108, 31, 0, 1, 5, 9),
                ShipPoint(-40, -14, -4, 31, 1, 2, 9, 9),
                ShipPoint(-12, -14, -52, 31, 2, 3, 9, 9),
                ShipPoint(12, -14, -52, 31, 3, 4, 9, 9),
                ShipPoint(40, -14, -4, 31, 4, 5, 9, 9),
                ShipPoint(-40, 14, -4, 28, 0, 1, 2, 6),
                ShipPoint(-12, 2, -52, 28, 2, 3, 6, 7),
                ShipPoint(12, 2, -52, 28, 3, 4, 7, 8),
                ShipPoint(40, 14, -4, 28, 0, 4, 5, 8),
                ShipPoint(0, 18, -20, 15, 0, 6, 7, 8),
                ShipPoint(-3, -11, 97, 11, 0, 0, 0, 0),
                ShipPoint(-26, 8, 18, 9, 0, 0, 0, 0),
                ShipPoint(-16, 14, -4, 11, 0, 0, 0, 0),
                ShipPoint(3, -11, 97, 11, 0, 0, 0, 0),
                ShipPoint(26, 8, 18, 9, 0, 0, 0, 0),
                ShipPoint(16, 14, -4, 11, 0, 0, 0, 0),
                ShipPoint(0, -14, -20, 12, 9, 9, 9, 9),
                ShipPoint(-14, -14, 44, 12, 9, 9, 9, 9),
                ShipPoint(14, -14, 44, 12, 9, 9, 9, 9)
        ),

        listOf(
                ShipLine(31, 1, 9, 0, 1),
                ShipLine(31, 2, 9, 1, 2),
                ShipLine(31, 3, 9, 2, 3),
                ShipLine(31, 4, 9, 3, 4),
                ShipLine(31, 5, 9, 0, 4),
                ShipLine(28, 0, 1, 0, 5),
                ShipLine(28, 2, 6, 5, 6),
                ShipLine(28, 3, 7, 6, 7),
                ShipLine(28, 4, 8, 7, 8),
                ShipLine(28, 0, 5, 0, 8),
                ShipLine(15, 0, 6, 5, 9),
                ShipLine(11, 6, 7, 6, 9),
                ShipLine(11, 7, 8, 7, 9),
                ShipLine(15, 0, 8, 8, 9),
                ShipLine(14, 1, 2, 1, 5),
                ShipLine(14, 2, 3, 2, 6),
                ShipLine(14, 3, 4, 3, 7),
                ShipLine(14, 4, 5, 4, 8),
                ShipLine(8, 0, 0, 10, 11),
                ShipLine(9, 0, 0, 11, 12),
                ShipLine(11, 0, 0, 10, 12),
                ShipLine(8, 0, 0, 13, 14),
                ShipLine(9, 0, 0, 14, 15),
                ShipLine(11, 0, 0, 13, 15),
                ShipLine(12, 9, 9, 16, 17),
                ShipLine(12, 9, 9, 16, 18),
                ShipLine(8, 9, 9, 17, 18)
        ),

        listOf(
                ShipFaceNormal(28, 0, 24, 6),
                ShipFaceNormal(31, -68, 0, 24),
                ShipFaceNormal(31, -63, 0, -37),
                ShipFaceNormal(31, 0, 0, -104),
                ShipFaceNormal(31, 63, 0, -37),
                ShipFaceNormal(31, 68, 0, 24),
                ShipFaceNormal(28, -12, 46, -19),
                ShipFaceNormal(28, 0, 45, -22),
                ShipFaceNormal(28, 12, 46, -19),
                ShipFaceNormal(31, 0, -28, 0)
        )

)