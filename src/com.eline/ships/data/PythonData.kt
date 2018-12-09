package com.eline.ships.data

import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val pythonShipData = ShipData(
        "Python",
        11, 26, 13,
        2,
        0,
        6400.0,
        0,
        200,
        40,
        250,
        20,
        3,
        13,
        listOf(
                ShipPoint(0, 0, 224, 31, 1, 0, 3, 2),
                ShipPoint(0, 48, 48, 31, 1, 0, 5, 4),
                ShipPoint(96, 0, -16, 31, 15, 15, 15, 15),
                ShipPoint(-96, 0, -16, 31, 15, 15, 15, 15),
                ShipPoint(0, 48, -32, 31, 5, 4, 9, 8),
                ShipPoint(0, 24, -112, 31, 8, 9, 12, 12),
                ShipPoint(-48, 0, -112, 31, 11, 8, 12, 12),
                ShipPoint(48, 0, -112, 31, 10, 9, 12, 12),
                ShipPoint(0, -48, 48, 31, 3, 2, 7, 6),
                ShipPoint(0, -48, -32, 31, 7, 6, 11, 10),
                ShipPoint(0, -24, -112, 31, 11, 10, 12, 12)
        ),
        listOf(
                ShipLine(31, 3, 2, 0, 8),
                ShipLine(31, 2, 0, 0, 3),
                ShipLine(31, 3, 1, 0, 2),
                ShipLine(31, 1, 0, 0, 1),
                ShipLine(31, 5, 9, 2, 4),
                ShipLine(31, 5, 1, 1, 2),
                ShipLine(31, 3, 7, 2, 8),
                ShipLine(31, 4, 0, 1, 3),
                ShipLine(31, 6, 2, 3, 8),
                ShipLine(31, 10, 7, 2, 9),
                ShipLine(31, 8, 4, 3, 4),
                ShipLine(31, 11, 6, 3, 9),
                ShipLine(7, 8, 8, 3, 5),
                ShipLine(7, 11, 11, 3, 10),
                ShipLine(7, 9, 9, 2, 5),
                ShipLine(7, 10, 10, 2, 10),
                ShipLine(31, 10, 9, 2, 7),
                ShipLine(31, 11, 8, 3, 6),
                ShipLine(31, 12, 8, 5, 6),
                ShipLine(31, 12, 9, 5, 7),
                ShipLine(31, 10, 12, 7, 10),
                ShipLine(31, 12, 11, 6, 10),
                ShipLine(31, 9, 8, 4, 5),
                ShipLine(31, 11, 10, 9, 10),
                ShipLine(31, 5, 4, 1, 4),
                ShipLine(31, 7, 6, 8, 9)

        ),
        listOf(
                ShipFaceNormal(31, -27, 40, 11),
                ShipFaceNormal(31, 27, 40, 11),
                ShipFaceNormal(31, -27, -40, 11),
                ShipFaceNormal(31, 27, -40, 11),
                ShipFaceNormal(31, -19, 38, 0),
                ShipFaceNormal(31, 19, 38, 0),
                ShipFaceNormal(31, -19, -38, 0),
                ShipFaceNormal(31, 19, -38, 0),
                ShipFaceNormal(31, -25, 37, -11),
                ShipFaceNormal(31, 25, 37, -11),
                ShipFaceNormal(31, 25, -37, -11),
                ShipFaceNormal(31, -25, -37, -11),
                ShipFaceNormal(31, 0, 0, -112)
        )
)




