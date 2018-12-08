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
    fun multMatrix(m: Matrix): Vector {
        val x = (this.x * m.vector1.x) +
                (this.y * m.vector1.y) +
                (this.z * m.vector1.z)

        val y = (this.x * m.vector2.x) +
                (this.y * m.vector2.y) +
                (this.z * m.vector2.z);

        val z = (this.x * m.vector3.x) +
                (this.y * m.vector3.y) +
                (this.z * m.vector3.z);

        return Vector(x, y, z)
    }

    fun unitVector(): Vector {
        val lx = this.x
        val ly = this.y
        val lz = this.z

        val uni = sqrt(lx * lx + ly * ly + lz * lz);

        return Vector(lx / uni, ly / uni, lz / uni);
    }

    fun vectorDotProduct(second: Vector): Double {
        return (this.x * second.x) + (this.y * second.y) + (this.z * second.z)
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

    companion object {
        val startMatrix = Matrix(
                Vector(1.0, 0.0, 0.0),
                Vector(0.0, 1.0, 0.0),
                Vector(0.0, 0.0, 1.0)
        )

    }

}

//fun multVector(v: Vector, m: Matrix): Vector {
//    val x = (v.x * m.vector1.x) +
//            (v.y * m.vector1.y) +
//            (v.z * m.vector1.z)
//
//    val y = (v.x * m.vector2.x) +
//            (v.y * m.vector2.y) +
//            (v.z * m.vector2.z);
//
//    val z = (v.x * m.vector3.x) +
//            (v.y * m.vector3.y) +
//            (v.z * m.vector3.z);
//
//    return Vector(x, y, z)
//}
//
//fun unitVector(v: Vector): Vector {
//    val lx = v.x
//    val ly = v.y
//    val lz = v.z
//
//    val uni = sqrt(lx * lx + ly * ly + lz * lz);
//
//    return Vector(lx / uni, ly / uni, lz / uni);
//}

