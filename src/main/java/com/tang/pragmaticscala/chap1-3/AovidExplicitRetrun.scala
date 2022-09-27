package com.tang.pragmaticscala.chap1.com.tang.pragmaticscala.chap1

object AovidExplicitRetrun {

  def main(args: Array[String]): Unit = {
    def check1 = true

    def check2: Boolean = return true

    def check3: Boolean = true

    println(check1)
    println(check2)
    println(check3)

  }

}
