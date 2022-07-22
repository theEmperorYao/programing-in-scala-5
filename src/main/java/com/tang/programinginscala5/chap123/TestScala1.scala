package com.tang.programinginscala5.chap123

import java.math.BigInteger
import scala.collection.mutable
import scala.compiletime.ops.int

object TestScala1 {

  def main(args: Array[String]): Unit = {
    var capital = Map("US" -> "Washington", "France" -> "Paris")

    capital += ("Japan" -> "Tokyo")

    println(capital("France"))

    def factorial(x: BigInt): BigInt =
      if x == 0 then 1 else x * factorial(x - 1)

    println(factorial(10));

    def factorial2(x: BigInteger): BigInteger =
      if x == BigInteger.ZERO then
        BigInteger.ONE
      else
        x.multiply(factorial2(x.subtract(BigInteger.ONE)))


    println(factorial2(BigInteger.valueOf(10)))
    val a = 1 + 2
    val c = 1.+(2)
    println(c)

    val name = "aaaE";

    val bool = name.exists(_.isUpper)
    println(bool)

    def max(x: Int, y: Int) = if x > y then x else y

    println(max(10, 34))

  }

}
