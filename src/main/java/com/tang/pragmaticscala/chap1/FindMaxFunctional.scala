package com.tang.pragmaticscala.chap1

object FindMaxFunctional {

  def findMaxFunctional(temperatures: List[Int]) =
    temperatures.foldLeft(Integer.MIN_VALUE) {
      Math.max
    }

  def findMax(temperatures: List[Int]) =
    var highTemperature = Integer.MIN_VALUE
    for (temperature <- temperatures)
      highTemperature = Math.max(highTemperature,temperature)

    highTemperature


  

}
