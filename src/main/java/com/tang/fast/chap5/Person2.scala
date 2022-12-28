//package com.tang.fast.chap4

/**
 * @Classname Person2
 * @Description
 * @Date 2022/12/27 12:55
 * @Author by tangyao
 */
class Person2(name: String = "", age: Int = 0):
  def description = name + " is "

  def getN() = name


//object Person2:
//  def main(args: Array[String]): Unit = {
//    val person = new Person2(name = "tang", age = 1)
//    println(person.name)
//    println(person.age)
//
//  }
