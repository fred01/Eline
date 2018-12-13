package com.eline.allegro

import com.eline.allegro.fonts.zxspectrum_data_woff
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLElement
import kotlin.browser.document

external class Canvas {
    val w:Int
    val h:Int
    val canvas: HTMLElement
    val context:CanvasRenderingContext2D
    val ready:Boolean
    val type:String
}

external class Font {
    val element:String
    val file:String
    val name:String
    val type:String
}

external val canvas: Canvas
external var font:Font

external fun allegro_init()
external fun set_gfx_mode(id:String, width:Int, height:Int)
external fun makecol(red:Int,green:Int,blue:Int,alpha:Int = definedExternally):Long
external fun clear_to_color(canvas: Canvas,colour:Long)
external fun textout_centre(canvas: Canvas,font:Font,s:String,x:Int,y:Int,size:Int,colour:Long,outline:Boolean = definedExternally,width:Int = definedExternally)
external fun textout(canvas: Canvas,font:Font,s:String,x:Int,y:Int,size:Int,colour:Long,outline:Int = definedExternally,width:Int = definedExternally)
external fun hline(canvas: Canvas,x1:Int,y:Int,x2:Int,colour:Long,width:Int)
external fun vline(canvas: Canvas,x:Int,y1:Int,y2:Int,colour:Long,width:Int)
external fun line(canvas: Canvas,x1:Int,y1:Int,x2:Int,y2:Int,colour:Long,width:Int)
external fun rectfill(canvas: Canvas,x1:Int,y1:Int,w:Int,h:Int,colour:Long)
external fun create_bitmap(width:Int,height:Int):Canvas
external fun blit(source:Canvas,dest:Canvas,sx:Int,sy:Int,dx:Int,dy:Int,w:Int,h:Int)
external fun loop(block: () -> Unit, spped:Double)
external fun BPS_TO_TIMER(bps:Int):Double
external fun load_base64_font(data:String):Font

class Screen {
    companion object {
        val GFX_SCALE = 2
        val GFX_X_OFFSET = 144
        val GFX_Y_OFFSET = 44

        val GFX_COL_WHITE = makecol(255,255,255)
        val GFX_COL_BLACK = makecol(0,0,0)

    }

    lateinit var backScreen:Canvas
    lateinit var mainFont:Font
    //val GFX_X_CENTRE = 256
    //val GFX_Y_CENTRE = 192
    //val GFX_VIEW_TX = 1
    //val GFX_VIEW_TY = 1
    //val GFX_VIEW_BX = 509
    //val GFX_VIEW_BY = 381

    fun init(id:String) {
        allegro_init()
        val element = document.getElementById(id)!!
        val w = element.clientWidth
        val h = element.clientHeight
        set_gfx_mode(id, w, h)
        backScreen = create_bitmap(w,h)
        mainFont = load_base64_font(zxspectrum_data_woff)
    }


    fun textOut(txt:String, x:Int, y:Int) {
        textout (backScreen,mainFont, txt, (x / (2 / GFX_SCALE)) + GFX_X_OFFSET, (y / (2 / GFX_SCALE)) + GFX_Y_OFFSET, 16, GFX_COL_WHITE)
    }

    fun textOutCenter(y:Int, str:String, col:Long) {
        textout_centre(backScreen, mainFont, str, (128 * GFX_SCALE) + GFX_X_OFFSET, (y / (2 / GFX_SCALE)) + GFX_Y_OFFSET, 16, col)
    }


    fun drawLine(x1: Int, y1: Int, x2: Int, y2: Int) {
        if (y1 == y2) {
            hline(backScreen, x1 + GFX_X_OFFSET, y1 + GFX_Y_OFFSET, x2 + GFX_X_OFFSET, GFX_COL_WHITE, 2)
        } else if (x1 == x2) {
            vline(backScreen, x1 + GFX_X_OFFSET, y1 + GFX_Y_OFFSET, y2 + GFX_Y_OFFSET, GFX_COL_WHITE, 2)
        } else {
            line(backScreen, x1 + GFX_X_OFFSET, y1 + GFX_Y_OFFSET, x2 + GFX_X_OFFSET, y2 + GFX_Y_OFFSET, GFX_COL_WHITE, 2)
        }
    }

    fun clear(color: Long) {
        clear_to_color(backScreen, color)
    }

    fun clearDisplay () {
        rectfill (backScreen, GFX_X_OFFSET + 1, GFX_Y_OFFSET + 1, 510 + GFX_X_OFFSET, 383 + GFX_Y_OFFSET, GFX_COL_BLACK)
    }

    fun updateScreen() {
        blit(backScreen, canvas, GFX_X_OFFSET, GFX_Y_OFFSET, GFX_X_OFFSET, GFX_Y_OFFSET, 512, 512)
    }
}