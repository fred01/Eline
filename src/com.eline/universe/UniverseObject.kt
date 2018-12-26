package com.eline.universe

import com.eline.allegro.Screen
import com.eline.vector.Matrix
import com.eline.vector.Vector
import kotlin.math.sqrt

abstract class UniverseObject(
        var location: Vector,
        var rotmat: Matrix,
        var rotx: Int,
        var rotz: Int
) {
    var velocity: Int = 0
    var distance: Int = sqrt(
            location.x * location.x +
                    location.y * location.y +
                    location.z * location.z).toInt()

    var acceleration:Int = 0


    private fun rotateXFirst(a: Double, b: Double, direction: Int): Pair<Double, Double> {
        return if (direction < 0) {
            a - (a / 512) + (b / 19) to b - (b / 512) - (a / 19)
        } else {
            a - (a / 512) - (b / 19) to b - (b / 512) + (a / 19)
        }
    }

    fun moveObject() {
        val alpha = playerShip.flightRoll.toDouble() / 256.0
        var beta = playerShip.flightClimb.toDouble() / 256.0

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
                acceleration = 0
                if (velocity > maxVelocity()) {
                    velocity = maxVelocity()
                }

                if (velocity <= 0) {
                    velocity = 1
                }
            }
        }

        val k2 = y - alpha * x
        z += beta * k2
        y = k2 - z * beta
        x += alpha * y

        z -= playerShip.flightSpeed

        location = Vector(x, y, z)

        distance = sqrt(x * x + y * y + z * z).toInt()

        beta = correctBeta(beta)

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
            val r1 = rotateXFirst(rotmat[0].x, rotmat[1].x, rotz)
            val r2 = rotateXFirst(rotmat[0].y, rotmat[1].y, rotz)
            val r3 = rotateXFirst(rotmat[0].z, rotmat[1].z, rotz)
            rotmat = Matrix(
                    Vector(r1.first, r2.first, r3.first),
                    Vector(r1.second, r2.second, r3.second),
                    rotmat[2]
            )

            if ((rotz != 127) && (rotz != -127))
                rotz -= if (rotz < 0) -1 else 1
        }


        /* Orthonormalize the rotation matrix... */

        rotmat = rotmat.tidy()

    }

    abstract fun correctBeta(beta: Double): Double

    abstract fun isDead(): Boolean

    abstract fun draw(screen: Screen)

    abstract fun maxVelocity():Int

    fun action() {
        // Do nothing by default
    }

}


class Planet(location: Vector, rotmat: Matrix, rotx: Int, rotz: Int) : UniverseObject(location, rotmat, rotx, rotz) {
    override fun maxVelocity(): Int = 0

    override fun correctBeta(beta: Double): Double = 0.0

    override fun isDead(): Boolean = false

    override fun draw(screen: Screen) {

    }

}

class Sun(location: Vector, rotmat: Matrix, rotx: Int, rotz: Int) : UniverseObject(location, rotmat, rotx, rotz) {
    override fun maxVelocity(): Int = 0

    override fun correctBeta(beta: Double): Double = beta

    override fun isDead(): Boolean = false

    override fun draw(screen: Screen) {

    }

}