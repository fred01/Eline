import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val dodecData = ShipData(
        "Dodec Space Station",
        24, 34, 12,
        0,
        0,
        32400.0,
        0,
        0,
        125,
        240,
        0,
        0,
        0,

        listOf(
                ShipPoint(0, 150, 196, 31, 0, 1, 5, 5),
                ShipPoint(143, 46, 196, 31, 0, 1, 2, 2),
                ShipPoint(88, -121, 196, 31, 0, 2, 3, 3),
                ShipPoint(-88, -121, 196, 31, 0, 3, 4, 4),
                ShipPoint(-143, 46, 196, 31, 0, 4, 5, 5),
                ShipPoint(0, 243, 46, 31, 1, 5, 6, 6),
                ShipPoint(231, 75, 46, 31, 1, 2, 7, 7),
                ShipPoint(143, -196, 46, 31, 2, 3, 8, 8),
                ShipPoint(-143, -196, 46, 31, 3, 4, 9, 9),
                ShipPoint(-231, 75, 46, 31, 4, 5, 10, 10),
                ShipPoint(143, 196, -46, 31, 1, 6, 7, 7),
                ShipPoint(231, -75, -46, 31, 2, 7, 8, 8),
                ShipPoint(0, -243, -46, 31, 3, 8, 9, 9),
                ShipPoint(-231, -75, -46, 31, 4, 9, 10, 10),
                ShipPoint(-143, 196, -46, 31, 5, 6, 10, 10),
                ShipPoint(88, 121, -196, 31, 6, 7, 11, 11),
                ShipPoint(143, -46, -196, 31, 7, 8, 11, 11),
                ShipPoint(0, -150, -196, 31, 8, 9, 11, 11),
                ShipPoint(-143, -46, -196, 31, 9, 10, 11, 11),
                ShipPoint(-88, 121, -196, 31, 6, 10, 11, 11),
                ShipPoint(-16, 32, 196, 30, 0, 0, 0, 0),
                ShipPoint(-16, -32, 196, 30, 0, 0, 0, 0),
                ShipPoint(16, 32, 196, 23, 0, 0, 0, 0),
                ShipPoint(16, -32, 196, 23, 0, 0, 0, 0)
        ),

        listOf(
                ShipLine(31, 0, 1, 0, 1),
                ShipLine(31, 0, 2, 1, 2),
                ShipLine(31, 0, 3, 2, 3),
                ShipLine(31, 0, 4, 3, 4),
                ShipLine(31, 0, 5, 4, 0),
                ShipLine(31, 1, 6, 5, 10),
                ShipLine(31, 1, 7, 10, 6),
                ShipLine(31, 2, 7, 6, 11),
                ShipLine(31, 2, 8, 11, 7),
                ShipLine(31, 3, 8, 7, 12),
                ShipLine(31, 3, 9, 12, 8),
                ShipLine(31, 4, 9, 8, 13),
                ShipLine(31, 4, 10, 13, 9),
                ShipLine(31, 5, 10, 9, 14),
                ShipLine(31, 5, 6, 14, 5),
                ShipLine(31, 7, 11, 15, 16),
                ShipLine(31, 8, 11, 16, 17),
                ShipLine(31, 9, 11, 17, 18),
                ShipLine(31, 10, 11, 18, 19),
                ShipLine(31, 6, 11, 19, 15),
                ShipLine(31, 1, 5, 0, 5),
                ShipLine(31, 1, 2, 1, 6),
                ShipLine(31, 2, 3, 2, 7),
                ShipLine(31, 3, 4, 3, 8),
                ShipLine(31, 4, 5, 4, 9),
                ShipLine(31, 6, 7, 10, 15),
                ShipLine(31, 7, 8, 11, 16),
                ShipLine(31, 8, 9, 12, 17),
                ShipLine(31, 9, 10, 13, 18),
                ShipLine(31, 6, 10, 14, 19),
                ShipLine(30, 0, 0, 20, 21),
                ShipLine(20, 0, 0, 21, 23),
                ShipLine(23, 0, 0, 23, 22),
                ShipLine(20, 0, 0, 22, 20)
        ),

        listOf(
                ShipFaceNormal(31, 0, 0, 196),
                ShipFaceNormal(31, 103, 142, 88),
                ShipFaceNormal(31, 169, -55, 89),
                ShipFaceNormal(31, 0, -176, 88),
                ShipFaceNormal(31, -169, -55, 89),
                ShipFaceNormal(31, -103, 142, 88),
                ShipFaceNormal(31, 0, 176, -88),
                ShipFaceNormal(31, 169, 55, -89),
                ShipFaceNormal(31, 103, -142, -88),
                ShipFaceNormal(31, -103, -142, -88),
                ShipFaceNormal(31, -169, 55, -89),
                ShipFaceNormal(31, 0, 0, -196)
        )

)