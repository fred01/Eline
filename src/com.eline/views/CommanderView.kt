package com.eline.views

import com.eline.allegro.Color.Companion.GFX_COL_GOLD
import com.eline.allegro.Color.Companion.GFX_COL_GREEN
import com.eline.allegro.Screen
import com.eline.universe.playerShip

class CommanderView: View() {
    override fun draw(screen: Screen) {
        screen.clearDisplay()
        screen.textOutCenter(43, "COMMANDER ${playerShip.commander.name}" , GFX_COL_GOLD)
        screen.drawLine(0, 70, screen.screenWidth, 70)

        screen.textOut( 16, 102, "Present System:", GFX_COL_GREEN)
        screen.textOut( 300, 102, "Lave")
        screen.textOut(16, 122, "Hyperspace System:", GFX_COL_GREEN)
        screen.textOut(300, 122, "Lave")
    }

    override fun update(): View? {
        return null
//        if (key[KEY_F1]) {
//            return
//        } else {
//            return null
//        }
    }
}

val commanderView = CommanderView()