import com.eline.allegro.Screen
import com.eline.ships.Ship
import com.eline.ships.data.thargoidShipData
import com.eline.vector.Matrix
import com.eline.vector.Vector
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val screen = Screen()
    screen.init("canvas_id")
    screen.clear(Screen.GFX_COL_BLACK)


    val thargoidShip = Ship(
            thargoidShipData,
            Vector(0.0, 0.0, 4500.0),
            Matrix.startMatrix, -127, -127, 0,
            thargoidShipData.energy, 0, 0,
            thargoidShipData.missiles, 0, 0, 0, 0,
            sqrt(4500.0 * 4500.0).toInt()
    )


//    thargoidShip.drawWireframeShip(screen)
//    screen.updateScreen()


    while (true) {
        if (thargoidShip.location.z - 100 > 384) {
            thargoidShip.location = thargoidShip.location.decZ(100)
        }
        screen.clearDisplay()
        val flightRoll = 1;

        thargoidShip.drawWireframeShip(screen)
        screen.updateScreen()
    }


}