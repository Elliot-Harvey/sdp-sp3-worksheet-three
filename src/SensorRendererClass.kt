class SensorRendererClass : SensorRenderer {
    override fun render() {
        if (sensor!!.isTriggered()) {
            println("A ${sensor!!.getSensortype()}  sensor was triggered at  ${sensor!!.getLocation()}")
        } else {
            println("Polled ${sensor!!.getSensortype()} at ${sensor!!.getLocation()}  successfully")
        }
    }

        override var sensor: Sensor? = null

}