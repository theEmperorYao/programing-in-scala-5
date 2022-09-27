package com.tang.pragmaticscala.chap1.com.tang.pragmaticscala.chap1

class Microwave:
  def start(): Unit = println("started")

  def stop(): Unit = println("stoped")

  private def turnTable(): Unit = println("turning table")


object Access {

  def main(args: Array[String]): Unit = {

    val microwave = Microwave()

    microwave.start()
    


  }


}
