package com.eline.ships

import com.eline.allegro.Screen
import com.eline.vector.Matrix
import com.eline.vector.Point
import com.eline.vector.Vector
import kotlin.math.sqrt


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
        var location: Vector,
        var rotmat: Matrix,
        var rotx: Int,
        val rotz: Int,
        val flags: Int,
        val energy: Int,
        var velocity: Int,
        var acceleration: Int,
        val missiles: Int,
        val target: Int,
        val bravery: Int,
        val exp_delta: Int,
        val exp_seed: Int,
        var distance: Int
) {

    fun isDead(): Boolean {
        return false
    }

    private fun rotateXFirst (a:Double, b:Double, direction:Int):Pair<Double, Double>
    {
        return if (direction < 0) {
            a - (a / 512) + (b / 19) to b - (b / 512) - (a / 19)
        }
        else {
            a - (a / 512) - (b / 19) to b - (b / 512) + (a / 19)
        }
    }



    fun move(flightRoll: Int, flightClimb: Int, flightSpeed:Int) {

        val alpha = flightRoll.toDouble() / 256.0
        val beta = flightClimb.toDouble() / 256.0

        var x = location.x
        var y = location.y
        var z = location.z

        if (!this.isDead()) {
            if (velocity != 0) {
                val speed = velocity.toDouble() * 1.5

                x += rotmat[2].x * speed
                y += rotmat[2].y * speed
                z += rotmat[2].z * speed
            }

            if (acceleration != 0) {
                velocity += acceleration
                acceleration = 0;
                if (velocity > shipData.velocity) {
                    velocity = shipData.velocity
                }

                if (velocity <= 0) {
                    velocity = 1;
                }
            }
        }

        val k2 = y - alpha * x
        z += beta * k2
        y = k2 - z * beta
        x += alpha * y

        z -= flightSpeed

        location = Vector(x, y, z)

        distance = sqrt (x*x+y*y+z*z).toInt()

        rotmat = Matrix(
                rotmat[0].rotate(alpha, beta),
                rotmat[1].rotate(alpha, beta),
                rotmat[2].rotate(alpha, beta)
        )


        if (isDead()) {
            return
        }



        /* If necessary rotate the object around the X axis... */

        if (rotx != 0) {
            val r1 = rotateXFirst(rotmat[2].x, rotmat[1].x, rotx)
            val r2 = rotateXFirst(rotmat[2].y, rotmat[1].y, rotx)
            val r3 = rotateXFirst(rotmat[2].z, rotmat[1].z, rotx)
            rotmat = Matrix(
                    rotmat[0],
                    Vector(r1.second, r2.second, r3.second),
                    Vector(r1.first, r2.first, r3.first)
            )

            if ((rotx != 127) && (rotx != -127))
                rotx -= if (rotx < 0) -1 else 1
        }


        /* If necessary rotate the object around the Z axis... */

        if (rotz != 0) {
            rotate_x_first(& obj->rotmat[0].x, &obj->rotmat[1].x, rotz);
            rotate_x_first(& obj->rotmat[0].y, &obj->rotmat[1].y, rotz);
            rotate_x_first(& obj->rotmat[0].z, &obj->rotmat[1].z, rotz);

            if ((rotz != 127) && (rotz != -127))
                rotz -= if (rotz < 0) -1 else 1
        }


        /* Orthonormalize the rotation matrix... */

        rotmat = rotmat.tidy()
    }

    fun drawWireframeShip(screen: Screen) {
        val transMat = Matrix(
                this.rotmat[0],
                this.rotmat[1],
                this.rotmat[2]
        )
        val cameraVec = this.location.multiplyMatrix(transMat).unitVector()
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
            val vec = v.multiplyMatrix(transMat.transpose())

            val rx = vec.x + this.location.x
            val ry = vec.y + this.location.y
            val rz = vec.z + this.location.z

            var sx = ((rx * 256) / rz).toInt()
            var sy = ((ry * 256) / rz).toInt()

            sy = -sy

            sx += 128
            sy += 96

            sx *= Screen.GFX_SCALE
            sy *= Screen.GFX_SCALE

            Point(sx, sy, 0)
        }

        this.shipData.lines.forEach { line ->
            if (visible[line.face1] || visible[line.face2]) {
                val sx = pointList[line.start_point].x
                val sy = pointList[line.start_point].y
                val ex = pointList[line.end_point].x
                val ey = pointList[line.end_point].y
                screen.drawLine(sx, sy, ex, ey)
            }
        }
    }
}
