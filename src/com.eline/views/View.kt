package com.eline.views

import com.eline.allegro.Screen

abstract class View {

    abstract fun update():View?
    abstract fun draw(screen: Screen)
}