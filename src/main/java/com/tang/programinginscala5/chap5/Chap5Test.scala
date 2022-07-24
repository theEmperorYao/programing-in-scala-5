package com.tang.programinginscala5.chap5

import scala.language.postfixOps

/**
 * @Classname StringTest
 * @Description TODO
 * @Date 2022/7/24 12:54
 * @Author by tangyao
 */
@main def m() =
  println(
    """welcome to Ultamix 3000 .
      |Type "Help" for help.
      |""".stripMargin)
  val bool = true
  val name = "reader"
  println(s"Hello $name")
  println(s"The answer is ${6 * 7}")
  println(raw"No\\\escape")
  println(f"${math.Pi}%.5f")
  println(f"${math.Pi}")
  println(1.+(2))
  println(1.+(3L))
  val s = "Hello world"
  println(s indexOf 'o') // 操作符表示法
  println(-2.0)
  println(2.0.unary_+)
  println(7.toDouble)
  println(7 toFloat)
  println(s toUpperCase)
  println(-1 >> 31)
  println(-1 >>> 31)
  println(-1 << 31)
  val value = List(1, 3, 4)
  val value2 = value
  println(value == List(1, 3, 4))
  println(value eq value2)
  val x = value
  val value1 = x ::: List(2, 3, 4)
  println(value1.toSet)



