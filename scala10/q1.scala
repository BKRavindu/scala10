object TemperatureConverter {
  def calculateAverage(temperatures: List[Int]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9/5.0) + 32.0)
    val sum = fahrenheitTemperatures.reduce((total, temperature) => total + temperature)
    val average = sum / temperatures.length
    average
  }

  def main(args: Array[String]): Unit = {
    val temperatures = List(0, 10, 20, 30)
    val averageFahrenheit = calculateAverage(temperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }
}


