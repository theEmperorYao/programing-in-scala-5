package com.tang.pragmaticscala.chap4

import scala.collection.*

// 一个类的构造器，包括主构造器，也可以标记为private
class Marker private(val color: String) {

  println(s"Creating ${this}")

  override def toString: String = s"mark color $color"

}

// 类与其伴生对象间没有边界——他们可以互相访问私有字段和方法。
object Marker:
  private val markers = mutable.Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "yellow" -> new Marker("yellow")
  )

  def getMarker(color: String): Marker =
    markers.getOrElseUpdate(color, new Marker(color))

  def supportedColors: Iterable[String] = markers.keys

  def apply(color: String): Marker = markers.getOrElseUpdate(color, op = new Marker(color))

  def main(args: Array[String]): Unit =
    //    println(Marker getMarker "blue")
    //    println(Marker getMarker "blue")
    //    println(Marker getMarker "red")
    //    println(Marker getMarker "red")
    //    println(Marker getMarker "green")
    println(s"Supported colors are : ${Marker.supportedColors}")
    println(Marker("blue"))
    println(Marker("red"))




