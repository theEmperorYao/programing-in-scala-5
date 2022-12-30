package com.tang.test

object Test10 {
  def main(args: Array[String]): Unit = {
    val student = new Student1
    val student2 = new Student1("tang")
    val student3 = new Student1("tang", 23)


  }

}

class Student1():
  var name: String = _
  var age: Int = _

  println("aaaa")

  def this(name: String) =
    this()
    println("1 辅助方法")
    this.name = name
    println(s"name:${name} age:${age}")

  def this(name: String, age: Int) =
    this(name)
    println("2 辅助方法")
    this.age = age
    println(s"name:$name age:$age")



