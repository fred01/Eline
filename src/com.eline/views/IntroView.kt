package com.eline.views

import cobra3aData
import com.eline.allegro.Color
import com.eline.allegro.KEY_SPACE
import com.eline.allegro.Screen
import com.eline.allegro.key
import com.eline.ships.Ship
import com.eline.vector.Matrix
import com.eline.vector.Vector
import kotlin.math.sqrt

class IntroView:View() {

    private val ship = Ship(
            cobra3aData,
            Vector(0.0, 0.0, 4500.0),
            Matrix.startMatrix, -127, -127, 0,
            cobra3aData.energy, 0, 0,
            cobra3aData.missiles, 0, 0, 0, 0,
            sqrt(4500.0 * 4500.0).toInt()

    )

    override fun update(): View? {
        return if (key[KEY_SPACE]) {
            commanderView
        } else {
            null
        }
    }

    override fun draw(screen: Screen) {
        if (ship.location.z - 100 > 384) {
            ship.location = ship.location.decZ(50)
        }
        screen.clearDisplay()
        val flightRoll = 1

        ship.drawWireframeShip(screen)
        screen.textOutCenter(550, "Press Space Commander!", Color.GFX_COL_WHITE)

        ship.move(flightRoll,0,0)
    }
}

val introView = IntroView()