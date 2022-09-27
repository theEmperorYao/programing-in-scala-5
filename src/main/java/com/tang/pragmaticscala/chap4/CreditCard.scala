package com.tang.pragmaticscala.chap4

// 如果没有var 和 val ，则生成 private final 字段 仅供内部类使用，不会生成getter setter
// 被 var 修饰，生成 private creditLimit 并 有getter setter方法
// 被 val 修饰，生成 private int number 并 有getter setter方法
class CreditCard(val number: Int, var creditLimit: Int, a: Int) {

}

object CreditCard:
  def main(args: Array[String]): Unit = {
    val card = CreditCard(10, 13, 134)
    println(card.creditLimit)
    println(card.number)
//    println(card.a)

  }
