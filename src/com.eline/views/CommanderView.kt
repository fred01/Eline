package com.eline.views

import com.eline.allegro.Color.Companion.GFX_COL_GREEN
import com.eline.allegro.KEY_1
import com.eline.allegro.KEY_O
import com.eline.allegro.Screen
import com.eline.allegro.key
import com.eline.universe.playerShip

@UseExperimental(ExperimentalUnsignedTypes::class)
class CommanderView : View() {

    override fun draw(screen: Screen) {
        screen.clearDisplay()
        drawHeader(screen,"COMMANDER ${playerShip.commander.name}")

        screen.textOut(16, 102, "Present System:", GFX_COL_GREEN)
        if (playerShip.commander.dockedPlanet == null) {
            playerShip.commander.dockedPlanet = playerShip.commander.galaxy.findPlanet(playerShip.commander.shipX, playerShip.commander.shipY)
        }
        val dockerPlanetName = playerShip.commander.dockedPlanet!!.namePlanet()
        screen.textOut(300, 102, dockerPlanetName)
        if (playerShip.commander.hyperSpacePlanet == null) {
            playerShip.commander.hyperSpacePlanet = playerShip.commander.dockedPlanet!!
        }
        val hyperspacePlanetName = playerShip.commander.hyperSpacePlanet!!.namePlanet()
        screen.textOut(16, 122, "Hyperspace System:", GFX_COL_GREEN)
        screen.textOut(300, 122, hyperspacePlanetName)
    }

    override fun update(): View? {
        return when {
            key[KEY_O] -> shortRangeChartView
            key[KEY_1] -> unDockView
            else -> null
        }
    }
}

val commanderView = CommanderView()