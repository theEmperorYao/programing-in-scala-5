package com.tang.fast.chap6

/**
 * @Classname TrafficLightColor
 * @Description
 * @Date 2022/12/29 09:23
 * @Author by tangyao
 */
object TrafficLightColor extends Enumeration :
  val Red, Yellow, Green = Value

  //  val Red = Value(0, "Stop")
  //  val Yellow = Value(10)
  //  val Green = Value("Go")
  type TrafficLightColor = Value

  def doWhat(color: TrafficLightColor) =
    if color == Red then "stop"
    else if color == Yellow then "hurry up"
    else "go"


object A {


  def main(args: Array[String]): Unit = {
    for c <- TrafficLightColor.values do
      println(s"${c.id}:$c")

    TrafficLightColor(0)
  }
}