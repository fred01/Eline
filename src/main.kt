
import com.eline.allegro.BPS_TO_TIMER
import com.eline.allegro.KEY_N
import com.eline.allegro.Screen
import com.eline.allegro.Screen.Companion.GFX_COL_WHITE
import com.eline.allegro.install_keyboard
import com.eline.allegro.key
import com.eline.allegro.loop
import com.eline.ships.Ship
import com.eline.ships.data.pythonShipData
import com.eline.vector.Matrix
import com.eline.vector.Vector
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val screen = Screen()
    screen.init("canvas_id")
    install_keyboard()
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
            Matrix.startMatrix, -127, -0, 0,
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
        screen.textOutCenter(360, "Load New Commander (Y/N)?", GFX_COL_WHITE)
        screen.updateScreen()
        pythonShip.move(flightRoll,0,0)
        if (key[KEY_N]) {
            println("N pressed!")
        }
//        val name = "JAMESON"
//        val str = "COMMANDER $name"
//        screen.textOutCenter(10, str, Screen.GFX_COL_WHITE);
//        screen.drawLine(0, 36, 511, 36);
//        screen.updateScreen()

    }, BPS_TO_TIMER(10))


}