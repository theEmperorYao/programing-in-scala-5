package com.tang.pragmaticscala.chap4

class Vechile(val id: Int, val year: Int) {
  override def toString: String = s"ID:$id Year: $year"
}

class Car1(override val id: Int, override val year: Int, var fuelLevel: Int)
  extends Vechile(id, year) :
  override
  def toString: String = s"${super.toString} Fuel Level: $fuelLevel"


object Vechile:
  def main(args: Array[String]): Unit = {
    val car1 = new Car1(1, 2015, 3)
    println(car1)
  }

