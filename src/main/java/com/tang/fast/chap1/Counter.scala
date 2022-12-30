package com.tang.fast.chap1

class Counter {
  // 必须初始化字段
  private[this] var value = 0

  //方法默认公用
  def increment(): Unit = {
    value += 1
  }

  def current = value

  def isLess(other: Counter) = value < other.value

}


@main def m1() = {
  val a = new Counter
  val b = new Counter
  b.increment()
  val bool: Boolean = a.isLess(b)
  println(bool)
}
