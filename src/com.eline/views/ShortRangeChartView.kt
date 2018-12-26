package com.eline.views

import com.eline.allegro.Color.Companion.GFX_COL_GREEN
import com.eline.allegro.Color.Companion.GFX_COL_WHITE
import com.eline.allegro.KEY_1
import com.eline.allegro.KEY_O
import com.eline.allegro.Screen
import com.eline.allegro.key
import com.eline.universe.GalaxySeed
import com.eline.universe.carry_flag
import com.eline.universe.playerShip
import kotlin.math.abs

class ShortRangeChartView : View() {
    private var crossX: Int = 0
    private var crossY: Int = 0

    private fun drawFuelLimitCircle(screen: Screen, cx: Int, cy: Int) {
        val radius = playerShip.commander.fuel * 2
        val crossSize = 32

        screen.drawCircle(cx, cy, radius, GFX_COL_GREEN)
        screen.drawLine(cx, cy - crossSize, cx, cy + crossSize)
        screen.drawLine(cx - crossSize, cy, cx + crossSize, cy)
    }

    override fun update(): View? {
        return when {
            key[KEY_O] -> shortRangeChartView
            key[KEY_1] -> unDockView
            else -> null
        }
    }

    override fun draw(screen: Screen) {
        screen.clearDisplay()
        drawHeader(screen, "SHORT RANGE CHART")
        drawFuelLimitCircle(screen, screen.screenCenterX, screen.screenCenterY)

        val rowUsed = Array(64) { 0 }

        val glx = GalaxySeed()
        playerShip.commander.galaxy.copy(glx)

        var dx: Int
        var dy: Int
        var px: Int
        var py: Int

        val dockedPlanet = playerShip.commander.dockedPlanet
                ?: playerShip.commander.galaxy.findPlanet(playerShip.commander.shipX, playerShip.commander.shipY)

        val hyperspacePlanet = playerShip.commander.hyperSpacePlanet ?: dockedPlanet

        IntRange(0, 255).forEach {
            dx = abs(glx.d.minus(dockedPlanet.d).toInt())
            dy = abs(glx.b.minus(dockedPlanet.b).toInt())
            if ((dx >= 30) || (dy >= 38)) {
                glx.waggle()
                glx.waggle()
                glx.waggle()
                glx.waggle()
            } else {
                px = (glx.d - dockedPlanet.d).toInt()
                px = px * 8 + screen.screenCenterX

                py = (glx.b - dockedPlanet.b).toInt()
                py = py * 4 + screen.screenCenterY

                var row = py / (16)

                if (rowUsed[row] == 1) {
                    row++
                }

                if (rowUsed[row] == 1)
                    row -= 2

                if (row <= 3) {
                    glx.waggle()
                    glx.waggle()
                    glx.waggle()
                    glx.waggle()
                } else {
                    if (rowUsed[row] == 0) {
                        rowUsed[row] = 1

                        val planetName = glx.namePlanet()
                        screen.textOut(px + 8, (row * 8 - 5) * 2 + 16, planetName)

                    }

                    /* The next bit calculates the size of the circle used to represent */
                    /* a planet.  The carry_flag is left over from the name generation. */
                    /* Yes this was how it was done... don't ask :-( */

                    val blobSize = ((glx.f.and(1.toUByte())) + 2.toUByte() + carry_flag.toUByte()).toInt() * 2

                    screen.drawFilledCircle(px, py, blobSize, GFX_COL_WHITE)

                    glx.waggle()
                    glx.waggle()
                    glx.waggle()
                    glx.waggle()

                }
            }
        }

        crossX = ((hyperspacePlanet.d - dockedPlanet.d).toInt() * 8) + screen.screenCenterX
        crossY = ((hyperspacePlanet.b - dockedPlanet.b).toInt() * 8) + screen.screenCenterY
    }
}

val shortRangeChartView = ShortRangeChartView()