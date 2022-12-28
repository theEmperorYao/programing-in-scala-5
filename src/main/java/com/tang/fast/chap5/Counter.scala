package com.tang.fast.chap5

/**
 * @Classname Counter
 * @Description
 * @Date 2022/12/24 17:57
 * @Author by tangyao
 */
class Counter {
  private var value = 0

  def increment() = value += 1

  def current() = value

  def isLess(other: Counter) = value < other.value
}

@main def m1 = {
  val counter = new Counter
  val counter2 = new Counter
  counter2.increment()
  val bool: Boolean = counter.isLess(counter2)
  println(bool)
}
