package com.tang.pragmaticscala.chap1.com.tang.pragmaticscala.chap1

object SerialAssignments {

  def main(args: Array[String]): Unit = {
    var a = 1
    var b = 2

    val unit = b = 3

    println(unit)
    println(b)

    val str1 = "hello"
    val str2 = "hello"
    val str3 = new String("hello")

    // 等价于java str1.equals(str2)
    println(str1 == str2)
    // 等价于java str1 == str2
    println(str1 eq str2)
    println(str1 == str3)
    println(str1 eq str3)

  }

}
