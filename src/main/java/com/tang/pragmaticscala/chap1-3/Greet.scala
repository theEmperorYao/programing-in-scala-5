//package com.tang.pragmaticscala.chap1.com.tang.pragmaticscala.chap1

object Greet {


  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3)
      print(s"$i,")
    println("Scala Rocks!!!")

    (1 to 3).foreach(i => print(s"$i,"))
  }

}
