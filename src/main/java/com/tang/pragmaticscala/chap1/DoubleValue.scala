package com.tang.pragmaticscala.chap1

object DoubleValue {


  def main(args: Array[String]): Unit = {
    val values = List(1, 2, 3, 4, 5)
    val doubleValues = values.map(_ * 2)
    println(doubleValues)
  }

}
