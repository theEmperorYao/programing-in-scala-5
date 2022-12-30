package com.tang.test

object Test11 {

  def main(args: Array[String]): Unit = {
    //    val tang = new Student2("tang", 22, "23434")
    val tang2 = new Student2("tang", 22)
  }

}

class Person2:
  var name: String = _
  var age: Int = _

  println("1 父类主构造器调用")

  def this(name: String, age: Int) =
    this()
    println("2 父类辅助构造器调用")
    this.name = name
    this.age = age

class Student2(name: String, age: Int) extends Person2 :

  var stuDno: String = _

  println("3 子类主构造器被调用")

  def this(name: String, age: Int, stuDno: String) =
    this(name, age)
    println("4 子类辅助构造器被调用")
    this.stuDno = stuDno

