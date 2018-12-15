
import com.eline.allegro.BPS_TO_TIMER
import com.eline.allegro.Color.Companion.GFX_COL_BLACK
import com.eline.allegro.Screen
import com.eline.allegro.install_keyboard
import com.eline.allegro.loop
import com.eline.views.CommanderView
import com.eline.views.View

fun main(args: Array<String>) {
    val screen = Screen()
    screen.init("canvas_id")
    install_keyboard()
    screen.clear(GFX_COL_BLACK)


//    val thargoidShip = Ship(
//            thargoidShipData,
//            Vector(0.0, 0.0, 4500.0),
//            Matrix.startMatrix, -127, -127, 0,
//            thargoidShipData.energy, 0, 0,
//            thargoidShipData.missiles, 0, 0, 0, 0,
//            sqrt(4500.0 * 4500.0).toInt()
//    )


//    val pythonShip = Ship(
//            pythonShipData,
//            Vector(0.0, 0.0, 4500.0),
//            Matrix.startMatrix, -127, -0, 0,
//            pythonShipData.energy, 0, 0,
//            pythonShipData.missiles, 0, 0, 0, 0,
//            sqrt(4500.0 * 4500.0).toInt()
//
//    )

    var view:View = CommanderView()

    loop( {
        view.draw(screen)
        screen.updateScreen()
        val nextView = view.update()
        if (nextView != null) {
            view = nextView
        }

        //        if (pythonShip.location.z - 100 > 384) {
//            pythonShip.location = pythonShip.location.decZ(100)
//        }
//        screen.clearDisplay()
//        val flightRoll = 0
//
//        pythonShip.drawWireframeShip(screen)
//        screen.textOutCenter(32, "Front View", GFX_COL_WHITE)
//        screen.textOutCenter(360, "Load New Commander (Y/N)?", GFX_COL_WHITE)
//        screen.updateScreen()
//        pythonShip.move(flightRoll,0,0)
//        if (key[KEY_N]) {
//            println("N pressed!")
//        }
//        val name = "JAMESON"
//        val str = "COMMANDER $name"
//        screen.textOutCenter(10, str, Screen.GFX_COL_WHITE);
//        screen.drawLine(0, 36, 511, 36);
//        screen.updateScreen()

    }, BPS_TO_TIMER(10))


}