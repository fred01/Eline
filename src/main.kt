
import com.eline.allegro.allegro_init
import com.eline.allegro.canvas
import com.eline.allegro.clear_to_color
import com.eline.allegro.makecol

import com.eline.allegro.set_gfx_mode
import com.eline.ships.Ship
import com.eline.ships.data.thargoidShipData
import com.eline.vector.Matrix

import com.eline.vector.Vector
import kotlin.math.sqrt


val GFX_COL_WHITE = makecol(255,255,255)
val GFX_COL_BLACK = makecol(0,0,0)

fun main(args: Array<String>) {
    allegro_init();
    set_gfx_mode("canvas_id", 800, 600);
    clear_to_color(canvas,GFX_COL_BLACK);

    val thargoidShip = Ship(
            thargoidShipData,
            Vector(-200.0, 0.0, 700.0),
            Matrix.startMatrix, -127, -127, 0,
            thargoidShipData.energy, 0, 0,
            thargoidShipData.missiles, 0, 0, 0, 0,
            sqrt(4500.0 * 4500.0).toInt()
    )

    thargoidShip.drawWireframeShip()
}