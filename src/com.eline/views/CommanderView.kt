package com.eline.views

import com.eline.allegro.Color.Companion.GFX_COL_GOLD
import com.eline.allegro.Color.Companion.GFX_COL_GREEN
import com.eline.allegro.Screen

class CommanderView: View() {
    override fun draw(screen: Screen) {
        val name = "JAMESON"
        val str = "COMMANDER $name"
        screen.clearDisplay()
        screen.textOutCenter(10, str, GFX_COL_GOLD)
        screen.drawLine(0, 36, screen.screenWidth, 36)

        screen.textOut( 16, 58, "Present System:", GFX_COL_GREEN)
        screen.textOut( 300, 58, "Lave")
        screen.textOut(16, 74, "Hyperspace System:", GFX_COL_GREEN)
        screen.textOut(300, 74, "Lave")
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