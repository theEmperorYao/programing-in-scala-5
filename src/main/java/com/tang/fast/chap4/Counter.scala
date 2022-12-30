package com.tang.fast.chap4

class Counter:
  private var value = 0

  def increment() = {
    value += 1
  }

  def current() = value

object Counter:
  def main(args: Array[String]): Unit = {

    val counter = new Counter

    counter.increment()

    println(counter.current())

//    val person = new Person
//    println(person.age)
//    person.age = 10
//    println(person.age)

  }
