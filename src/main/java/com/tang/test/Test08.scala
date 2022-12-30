package com.tang.test

object Test08 {
  def main(args: Array[String]): Unit = {
    val person = Person()
    println(person.age)
    println(person.sex)
    person.info()
    val worker: Worker = Worker()
    worker.info()
  }

}

class Worker extends Person :
  override def info(): Unit =
    println("Worker: ")
    name = "bob"
    age = 25
    sex = "female"
    println(s"Worker ${name} ${age} ${sex}")