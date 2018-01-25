class ControlUnit {

    fun pollSensors() {
        val sensors = ArrayList<Sensor>()
        sensors.add(FireSensor())
        sensors.add(SmokeSensor())

        for (sensor in sensors) {
            if (sensor.isTriggered()) {
                println("A ${sensor.getSensortype()}  sensor was triggered at  ${sensor.getLocation()}")
            } else {
                println("Polled ${sensor.getSensortype()} at ${sensor.getLocation()}  successfully")
            }
        }

    }
    // this version of pollSensors uses a provider and a renderer instead of creating sensors directly
    fun pollSensors2(){
        val renderer : SensorRenderer = SensorRendererClass()
        val FireProvider : Sensor = FireSensor()
        val SmokeProvider : Sensor = SmokeSensor()

        render(renderer, FireProvider)
        render(renderer, SmokeProvider)
    }

    fun render(Renderer : SensorRenderer, Provider : Sensor){
        Renderer.sensor = Provider
        Renderer.render()
    }

}