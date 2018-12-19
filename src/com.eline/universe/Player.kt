package com.eline.universe

class Commander {
    var name:String = "JAMESON"
    var mission:Int = 0
    var shipX: Int = 0x14
    var shipY: Int = 0xAD
    @ExperimentalUnsignedTypes
    var galaxy = GalaxySeed()
    var credits: Int = 1000
    var fuel: Int = 70
    var galaxyNumber = 0
    var frontLaser:LaserType = LaserType.PULSE_LASER
    var cargoCapacity:Int = 20
    val currentCargo = CargoBay()
    val equipment = Equipment()
    var legalStatus:Int = 0
    val stationStock = CargoBay()
    var marketRnd:Int = 0
    var score:Int = 0
}

class CargoBay {
    val cargo:Map<String, Int> = mutableMapOf()
}

class Equipment {
    var ecm:Boolean = false
    var fuelScoop:Boolean = false
    var energyBomb:Boolean = false
    var extraenergyUnit:Boolean = false
    var dockingComputer:Boolean = false
    var galacticHyperdrive:Boolean = false
    var escapePod:Boolean = false
    var missiles:Int = 3
}

enum class LaserType {
    PULSE_LASER,
    BEAM_LASER,
    MILITARY_LASER,
    MINING_LASER
}

@ExperimentalUnsignedTypes
class GalaxySeed {
    var a = 0x4a.toUByte()
    var b = 0x5a.toUByte()
    var c = 0x48.toUByte()
    var d = 0x02.toUByte()
    var e = 0x53.toUByte()
    var f = 0xb7.toUByte()
}

data class PlayerShipModel(
        val maxSpeed:Int,
        val maxRoll:Int,
        val maxClimb:Int,
        val maxFuel:Int
) {
    companion object {
        val CobraMk3 = PlayerShipModel(40,31,8,70)
    }
}


class PlayerShip {
    var model = PlayerShipModel.CobraMk3
    val commander = Commander()
	var altitude:Int = 255
	var cabtemp:Int = 30
    var docked:Boolean = true
    var flightSpeed:Int = 0
    var flightRoll:Int = 0
    var flightClimb:Int = 0
    var frontShield:Int = 255
    var aftShield:Int = 255
    var energy:Int = 255

    val weapon = PlayerShipWeapon()

    fun dock() {
        docked = true
        flightSpeed = 0
        flightRoll = 0
        flightClimb = 0
        frontShield = 255
        aftShield = 255
        energy = 255
        weapon.reset()
    }

}

class PlayerShipWeapon {
    var laserTemp:Int = 0
    var laserCounter:Int = 0
    var laser:Int = 0
    var ecmActive:Boolean = false
    var missileTarget:MissileStatus = MissileStatus.MISSILE_UNARMED

    fun reset() {
        laserTemp = 0
        laserCounter = 0
        laser = 0
        ecmActive = false
        missileTarget = MissileStatus.MISSILE_UNARMED
    }
}

enum class MissileStatus {
    MISSILE_UNARMED,
    MISSILE_ARMED
}

val playerShip = PlayerShip()