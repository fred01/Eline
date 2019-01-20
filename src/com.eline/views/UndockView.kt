package com.eline.views

import com.eline.allegro.Color.Companion.GFX_COL_WHITE
import com.eline.allegro.Screen
import com.eline.universe.playerShip
import com.eline.universe.universe
import com.eline.vector.Matrix
import com.eline.vector.Vector

class UnDockView : View() {
    var timer = 0

    override fun onTransition() {
        timer = 0
    }

    override fun update(): View? {
        timer++
        return if (timer > 40) {
	        playerShip.flightSpeed = 5
	        playerShip.flightRoll = 0
	        playerShip.flightClimb = 0

            universe.addPlanet(0.0, 0.0, 65536.0)
            val rotMatrix = Matrix.startMatrix
                    .copy(
                            vector2 = Vector(
                                    -Matrix.startMatrix[2].x,
                                    -Matrix.startMatrix[2].y,
                                    -Matrix.startMatrix[2].z
                            )
                    )
            universe.addNewStation(0.0, 0.0, -256.0, rotMatrix)
            frontView
        } else {
            null
        }
    }

    override fun draw(screen: Screen) {
        if (timer % 2 == 0) {
            screen.drawCircle(screen.screenCenterX, screen.screenCenterY, 60 + (timer / 2) * 30, GFX_COL_WHITE)
        }
    }

}

val unDockView = UnDockView()