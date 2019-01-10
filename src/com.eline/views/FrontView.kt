package com.eline.views

import com.eline.allegro.KEY_DOWN
import com.eline.allegro.KEY_LEFT
import com.eline.allegro.KEY_RIGHT
import com.eline.allegro.KEY_UP
import com.eline.allegro.Screen
import com.eline.allegro.key
import com.eline.universe.playerShip
import com.eline.universe.universe

class FrontView:View() {
    override fun update(): View? {
        if (key[KEY_UP]) {
			if (playerShip.flightClimb > 0) {
                playerShip.flightClimb = 0
            }
			else {
                playerShip.decreaseFlightClimb()
			}
        }
        if (key[KEY_DOWN]) {
            if (playerShip.flightClimb < 0) {
                playerShip.flightClimb = 0
            }
            else {
                playerShip.increaseFlightClimb()
            }
        }
        if (key[KEY_LEFT]) {
            if (playerShip.flightRoll < 0) {
                playerShip.flightRoll = 0
            } else {
                playerShip.increaseFlightRoll()
                playerShip.increaseFlightRoll()
            }
        }
        if (key[KEY_RIGHT]) {
			if (playerShip.flightRoll > 0) {
                playerShip.flightRoll = 0
            }
			else {
                playerShip.decreaseFlightRoll()
                playerShip.decreaseFlightRoll()
			}
        }

        return null
    }

    override fun draw(screen: Screen) {
        screen.clearDisplay()
        universe.universeObjects.forEach {universeObject ->
            universeObject.moveObject()
            if (universeObject.location.z > 0) {
                universeObject.draw(screen)
            }
        }
    }

}

val frontView = FrontView()