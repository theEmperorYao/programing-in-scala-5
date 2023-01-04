package com.tang.fast.chap9

import scala.collection.MapOps
import scala.io.Source

class RegexTest


object RegexTest:
  def main(args: Array[String]): Unit = {
    //    val source = Source.fromFile("myfile.txt", "UTF-8")
    //    val lineIterator = source.getLines()

    val array: Array[Int] = Array(2, 3, 4)

    val c = array.foldLeft(1)((a, b) => {
      println(s"$a * $a + $b = ${a * a + b}")
      a * a + b
    })

    println(c)

  }
