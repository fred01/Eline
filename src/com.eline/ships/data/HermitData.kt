import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val hermitData = ShipData(
        "Rock Hermit",
        9, 21, 14,
        7,
        0,
        6400.0,
        0,
        0,
        50,
        180,
        30,
        2,
        1,

        listOf(
                ShipPoint(0, 80, 0, 31, 15, 15, 15, 15),
                ShipPoint(-80, -10, 0, 31, 15, 15, 15, 15),
                ShipPoint(0, -80, 0, 31, 15, 15, 15, 15),
                ShipPoint(70, -40, 0, 31, 15, 15, 15, 15),
                ShipPoint(60, 50, 0, 31, 6, 5, 13, 12),
                ShipPoint(50, 0, 60, 31, 15, 15, 15, 15),
                ShipPoint(-40, 0, 70, 31, 1, 0, 3, 2),
                ShipPoint(0, 30, -75, 31, 15, 15, 15, 15),
                ShipPoint(0, -50, -60, 31, 9, 8, 11, 10)
        ),

        listOf(
                ShipLine(31, 7, 2, 0, 1),
                ShipLine(31, 13, 6, 0, 4),
                ShipLine(31, 12, 5, 3, 4),
                ShipLine(31, 11, 4, 2, 3),
                ShipLine(31, 10, 3, 1, 2),
                ShipLine(31, 3, 2, 1, 6),
                ShipLine(31, 3, 1, 2, 6),
                ShipLine(31, 4, 1, 2, 5),
                ShipLine(31, 1, 0, 5, 6),
                ShipLine(31, 6, 0, 0, 5),
                ShipLine(31, 5, 4, 3, 5),
                ShipLine(31, 2, 0, 0, 6),
                ShipLine(31, 6, 5, 4, 5),
                ShipLine(31, 10, 8, 1, 8),
                ShipLine(31, 8, 7, 1, 7),
                ShipLine(31, 13, 7, 0, 7),
                ShipLine(31, 13, 12, 4, 7),
                ShipLine(31, 12, 9, 3, 7),
                ShipLine(31, 11, 9, 3, 8),
                ShipLine(31, 11, 10, 2, 8),
                ShipLine(31, 9, 8, 7, 8)
        ),

        listOf(
                ShipFaceNormal(31, 9, 66, 81),
                ShipFaceNormal(31, 9, -66, 81),
                ShipFaceNormal(31, -72, 64, 31),
                ShipFaceNormal(31, -64, -73, 47),
                ShipFaceNormal(31, 45, -79, 65),
                ShipFaceNormal(31, 135, 15, 35),
                ShipFaceNormal(31, 38, 76, 70),
                ShipFaceNormal(31, -66, 59, -39),
                ShipFaceNormal(31, -67, -15, -80),
                ShipFaceNormal(31, 66, -14, -75),
                ShipFaceNormal(31, -70, -80, -40),
                ShipFaceNormal(31, 58, -102, -51),
                ShipFaceNormal(31, 81, 9, -67),
                ShipFaceNormal(31, 47, 94, -63)
        )

)