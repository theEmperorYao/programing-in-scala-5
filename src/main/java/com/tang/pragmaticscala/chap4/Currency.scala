package com.tang.pragmaticscala.chap4

object Currency extends Enumeration {
  // 告诉编译器将单词Currency视作一个类型而不是一个实例
  type Currency = Value
  val CNY, GBP, INR, JPY, NOK, PLN, SEK, USD = Value

  def main(args: Array[String]): Unit = {
    println(Currency.getClass)
  }
}

object UseCurrency extends App {
  Currency.values.foreach(println)
}

