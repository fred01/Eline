package com.eline.views

import cobra3aData
import com.eline.allegro.Color
import com.eline.allegro.KEY_SPACE
import com.eline.allegro.Screen
import com.eline.allegro.key
import com.eline.ships.Ship
import com.eline.universe.playerShip
import com.eline.vector.Matrix
import com.eline.vector.Vector

class IntroView:View() {

    private val ship = Ship(
            cobra3aData,
            Vector(0.0, 0.0, 4500.0),
            Matrix.startMatrix, -127, -127
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
        playerShip.flightRoll = 1

        ship.draw(screen)
        screen.textOutCenter(550, "Press Space Commander!", Color.GFX_COL_WHITE)

        ship.moveObject()
    }
}

val introView = IntroView()