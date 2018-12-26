package com.eline.views

import com.eline.allegro.Color.Companion.GFX_COL_WHITE
import com.eline.allegro.Screen

class UnDockView:View() {
    var timer = 0

    override fun onTransition() {
        timer = 0
    }

    override fun update(): View? {
        timer++
        return if (timer > 80) {
            frontView
        } else {
            null
        }
    }

    override fun draw(screen: Screen) {
        if (timer % 5 == 0) {
            screen.drawCircle(screen.screenCenterX , screen.screenCenterY, 60 + (timer / 5)*30, GFX_COL_WHITE)
        }
    }

}

val unDockView = UnDockView()