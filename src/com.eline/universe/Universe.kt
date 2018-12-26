package com.eline.universe

import com.eline.ships.Ship
import com.eline.ships.ShipData
import com.eline.vector.Matrix
import com.eline.vector.Vector

class Universe {

    private val universeObjects:MutableList<UniverseObject> = mutableListOf()

    fun clearUniverse() = universeObjects.clear()

    fun addPlanet(x:Double,y:Double,z:Double) = universeObjects.add(Planet(Vector(x, y, z), Matrix.startMatrix,0,0))

    fun addSun(x:Double,y:Double,z:Double) = universeObjects.add(Sun(Vector(x, y, z), Matrix.startMatrix,0,0))

    fun addShip(data:ShipData, x:Double, y:Double, z:Double, rotMatrix:Matrix, rotX:Int, rotZ:Int):Ship {
        val ship = Ship(data, Vector(x, y, z), rotMatrix, rotX, rotZ)
        universeObjects.add(ship)
        return ship
    }

}

