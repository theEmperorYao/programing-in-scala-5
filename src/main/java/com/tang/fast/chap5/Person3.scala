package com.tang.fast.chap5

/**
 * @Classname Person3
 * @Description
 * @Date 2022/12/27 20:59
 * @Author by tangyao
 */
class Person3 private(var name: String) {

  def this() = this("aaa")

}

object C:
  def main(args: Array[String]): Unit = {

    val person = new Person3()
    println(person)

  }
