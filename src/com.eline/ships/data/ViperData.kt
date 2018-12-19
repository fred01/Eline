import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val viperData = ShipData(
        "Viper",
        15, 20, 7,
        0,
        0,
        5625.0,
        0,
        0,
        23,
        140,
        32,
        1,
        8,

        listOf(
                ShipPoint(0, 0, 72, 31, 2, 1, 4, 3),
                ShipPoint(0, 16, 24, 30, 1, 0, 2, 2),
                ShipPoint(0, -16, 24, 30, 4, 3, 5, 5),
                ShipPoint(48, 0, -24, 31, 4, 2, 6, 6),
                ShipPoint(-48, 0, -24, 31, 3, 1, 6, 6),
                ShipPoint(24, -16, -24, 30, 5, 4, 6, 6),
                ShipPoint(-24, -16, -24, 30, 3, 5, 6, 6),
                ShipPoint(24, 16, -24, 31, 2, 0, 6, 6),
                ShipPoint(-24, 16, -24, 31, 1, 0, 6, 6),
                ShipPoint(-32, 0, -24, 19, 6, 6, 6, 6),
                ShipPoint(32, 0, -24, 19, 6, 6, 6, 6),
                ShipPoint(8, 8, -24, 19, 6, 6, 6, 6),
                ShipPoint(-8, 8, -24, 19, 6, 6, 6, 6),
                ShipPoint(-8, -8, -24, 18, 6, 6, 6, 6),
                ShipPoint(8, -8, -24, 18, 6, 6, 6, 6)
        ),

        listOf(
                ShipLine(31, 4, 2, 0, 3),
                ShipLine(30, 2, 1, 0, 1),
                ShipLine(30, 4, 3, 0, 2),
                ShipLine(31, 3, 1, 0, 4),
                ShipLine(30, 2, 0, 1, 7),
                ShipLine(30, 1, 0, 1, 8),
                ShipLine(30, 5, 4, 2, 5),
                ShipLine(30, 5, 3, 2, 6),
                ShipLine(31, 6, 0, 7, 8),
                ShipLine(30, 6, 5, 5, 6),
                ShipLine(31, 6, 1, 4, 8),
                ShipLine(30, 6, 3, 4, 6),
                ShipLine(31, 6, 2, 3, 7),
                ShipLine(30, 4, 6, 3, 5),
                ShipLine(19, 6, 6, 9, 12),
                ShipLine(18, 6, 6, 9, 13),
                ShipLine(19, 6, 6, 10, 11),
                ShipLine(18, 6, 6, 10, 14),
                ShipLine(16, 6, 6, 11, 14),
                ShipLine(16, 6, 6, 12, 13)
        ),

        listOf(
                ShipFaceNormal(31, 0, 32, 0),
                ShipFaceNormal(31, -22, 33, 11),
                ShipFaceNormal(31, 22, 33, 11),
                ShipFaceNormal(31, -22, -33, 11),
                ShipFaceNormal(31, 22, -33, 11),
                ShipFaceNormal(31, 0, -32, 0),
                ShipFaceNormal(31, 0, 0, -48)
        )

)