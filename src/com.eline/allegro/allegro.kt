package com.eline.allegro

import com.eline.allegro.Color.Companion.GFX_COL_BLACK
import com.eline.allegro.Color.Companion.GFX_COL_WHITE
import com.eline.allegro.fonts.zxspectrum_data_woff
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLElement
import kotlin.browser.document

external class Canvas {
    val w: Int
    val h: Int
    val canvas: HTMLElement
    val context: CanvasRenderingContext2D
    val ready: Boolean
    val type: String
}

external class Font {
    val element: String
    val file: String
    val name: String
    val type: String
}

external val canvas: Canvas
external var font: Font

external val key: Array<Boolean>

external val KEY_A: Int
external val KEY_N: Int
external val KEY_F1: Int
external val KEY_1: Int
external val KEY_O: Int
external val KEY_SPACE: Int
external val KEY_LEFT: Int
external val KEY_RIGHT: Int
external val KEY_UP: Int
external val KEY_DOWN: Int

external fun allegro_init()
external fun set_gfx_mode(id: String, width: Int, height: Int)
external fun makecol(red: Int, green: Int, blue: Int, alpha: Int = definedExternally): Long
external fun clear_to_color(canvas: Canvas, colour: Long)
external fun textout_centre(canvas: Canvas, font: Font, s: String, x: Int, y: Int, size: Int, colour: Long, outline: Boolean = definedExternally, width: Int = definedExternally)
external fun textout(canvas: Canvas, font: Font, s: String, x: Int, y: Int, size: Int, colour: Long, outline: Int = definedExternally, width: Int = definedExternally)
external fun hline(canvas: Canvas, x1: Int, y: Int, x2: Int, colour: Long, width: Int)
external fun vline(canvas: Canvas, x: Int, y1: Int, y2: Int, colour: Long, width: Int)
external fun line(canvas: Canvas, x1: Int, y1: Int, x2: Int, y2: Int, colour: Long, width: Int)
external fun rectfill(canvas: Canvas, x1: Int, y1: Int, w: Int, h: Int, colour: Long)
external fun rect(canvas: Canvas, x1: Int, y1: Int, w: Int, h: Int, colour: Long, width: Int)
external fun create_bitmap(width: Int, height: Int): Canvas
external fun blit(source: Canvas, dest: Canvas, sx: Int, sy: Int, dx: Int, dy: Int, w: Int, h: Int)
external fun loop(block: () -> Unit, spped: Double)
external fun BPS_TO_TIMER(bps: Int): Double
external fun load_base64_font(data: String): Font
external fun install_keyboard(enable_keys: List<String> = definedExternally)
external fun circle(bitmap: Canvas, x: Int, y: Int, radius: Int, colour: Long, width: Int)
external fun circlefill(bitmap: Canvas, x: Int, y: Int, radius: Int, colour: Long)

class Color(val colour: Long) {
    companion object {
        val GFX_COL_WHITE = Color(makecol(255, 255, 255))
        val GFX_COL_BLACK = Color(makecol(0, 0, 0))
        val GFX_COL_GREEN = Color(makecol(0x3A, 0xA6, 0x55))
        val GFX_COL_GOLD = Color(makecol(0xFC, 0xD6, 0x67))
    }
}


class Screen {
    companion object {
        const val GFX_SCALE = 2
        const val GFX_Y_OFFSET = 0
    }

    lateinit var backScreen: Canvas
    lateinit var mainFont: Font
    var screenWidth: Int = 0
    var screenHeight: Int = 0
    var screenCenterX = 0
    var screenCenterY = 0

    fun init(id: String) {
        allegro_init()
        val element = document.getElementById(id)!!
        val w = element.clientWidth
        val h = element.clientHeight
        screenWidth = w
        screenHeight = h
        screenCenterX = screenWidth / 2
        screenCenterY = screenHeight / 2
        set_gfx_mode(id, w, h)
        backScreen = create_bitmap(w, h)
        mainFont = load_base64_font(zxspectrum_data_woff)
    }


    fun textOut(x: Int, y: Int, txt: String, color: Color = Color.GFX_COL_WHITE) {
        textout(backScreen, mainFont, txt, x , y , 16, color.colour)
    }

    fun textOutCenter(y: Int, str: String, col: Color) {
        textout_centre(backScreen, mainFont, str, screenCenterX, y, 16, col.colour)
    }


    fun drawLine(x1: Int, y1: Int, x2: Int, y2: Int) {
        if (y1 == y2) {
            hline(backScreen, x1, y1 + GFX_Y_OFFSET, x2, GFX_COL_WHITE.colour, 2)
        } else if (x1 == x2) {
            vline(backScreen, x1, y1 + GFX_Y_OFFSET, y2 + GFX_Y_OFFSET, GFX_COL_WHITE.colour, 2)
        } else {
            line(backScreen, x1, y1 + GFX_Y_OFFSET, x2, y2 + GFX_Y_OFFSET, GFX_COL_WHITE.colour, 2)
        }
    }

    fun clear(color: Color) {
        clear_to_color(canvas, color.colour)

    }

    fun clearDisplay() {
        rectfill(backScreen, 1, 1, screenWidth - 2, screenHeight - 2, GFX_COL_BLACK.colour)
    }

    fun updateScreen() {
        blit(backScreen, canvas, 0, 0, 0, 0, screenWidth, screenHeight)
    }

    fun drawCircle(cx: Int, cy: Int, radius: Int, color: Color) {
        circle(backScreen, cx, cy, radius, color.colour, 2)
    }

    fun drawFilledCircle(cx: Int, cy: Int, radius: Int, color: Color) {
        circlefill(backScreen, cx, cy, radius, color.colour)
    }
}