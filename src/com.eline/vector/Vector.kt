package com.eline.vector

import kotlin.math.sqrt

data class Point(
        val x:Int,
        val y:Int,
        val z:Int
)

data class Vector(
        val x: Double,
        val y: Double,
        val z: Double
) {
    fun multiplyMatrix(m: Matrix): Vector {
        val vx = (x * m[0].x) +
                (y * m[0].y) +
                (z * m[0].z)

        val vy = (x * m[1].x) +
                (y * m[1].y) +
                (z * m[1].z)

        val vz = (x * m[2].x) +
                (y * m[2].y) +
                (z * m[2].z)

        return Vector(vx, vy, vz)
    }

    fun unitVector(): Vector {
        val uni = sqrt(x * x + y * y + z * z)
        return Vector(x / uni, y / uni, z / uni)
    }

    fun vectorDotProduct(second: Vector): Double {
        return (x * second.x) + (y * second.y) + (z * second.z)
    }

    fun rotate (alpha:Double, beta:Double):Vector {
        var lx = x
        var ly = y
        var lz = z

        ly -= alpha * lx
        lx += alpha * ly
        ly -= beta * lz
        lz += beta * ly

        return Vector(lx, ly, lz)
    }


    fun decZ(value:Int):Vector {
        return this.copy(z = this.z - value)
    }
}

data class Matrix(
        val vector1: Vector,
        val vector2: Vector,
        val vector3: Vector
) {
    operator fun get(i:Int): Vector {
        return when (i) {
            0 -> vector1
            1 -> vector2
            2 -> vector3
            else -> throw IndexOutOfBoundsException("Do not have element $i")
        }
    }

    fun transpose(): Matrix {
        return Matrix(
                Vector(this[0].x, this[1].x, this[2].x),
                Vector(this[0].y, this[1].y, this[2].y),
                Vector(this[0].z, this[1].z, this[2].z)
        )
    }

    fun tidy(): Matrix {

        val v2 = this[2].unitVector()

        val v1c = if ((v2.x > -1) && (v2.x < 1))
        {
            if ((v2.y > -1) && (v2.y < 1))
            {
                val v1z = -(v2.x * this[1].x + v2.y * this[1].y) / v2.z
                Vector(this[1].x, this[1].y, v1z)
            }
            else
            {
                val v1y = -(v2.x * this[1].x + v2.z * this[1].z) / v2.y
                Vector(this[1].x, v1y, this[1].z)
            }
        }
        else
        {
            val v1x = -(v2.y * this[1].y + v2.z * this[1].z) / v2.x
            Vector(v1x,  this[1].y, this[1].z)
        }

        val v1 = v1c.unitVector()


        /* xyzzy... nothing happens. :-)*/

        val v0 = Vector(
                v1.y * v2.z - v1.z * v2.y,
                v1.z * v2.x - v1.x * v2.z,
                v1.x * v2.y - v1.y * v2.x
        )

        return Matrix(v0, v1, v2)
    }

    companion object {
        val startMatrix = Matrix(
                Vector(1.0, 0.0, 0.0),
                Vector(0.0, 1.0, 0.0),
                Vector(0.0, 0.0, 1.0)
        )
        fun initMatrix() = Matrix(
                Vector(1.0, 0.0, 0.0),
                Vector(0.0, 1.0, 0.0),
                Vector(0.0, 0.0, 1.0)
        )
    }

}

