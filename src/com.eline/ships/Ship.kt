package com.eline.ships

import com.eline.allegro.Screen
import com.eline.universe.UniverseObject
import com.eline.vector.Matrix
import com.eline.vector.Point
import com.eline.vector.Vector


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

class Ship(
        val shipData: ShipData,
        location: Vector,
        rotmat: Matrix,
        rotx: Int,
        rotz: Int
):UniverseObject(location, rotmat, rotx, rotz) {
    override fun maxVelocity(): Int = shipData.velocity
    override fun correctBeta(beta: Double): Double = beta

    var energy: Int = shipData.energy
    var missiles: Int = shipData.missiles
    var target: Int = 0
    var bravery: Int = 0
    val expDelta: Int = 0
    val expSeed: Int = 0
    private var dead = false
    private var remove = false
    private var angry = false

    override fun draw(screen: Screen) {
        drawWireframeShip(screen)
    }

    override fun isDead(): Boolean = dead


    private fun drawWireframeShip(screen: Screen) {
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
                cosAngle < -0.1
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

            sx += screen.screenCenterX / 2
            sy += screen.screenCenterY / 2

            sx *= 2
            sy *= 2

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
