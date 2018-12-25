package com.eline.views

import com.eline.allegro.Color.Companion.GFX_COL_GREEN
import com.eline.allegro.Color.Companion.GFX_COL_WHITE
import com.eline.allegro.Screen
import com.eline.allegro.Screen.Companion.GFX_SCALE
import com.eline.universe.GalaxySeed
import com.eline.universe.carry_flag
import com.eline.universe.playerShip
import kotlin.math.abs

class ShortRangeChartView : View() {
    var crossX: Int = 0
    var crossY: Int = 0

    private fun drawFuelLimitCircle(screen: Screen, cx: Int, cy: Int) {
        val radius = playerShip.commander.fuel * GFX_SCALE
        val crossSize = 16 * GFX_SCALE

        screen.drawCircle(cx, cy, radius, GFX_COL_GREEN)
        screen.drawLine(cx, cy - crossSize, cx, cy + crossSize)
        screen.drawLine(cx - crossSize, cy, cx + crossSize, cy)
    }

    override fun update(): View? {
        return null
    }

    override fun draw(screen: Screen) {
        screen.clearDisplay()
        drawHeader(screen, "SHORT RANGE CHART")
        drawFuelLimitCircle(screen, screen.screenCenterX * GFX_SCALE, screen.screenCenterY * GFX_SCALE)

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
                px = px * 4 * GFX_SCALE + screen.screenCenterX * GFX_SCALE

                py = (glx.b - dockedPlanet.b).toInt()
                py = py * 2 * GFX_SCALE + screen.screenCenterY * GFX_SCALE

                var row = py / (8 * GFX_SCALE)

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
                        screen.textOut(px + (4 * GFX_SCALE), (row * 8 - 5) * GFX_SCALE + 16, planetName)

                    }

                    /* The next bit calculates the size of the circle used to represent */
                    /* a planet.  The carry_flag is left over from the name generation. */
                    /* Yes this was how it was done... don't ask :-( */

                    val blobSize = ((glx.f.and(1.toUByte())) + 2.toUByte() + carry_flag.toUByte()).toInt() * GFX_SCALE

                    screen.drawFilledCircle(px, py, blobSize, GFX_COL_WHITE)

                    glx.waggle()
                    glx.waggle()
                    glx.waggle()
                    glx.waggle()

                }
            }
        }

        crossX = ((hyperspacePlanet.d - dockedPlanet.d).toInt() * 4 * GFX_SCALE) + screen.screenCenterX
        crossY = ((hyperspacePlanet.b - dockedPlanet.b).toInt() * 2 * GFX_SCALE) + screen.screenCenterY
    }
}

val shortRangeChartView = ShortRangeChartView()