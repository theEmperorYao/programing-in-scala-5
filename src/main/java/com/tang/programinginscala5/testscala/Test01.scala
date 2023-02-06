package com.tang.programinginscala5.testscala

import scala.annotation.tailrec


object Test01 {


  @tailrec
  def addRec(x: Int, y: Int): Int =
    if y == 0 then
      x
    else
      addRec(x + 1, y - 1)

  def main(args: Array[String]): Unit = {

    val i: Int = List(1, 2, 2, 1, 3).foldLeft(0)(_ ^ _)
    println(i)


    val i1: Int = addRec(0, 1000000)
    println(i1)


  }
}