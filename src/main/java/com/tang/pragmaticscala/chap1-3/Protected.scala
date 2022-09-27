package com.tang.pragmaticscala.chap1.com.tang.pragmaticscala.chap1


class Vehicle:
  protected def checkEngine() = {

  }

class Car extends Vehicle {
  def start() = checkEngine()

  def tow(car: Car) = car.checkEngine()

//  def tow(vehicle: Vehicle) = vehicle.checkEngine()

}

class GasTtation
//  def fillGas(vehicle: Vehicle) = vehicle.checkEngine()

object Protected {
  def main(args: Array[String]): Unit = {
    
  }
}
