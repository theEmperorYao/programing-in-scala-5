package com.tang.fast.chap8

import org.springframework.context.annotation.Lazy

class Creature:
  val range: Int = 10

  val env: Array[Int] = new Array[Int](range)

class Ant extends Creature {

  override final val range: Int = 2
}



object Ant {
  def main(args: Array[String]): Unit = {
    val ant = new Ant
    println()
  }
}




