package com.tang.fast.chap8

class Person81(val name: String):
  override def toString: String = s"${getClass.getName} [name=$name]"


class SecretAgent(codename: String) extends Person81(codename) :

  override val name = "secret"
  override val toString = "secret"

abstract class Person82:
  def id: Int

class Student(override val id: Int) extends Person82

abstract class Person83(val name: String):
  def greeting: String

  def hello: String

object Person81 {
  def main(args: Array[String]): Unit = {

    val alien = new Person83("Fred") {
      def greeting = "Greetings,Earthling! My name is Fred."

      def hello: String = "B"
    }
    val person8 = new Person83("C") {
      def greeting: String = "A"

      def hello: String = "B"
    }


    def meet(p: Person83): Unit = {
      println(s"${p.name} says: ${p.greeting} ${p.hello}")
    }

    val unit = meet(person8)

  }
}