
import com.eline.allegro.Color.Companion.GFX_COL_BLACK
import com.eline.allegro.Screen
import com.eline.allegro.install_keyboard
import com.eline.allegro.loop
import com.eline.views.View
import com.eline.views.introView

@ExperimentalUnsignedTypes
fun main(args: Array<String>) {
    val screen = Screen("canvas_id")
    install_keyboard()
    screen.clear(GFX_COL_BLACK)

    var view: View = introView

    loop( {
        view.draw(screen)
        screen.updateScreen()
        val nextView = view.update()
        if (nextView != null) {
            screen.clearDisplay()
            view = nextView
            view.onTransition()
        }
    }, 50.0 /*BPS_TO_TIMER(24)*/)
}