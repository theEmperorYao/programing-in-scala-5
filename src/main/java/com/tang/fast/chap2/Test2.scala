package com.tang.fast.chap2

import scala.collection._

/**
 * @Classname Test2
 * @Description
 * @Date 2022/11/20 22:41
 * @Author by tangyao
 */
object Test2 {

  def main(args: Array[String]): Unit = {
    val source = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

    val map: mutable.Map[String, Int] = mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

    val name: String = "Alice"
    map.put(name, 11)
    println(map.getOrElse("ccc", "bbb"))
    val value: mutable.Map[String, Int] = map.withDefaultValue(0)

    val i = value("34")

    println(i)
    val value1: mutable.Map[String, Int] = value.withDefault(_.length)
    val i1: Int = value1("ddd")
    println(i1)

    value += ("ar" -> 1)
    value("Alice") = 111

    println(value)

    val value2: Map[String, Int] = source + ("df" -> 1)

    println(value2)
    source-"A"


  }

}
