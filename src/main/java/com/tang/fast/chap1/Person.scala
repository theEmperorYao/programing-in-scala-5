package com.tang.fast.chap1

import java.time.Instant

//主构造器的参数被编译成字段，其值被初始化成构造时传入的参数
class Person(val name: String, val age: Int) {
  println("Just constructed another person")

  def description = println(s"$name is $age years old")
}


class Person2(private var name: String, age: Int):

  //如果不带val var 的参数至少被一个方法所使用，它将被升格为字段
  //上述代码声明并初始化了不可变字段name age ，而这两个字段都是对象私有的
  //否则，该参数将不被保存为字段 它仅仅是一个可以被主构造器中的代码访问
  //的普通参数
  this.name = "10"
  println(s"$name is $age years old")

  def description = s"$name is $age years old"


  def getName = name


object Person {

  def main(args: Array[String]): Unit = {
    //    val tang = new Person("tang", 33)
    //    tang.description
    val tan = new Person2("tan", 3)
    println(tan.description)

    println(tan.getName)

  }


}


class Message:
  val instant: Instant = java.time.Instant.now()


