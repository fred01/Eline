package com.eline.universe

import com.eline.ships.Ship
import com.eline.ships.ShipData
import com.eline.vector.Matrix
import com.eline.vector.Vector
import coriolisData

class Universe {
    private lateinit var sun:Sun
    private lateinit var planet:Planet
    private lateinit var station:Ship
    val universeObjects:MutableList<UniverseObject> = mutableListOf()

    fun clearUniverse() = universeObjects.clear()

    fun addPlanet(x:Double,y:Double,z:Double) {
        planet = Planet(Vector(x, y, z), Matrix.startMatrix,0,0)
        universeObjects.add(planet)
    }

    fun addSun(x:Double,y:Double,z:Double) {
        sun = Sun(Vector(x, y, z), Matrix.startMatrix,0,0)
        universeObjects.add(sun)
    }

    fun addShip(data:ShipData, x:Double, y:Double, z:Double, rotMatrix:Matrix, rotX:Int, rotZ:Int):Ship {
        val ship = Ship(data, Vector(x, y, z), rotMatrix, rotX, rotZ)
        universeObjects.add(ship)
        return ship
    }
    fun addNewStation(sx:Double, sy:Double, sz:Double, rotMatrix: Matrix) {
        station = addShip(coriolisData, sx, sy, sz, rotMatrix, 0, -127)
    }
}

val universe = Universe()
