import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val transpData = ShipData(
        "Transporter",
        37, 46, 14,
        0,
        0,
        2500.0,
        12,
        0,
        16,
        32,
        10,
        0,
        0,

        listOf(
                ShipPoint(0, 10, -26, 31, 0, 6, 7, 7),
                ShipPoint(-25, 4, -26, 31, 0, 1, 7, 7),
                ShipPoint(-28, -3, -26, 31, 0, 1, 2, 2),
                ShipPoint(-25, -8, -26, 31, 0, 2, 3, 3),
                ShipPoint(26, -8, -26, 31, 0, 3, 4, 4),
                ShipPoint(29, -3, -26, 31, 0, 4, 5, 5),
                ShipPoint(26, 4, -26, 31, 0, 5, 6, 6),
                ShipPoint(0, 6, 12, 19, 15, 15, 15, 15),
                ShipPoint(-30, -1, 12, 31, 1, 7, 8, 9),
                ShipPoint(-33, -8, 12, 31, 1, 2, 3, 9),
                ShipPoint(33, -8, 12, 31, 3, 4, 5, 10),
                ShipPoint(30, -1, 12, 31, 5, 6, 10, 11),
                ShipPoint(-11, -2, 30, 31, 8, 9, 12, 13),
                ShipPoint(-13, -8, 30, 31, 3, 9, 13, 13),
                ShipPoint(14, -8, 30, 31, 3, 10, 13, 13),
                ShipPoint(11, -2, 30, 31, 10, 11, 12, 13),
                ShipPoint(-5, 6, 2, 7, 7, 7, 7, 7),
                ShipPoint(-18, 3, 2, 7, 7, 7, 7, 7),
                ShipPoint(-5, 7, -7, 7, 7, 7, 7, 7),
                ShipPoint(-18, 4, -7, 7, 7, 7, 7, 7),
                ShipPoint(-11, 6, -14, 7, 7, 7, 7, 7),
                ShipPoint(-11, 5, -7, 7, 7, 7, 7, 7),
                ShipPoint(5, 7, -14, 7, 6, 6, 6, 6),
                ShipPoint(18, 4, -14, 7, 6, 6, 6, 6),
                ShipPoint(11, 5, -7, 7, 6, 6, 6, 6),
                ShipPoint(5, 6, -3, 7, 6, 6, 6, 6),
                ShipPoint(18, 3, -3, 7, 6, 6, 6, 6),
                ShipPoint(11, 4, 8, 7, 6, 6, 6, 6),
                ShipPoint(11, 5, -3, 7, 6, 6, 6, 6),
                ShipPoint(-16, -8, -13, 6, 3, 3, 3, 3),
                ShipPoint(-16, -8, 16, 6, 3, 3, 3, 3),
                ShipPoint(17, -8, -13, 6, 3, 3, 3, 3),
                ShipPoint(17, -8, 16, 6, 3, 3, 3, 3),
                ShipPoint(-13, -3, -26, 8, 0, 0, 0, 0),
                ShipPoint(13, -3, -26, 8, 0, 0, 0, 0),
                ShipPoint(9, 3, -26, 5, 0, 0, 0, 0),
                ShipPoint(-8, 3, -26, 5, 0, 0, 0, 0)
        ),

        listOf(
                ShipLine(31, 0, 7, 0, 1),
                ShipLine(31, 0, 1, 1, 2),
                ShipLine(31, 0, 2, 2, 3),
                ShipLine(31, 0, 3, 3, 4),
                ShipLine(31, 0, 4, 4, 5),
                ShipLine(31, 0, 5, 5, 6),
                ShipLine(31, 0, 6, 0, 6),
                ShipLine(16, 6, 7, 0, 7),
                ShipLine(31, 1, 7, 1, 8),
                ShipLine(11, 1, 2, 2, 9),
                ShipLine(31, 2, 3, 3, 9),
                ShipLine(31, 3, 4, 4, 10),
                ShipLine(11, 4, 5, 5, 10),
                ShipLine(31, 5, 6, 6, 11),
                ShipLine(17, 7, 8, 7, 8),
                ShipLine(17, 1, 9, 8, 9),
                ShipLine(17, 5, 10, 10, 11),
                ShipLine(17, 6, 11, 7, 11),
                ShipLine(19, 11, 12, 7, 15),
                ShipLine(19, 8, 12, 7, 12),
                ShipLine(16, 8, 9, 8, 12),
                ShipLine(31, 3, 9, 9, 13),
                ShipLine(31, 3, 10, 10, 14),
                ShipLine(16, 10, 11, 11, 15),
                ShipLine(31, 9, 13, 12, 13),
                ShipLine(31, 3, 13, 13, 14),
                ShipLine(31, 10, 13, 14, 15),
                ShipLine(31, 12, 13, 12, 15),
                ShipLine(7, 7, 7, 16, 17),
                ShipLine(7, 7, 7, 18, 19),
                ShipLine(7, 7, 7, 19, 20),
                ShipLine(7, 7, 7, 18, 20),
                ShipLine(7, 7, 7, 20, 21),
                ShipLine(7, 6, 6, 22, 23),
                ShipLine(7, 6, 6, 23, 24),
                ShipLine(7, 6, 6, 24, 22),
                ShipLine(7, 6, 6, 25, 26),
                ShipLine(7, 6, 6, 26, 27),
                ShipLine(7, 6, 6, 25, 27),
                ShipLine(7, 6, 6, 27, 28),
                ShipLine(6, 3, 3, 29, 30),
                ShipLine(6, 3, 3, 31, 32),
                ShipLine(8, 0, 0, 33, 34),
                ShipLine(5, 0, 0, 34, 35),
                ShipLine(5, 0, 0, 35, 36),
                ShipLine(5, 0, 0, 36, 33)
        ),

        listOf(
                ShipFaceNormal(31, 0, 0, -103),
                ShipFaceNormal(31, -111, 48, -7),
                ShipFaceNormal(31, -105, -63, -21),
                ShipFaceNormal(31, 0, -34, 0),
                ShipFaceNormal(31, 105, -63, -21),
                ShipFaceNormal(31, 111, 48, -7),
                ShipFaceNormal(31, 8, 32, 3),
                ShipFaceNormal(31, -8, 32, 3),
                ShipFaceNormal(19, -8, 34, 11),
                ShipFaceNormal(31, -75, 32, 79),
                ShipFaceNormal(31, 75, 32, 79),
                ShipFaceNormal(19, 8, 34, 11),
                ShipFaceNormal(31, 0, 38, 17),
                ShipFaceNormal(31, 0, 0, 121)
        )

)