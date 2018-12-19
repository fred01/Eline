
import com.eline.allegro.BPS_TO_TIMER
import com.eline.allegro.Color.Companion.GFX_COL_BLACK
import com.eline.allegro.Screen
import com.eline.allegro.install_keyboard
import com.eline.allegro.loop
import com.eline.views.View
import com.eline.views.introView

fun main(args: Array<String>) {
    val screen = Screen()
    screen.init("canvas_id")
    install_keyboard()
    screen.clear(GFX_COL_BLACK)

    var view:View = introView

    loop( {
        view.draw(screen)
        screen.updateScreen()
        val nextView = view.update()
        if (nextView != null) {
            view = nextView
        }
    }, BPS_TO_TIMER(10))
}