package com.tang.pragmaticscala.chap1.com.tang.pragmaticscala.chap1

import java.util

object OptionalSemicolon {

  def main(args: Array[String]): Unit = {

    val list1 = new util.ArrayList[Int]();
    {
      println("Created list1")
    }


    val list2 = new util.ArrayList[Int]()
    {
      println("Created list2")
    }

    println(list1.getClass)
    println(list2.getClass)

  }

}
