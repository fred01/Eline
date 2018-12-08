package com.eline.ships

import GFX_COL_WHITE
import com.eline.allegro.canvas
import com.eline.allegro.hline
import com.eline.allegro.line
import com.eline.allegro.vline
import com.eline.vector.Matrix
import com.eline.vector.Point
import com.eline.vector.Vector

val GFX_SCALE = 2
val GFX_X_OFFSET = 144
val GFX_Y_OFFSET = 44
//val GFX_X_CENTRE = 256
//val GFX_Y_CENTRE = 192
//val GFX_VIEW_TX = 1
//val GFX_VIEW_TY = 1
//val GFX_VIEW_BX = 509
//val GFX_VIEW_BY = 381


data class ShipPoint(
        val x: Int,
        val y: Int,
        val z: Int,
        val dist: Int,
        val face1: Int,
        val face2: Int,
        val face3: Int,
        val face4: Int
)

data class ShipLine(
        val dist: Int,
        val face1: Int,
        val face2: Int,
        val start_point: Int,
        val end_point: Int
)


data class ShipFaceNormal(
        val dist: Int,
        val x: Int,
        val y: Int,
        val z: Int
)


data class ShipData(
        val name: String,
        val numPoints: Int,
        val numLines: Int,
        val numFaces: Int,
        val maxLoot: Int,
        val scoopType: Int,
        val size: Double,
        val front_laser: Int,
        val bounty: Int,
        val vanish_point: Int,
        val energy: Int,
        val velocity: Int,
        val missiles: Int,
        val laser_strength: Int,
        val points: List<ShipPoint>,
        val lines: List<ShipLine>,
        val normals: List<ShipFaceNormal>
)

data class Ship(
        val shipData: ShipData,
        val location: Vector,
        val rotmat: Matrix,
        val rotx: Int,
        val rotz: Int,
        val flags: Int,
        val energy: Int,
        val velocity: Int,
        val acceleration: Int,
        val missiles: Int,
        val target: Int,
        val bravery: Int,
        val exp_delta: Int,
        val exp_seed: Int,
        val distance: Int
) {
    fun drawWireframeShip() {
        val transMat = Matrix(
                this.rotmat.vector1,
                this.rotmat.vector2,
                this.rotmat.vector3
        )

        val cameraVec = this.location.multMatrix(transMat).unitVector()

        val visible = this.shipData.normals.map { normal ->
            val vec = Vector(normal.x.toDouble(), normal.y.toDouble(), normal.z.toDouble())

            if ((vec.x == 0.0) && (vec.y == 0.0) && (vec.z == 0.0)) {
                true
            } else {
                val cosAngle = vec.unitVector().vectorDotProduct(cameraVec)
                cosAngle < -0.2
            }
        }

        val pointList = this.shipData.points.map { shipPoint ->
            val v = Vector(shipPoint.x.toDouble(), shipPoint.y.toDouble(), shipPoint.z.toDouble())
            val vec = v.multMatrix(transMat.transpose())

            val rx = vec.x + this.location.x
            val ry = vec.y + this.location.y
            val rz = vec.z + this.location.z

            var sx = ((rx * 256) / rz).toInt()
            var sy = ((ry * 256) / rz).toInt()

            sy = -sy

            sx += 128
            sy += 96

            sx *= GFX_SCALE
            sy *= GFX_SCALE

            Point(sx, sy, 0)
        }

        this.shipData.lines.forEach { line ->
            if (visible[line.face1] || visible[line.face2]) {
                val sx = pointList[line.start_point].x
                val sy = pointList[line.start_point].y

                val ex = pointList[line.end_point].x
                val ey = pointList[line.end_point].y

                gfx_draw_line(sx, sy, ex, ey)
            }
        }
    }
}

fun gfx_draw_line(x1: Int, y1: Int, x2: Int, y2: Int) {
    if (y1 == y2) {
        hline(canvas, x1 + GFX_X_OFFSET, y1 + GFX_Y_OFFSET, x2 + GFX_X_OFFSET, GFX_COL_WHITE, 2)
    } else if (x1 == x2) {
        vline(canvas, x1 + GFX_X_OFFSET, y1 + GFX_Y_OFFSET, y2 + GFX_Y_OFFSET, GFX_COL_WHITE, 2)
    } else {
        line(canvas, x1 + GFX_X_OFFSET, y1 + GFX_Y_OFFSET, x2 + GFX_X_OFFSET, y2 + GFX_Y_OFFSET, GFX_COL_WHITE, 2)
    }
}
