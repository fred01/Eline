
import com.eline.allegro.BPS_TO_TIMER
import com.eline.allegro.Screen
import com.eline.allegro.Screen.Companion.GFX_COL_WHITE
import com.eline.allegro.loop
import com.eline.ships.Ship
import com.eline.ships.data.pythonShipData
import com.eline.vector.Matrix
import com.eline.vector.Vector
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val screen = Screen()
    screen.init("canvas_id")
    screen.clear(Screen.GFX_COL_BLACK)


//    val thargoidShip = Ship(
//            thargoidShipData,
//            Vector(0.0, 0.0, 4500.0),
//            Matrix.startMatrix, -127, -127, 0,
//            thargoidShipData.energy, 0, 0,
//            thargoidShipData.missiles, 0, 0, 0, 0,
//            sqrt(4500.0 * 4500.0).toInt()
//    )


    val pythonShip = Ship(
            pythonShipData,
            Vector(0.0, 0.0, 4500.0),
            Matrix.startMatrix, -127, -127, 0,
            pythonShipData.energy, 0, 0,
            pythonShipData.missiles, 0, 0, 0, 0,
            sqrt(4500.0 * 4500.0).toInt()

    )

    loop( {
        if (pythonShip.location.z - 100 > 384) {
            pythonShip.location = pythonShip.location.decZ(100)
        }
        screen.clearDisplay()
        val flightRoll = 0

        pythonShip.drawWireframeShip(screen)
        screen.textOutCenter(32, "Front View", GFX_COL_WHITE)
        screen.updateScreen()
        pythonShip.move(flightRoll,0,0)
    }, BPS_TO_TIMER(10))


}