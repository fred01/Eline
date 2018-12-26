package com.eline.views

import com.eline.allegro.Color
import com.eline.allegro.Screen

abstract class View {

    abstract fun update():View?
    abstract fun draw(screen: Screen)

    fun drawHeader(screen: Screen, headerText:String) {
        screen.textOutCenter(43, headerText, Color.GFX_COL_GOLD)
        screen.drawLine(0, 70, screen.screenWidth, 70)
    }

    open fun onTransition() {

    }
}