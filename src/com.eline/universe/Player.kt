package com.eline.universe

import kotlin.math.abs

class Commander {
    var name: String = "JAMESON"
    var mission: Int = 0
    var shipX: Int = 0x14
    var shipY: Int = 0xAD
    @ExperimentalUnsignedTypes
    var galaxy = GalaxySeed()
    var credits: Int = 1000
    var fuel: Int = 70
    var galaxyNumber = 0
    var frontLaser: LaserType = LaserType.PULSE_LASER
    var cargoCapacity: Int = 20
    val currentCargo = CargoBay()
    val equipment = Equipment()
    var legalStatus: Int = 0
    val stationStock = CargoBay()
    var marketRnd: Int = 0
    var score: Int = 0
    var dockedPlanet: GalaxySeed? = null
    var hyperSpacePlanet: GalaxySeed? = null
}

class CargoBay {
    val cargo: Map<String, Int> = mutableMapOf()
}

class Equipment {
    var ecm: Boolean = false
    var fuelScoop: Boolean = false
    var energyBomb: Boolean = false
    var extraenergyUnit: Boolean = false
    var dockingComputer: Boolean = false
    var galacticHyperdrive: Boolean = false
    var escapePod: Boolean = false
    var missiles: Int = 3
}

enum class LaserType {
    PULSE_LASER,
    BEAM_LASER,
    MILITARY_LASER,
    MINING_LASER
}

var carry_flag: Int = 0

@ExperimentalUnsignedTypes
class GalaxySeed {
    var a = 0x4a.toUByte()
    var b = 0x5a.toUByte()
    var c = 0x48.toUByte()
    var d = 0x02.toUByte()
    var e = 0x53.toUByte()
    var f = 0xb7.toUByte()

    fun copy(copyTo:GalaxySeed) {
        copyTo.a = this.a
        copyTo.b = this.b
        copyTo.c = this.c
        copyTo.d = this.d
        copyTo.e = this.e
        copyTo.f = this.f
    }

    fun findPlanet(cx: Int, cy: Int): GalaxySeed {
        var minDist = 10000

        val planet = GalaxySeed()
        var distance: Int
        var dx: Int
        var dy: Int

        val glx = GalaxySeed()
        this.copy(glx)

        IntRange(0, 255).forEach {
            dx = abs(cx - glx.d.toInt())
            dy = abs(cy - glx.b.toInt())

            distance = if (dx > dy) {
                (dx + dx + dy) / 2
            } else {
                (dx + dy + dy) / 2
            }

            if (distance < minDist) {
                minDist = distance
                glx.copy(planet)
            }

            glx.waggle()
            glx.waggle()
            glx.waggle()
            glx.waggle()
        }

        return planet
    }

    fun namePlanet(): String {
        val digrams = "ABOUSEITILETSTONLONUTHNOALLEXEGEZACEBISOUSESARMAINDIREA?ERATENBERALAVETIEDORQUANTEISRION"
        var gp = ""
        var x: UInt
        val zero = 0x0.toUInt()

        val tmpPlanet = GalaxySeed()
        copy(tmpPlanet)

        val size = if ((tmpPlanet.a.and(0x40.toUByte())) == zero.toUByte()) {
            3
        } else {
            4
        }

        IntRange(0, size - 1).forEach {
            x = tmpPlanet.f.and(0x1F.toUByte()).toUInt()
            if (x != zero) {
                x = (x + 12.toUByte()).toUInt()
                x = (x * 2.toUByte()).toUInt()
                gp += digrams[x.toInt()]
                if (digrams[x.toInt() + 1] != '?') {
                    gp += digrams[x.toInt() + 1]
                }
            }
            tmpPlanet.waggle()
        }
        return gp
    }

    fun waggle() {
        var x: UInt = a + c
        var y: UInt = b + d

        if (x > 0xFF.toUInt()) {
            y++
        }

        x = x.and(0xFF.toUInt())
        y = y.and(0xFF.toUInt())

        a = c
        b = d
        c = e
        d = f

        x = x + c
        y = y + d

        if (x > 0xFF.toUInt()) {
            y++
        }

        carry_flag = if (y > 0xFF.toUInt()) {
            1
        } else {
            0
        }

        x = x.and(0xFF.toUInt())
        y = y.and(0xFF.toUInt())

        e = x.toUByte()
        f = y.toUByte()
    }
}

data class PlayerShipModel(
        val maxSpeed: Int,
        val maxRoll: Int,
        val maxClimb: Int,
        val maxFuel: Int
) {
    companion object {
        val CobraMk3 = PlayerShipModel(40, 31, 8, 70)
    }
}


class PlayerShip {
    var model = PlayerShipModel.CobraMk3
    val commander = Commander()
    var altitude: Int = 255
    var cabtemp: Int = 30
    var docked: Boolean = true
    var flightSpeed: Int = 0
    var flightRoll: Int = 0
    var flightClimb: Int = 0
    var frontShield: Int = 255
    var aftShield: Int = 255
    var energy: Int = 255

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
    var laserTemp: Int = 0
    var laserCounter: Int = 0
    var laser: Int = 0
    var ecmActive: Boolean = false
    var missileTarget: MissileStatus = MissileStatus.MISSILE_UNARMED

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