package com.tang.pragmaticscala.chap4

class Person(val firstName: String, val lastName: String) {

  var postiton: String = _
  println(s"Creating $toString")

  def this(firstName: String, lastName: String, positionHeld: String) =
    this(firstName, lastName)
    postiton = positionHeld

  override def toString: String =
    s"$firstName $lastName holds $postiton position"
}

@main def m1() =
  val john = new Person("John", "Smith", "Analyst")
  println(john)
  val bill = new Person("Bill", "Walker")
  println(bill)




