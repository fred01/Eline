package com.eline.ships.data

import com.eline.ships.ShipData
import com.eline.ships.ShipFaceNormal
import com.eline.ships.ShipLine
import com.eline.ships.ShipPoint

val thargoidShipData = ShipData(
        "Thargoid",
        20, 26, 10,
        0,
        0,
        9801.0,
        15,
        500,
        55,
        240,
        39,
        6,
        11,
        listOf(
                ShipPoint(32, -48, 48, 31, 4, 0, 8, 8),
                ShipPoint(32, -68, 0, 31, 1, 0, 4, 4),
                ShipPoint(32, -48, -48, 31, 2, 1, 4, 4),
                ShipPoint(32, 0, -68, 31, 3, 2, 4, 4),
                ShipPoint(32, 48, -48, 31, 4, 3, 5, 5),
                ShipPoint(32, 68, 0, 31, 5, 4, 6, 6),
                ShipPoint(32, 48, 48, 31, 6, 4, 7, 7),
                ShipPoint(32, 0, 68, 31, 7, 4, 8, 8),
                ShipPoint(-24, -116, 116, 31, 8, 0, 9, 9),
                ShipPoint(-24, -164, 0, 31, 1, 0, 9, 9),
                ShipPoint(-24, -116, -116, 31, 2, 1, 9, 9),
                ShipPoint(-24, 0, -164, 31, 3, 2, 9, 9),
                ShipPoint(-24, 116, -116, 31, 5, 3, 9, 9),
                ShipPoint(-24, 164, 0, 31, 6, 5, 9, 9),
                ShipPoint(-24, 116, 116, 31, 7, 6, 9, 9),
                ShipPoint(-24, 0, 164, 31, 8, 7, 9, 9),
                ShipPoint(-24, 64, 80, 30, 9, 9, 9, 9),
                ShipPoint(-24, 64, -80, 30, 9, 9, 9, 9),
                ShipPoint(-24, -64, -80, 30, 9, 9, 9, 9),
                ShipPoint(-24, -64, 80, 30, 9, 9, 9, 9)
        ),
        listOf(
                ShipLine(31, 8, 4, 0, 7),
                ShipLine(31, 4, 0, 0, 1),
                ShipLine(31, 4, 1, 1, 2),
                ShipLine(31, 4, 2, 2, 3),
                ShipLine(31, 4, 3, 3, 4),
                ShipLine(31, 5, 4, 4, 5),
                ShipLine(31, 6, 4, 5, 6),
                ShipLine(31, 7, 4, 6, 7),
                ShipLine(31, 8, 0, 0, 8),
                ShipLine(31, 1, 0, 1, 9),
                ShipLine(31, 2, 1, 2, 10),
                ShipLine(31, 3, 2, 3, 11),
                ShipLine(31, 5, 3, 4, 12),
                ShipLine(31, 6, 5, 5, 13),
                ShipLine(31, 7, 6, 6, 14),
                ShipLine(31, 8, 7, 7, 15),
                ShipLine(31, 9, 8, 8, 15),
                ShipLine(31, 9, 0, 8, 9),
                ShipLine(31, 9, 1, 9, 10),
                ShipLine(31, 9, 2, 10, 11),
                ShipLine(31, 9, 3, 11, 12),
                ShipLine(31, 9, 5, 12, 13),
                ShipLine(31, 9, 6, 13, 14),
                ShipLine(31, 9, 7, 14, 15),
                ShipLine(30, 9, 9, 16, 17),
                ShipLine(30, 9, 9, 18, 19)
        ),
        listOf(
                ShipFaceNormal(31, 103, -60, 25),
                ShipFaceNormal(31, 103, -60, -25),
                ShipFaceNormal(31, 103, -25, -60),
                ShipFaceNormal(31, 103, 25, -60),
                ShipFaceNormal(31, 64, 0, 0),
                ShipFaceNormal(31, 103, 60, -25),
                ShipFaceNormal(31, 103, 60, 25),
                ShipFaceNormal(31, 103, 25, 60),
                ShipFaceNormal(31, 103, -25, 60),
                ShipFaceNormal(31, -48, 0, 0)
        )
)
