package com.eline.allegro

external class Canvas {
    val w:Int
    val h:Int
    val canvas:String
    val context:Any
    val ready:Boolean
}

external class Font {
    val element:String
    val file:String
    val name:String
    val type:String
}

external val canvas: Canvas

external fun allegro_init()
external fun set_gfx_mode(id:String, width:Int, height:Int)
external fun makecol(red:Int,green:Int,blue:Int,alpha:Int = definedExternally):Long
external fun clear_to_color(canvas: Canvas,colour:Long)
external fun textout_centre(canvas: Canvas,font:Font,s:String,x:Int,y:Int,size:Int,colour:Long,outline:Boolean = definedExternally,width:Int = definedExternally)
external fun hline(canvas: Canvas,x1:Int,y:Int,x2:Int,colour:Long,width:Int)
external fun vline(canvas: Canvas,x:Int,y1:Int,y2:Int,colour:Long,width:Int)
external fun line(canvas: Canvas,x1:Int,y1:Int,x2:Int,y2:Int,colour:Long,width:Int)
