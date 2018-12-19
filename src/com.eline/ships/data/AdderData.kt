import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val adderData = ShipData(
        "Adder",
        18, 29, 15,
        0,
        0,
        2500.0,
        0,
        40,
        20,
        85,
        24,
        0,
        8,

        listOf(
                ShipPoint(-18, 0, 40, 31, 0, 1, 11, 12),
                ShipPoint(18, 0, 40, 31, 0, 1, 2, 3),
                ShipPoint(30, 0, -24, 31, 2, 3, 4, 5),
                ShipPoint(30, 0, -40, 31, 4, 5, 6, 6),
                ShipPoint(18, -7, -40, 31, 5, 6, 7, 14),
                ShipPoint(-18, -7, -40, 31, 7, 8, 10, 14),
                ShipPoint(-30, 0, -40, 31, 8, 9, 10, 10),
                ShipPoint(-30, 0, -24, 31, 9, 10, 11, 12),
                ShipPoint(-18, 7, -40, 31, 7, 8, 9, 13),
                ShipPoint(18, 7, -40, 31, 4, 6, 7, 13),
                ShipPoint(-18, 7, 13, 31, 0, 9, 11, 13),
                ShipPoint(18, 7, 13, 31, 0, 2, 4, 13),
                ShipPoint(-18, -7, 13, 31, 1, 10, 12, 14),
                ShipPoint(18, -7, 13, 31, 1, 3, 5, 14),
                ShipPoint(-11, 3, 29, 5, 0, 0, 0, 0),
                ShipPoint(11, 3, 29, 5, 0, 0, 0, 0),
                ShipPoint(11, 4, 24, 4, 0, 0, 0, 0),
                ShipPoint(-11, 4, 24, 4, 0, 0, 0, 0)
        ),

        listOf(
                ShipLine(31, 0, 1, 0, 1),
                ShipLine(7, 2, 3, 1, 2),
                ShipLine(31, 4, 5, 2, 3),
                ShipLine(31, 5, 6, 3, 4),
                ShipLine(31, 7, 14, 4, 5),
                ShipLine(31, 8, 10, 5, 6),
                ShipLine(31, 9, 10, 6, 7),
                ShipLine(7, 11, 12, 7, 0),
                ShipLine(31, 4, 6, 3, 9),
                ShipLine(31, 7, 13, 9, 8),
                ShipLine(31, 8, 9, 8, 6),
                ShipLine(31, 0, 11, 0, 10),
                ShipLine(31, 9, 11, 7, 10),
                ShipLine(31, 0, 2, 1, 11),
                ShipLine(31, 2, 4, 2, 11),
                ShipLine(31, 1, 12, 0, 12),
                ShipLine(31, 10, 12, 7, 12),
                ShipLine(31, 1, 3, 1, 13),
                ShipLine(31, 3, 5, 2, 13),
                ShipLine(31, 0, 13, 10, 11),
                ShipLine(31, 1, 14, 12, 13),
                ShipLine(31, 9, 13, 8, 10),
                ShipLine(31, 4, 13, 9, 11),
                ShipLine(31, 10, 14, 5, 12),
                ShipLine(31, 5, 14, 4, 13),
                ShipLine(5, 0, 0, 14, 15),
                ShipLine(3, 0, 0, 15, 16),
                ShipLine(4, 0, 0, 16, 17),
                ShipLine(3, 0, 0, 17, 14)
        ),

        listOf(
                ShipFaceNormal(31, 0, 39, 10),
                ShipFaceNormal(31, 0, -39, 10),
                ShipFaceNormal(31, 69, 50, 13),
                ShipFaceNormal(31, 69, -50, 13),
                ShipFaceNormal(31, 30, 52, 0),
                ShipFaceNormal(31, 30, -52, 0),
                ShipFaceNormal(31, 0, 0, -160),
                ShipFaceNormal(31, 0, 0, -160),
                ShipFaceNormal(31, 0, 0, -160),
                ShipFaceNormal(31, -30, 52, 0),
                ShipFaceNormal(31, -30, -52, 0),
                ShipFaceNormal(31, -69, 50, 13),
                ShipFaceNormal(31, -69, -50, 13),
                ShipFaceNormal(31, 0, 28, 0),
                ShipFaceNormal(31, 0, -28, 0)
        )

)