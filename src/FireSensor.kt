class FireSensor() : Sensor {
    val batteryTotal : Double = 100.0
    val drainSpeed : Double = 0.1
    var batteryLeft : Double = 0.0
    val type : String = "Fire sensor"
    val itsLocation : String = ""

    override fun isTriggered(): Boolean {
        val RNG = java.util.Random()
        if ((RNG.nextInt(100)+1 < 6)){
            return true
        }
        return false

    }

    override fun getLocation(): String {
        return itsLocation
    }

    override fun getSensortype(): String {
        return type
    }

    override fun getBatteryPercentage(): Double {
        return batteryLeft
    }

    fun drainBattery(){
        batteryLeft-=batteryTotal*drainSpeed
        if (batteryLeft < 0.0) {batteryLeft = 0.0}
    }
}