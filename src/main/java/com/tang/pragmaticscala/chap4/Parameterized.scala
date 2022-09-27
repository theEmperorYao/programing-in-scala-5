package com.tang.pragmaticscala.chap4

class Parameterized {
  def echo[T](input1: T, input2: T): Unit =
    println(s"got $input1(${input1.getClass}) $input2 (${input2.getClass})")

  def echo2[T1, T2](input1: T1, input2: T2): Unit =
    println(s"receive $input1 and $input2")
}

class Message[T](val content: T):
  override def toString: String = s"message content is $content"

  def is(value: T): Boolean = value == content

@main def main =
  val parameterized1 = new Parameterized
  parameterized1.echo(12, "3")
  //  parameterized1.echo[Int]("hi", 4)
  parameterized1.echo2(10, "dd")
  val message1 = new Message("howdy")
  val message2 = new Message(42)

  println(message1.is("howdy"))
  println(message1.is("er"))
  println(message2.is(22))
  // 字符会被默默转化为兼容的Int类型
  println(message2.is('A'))
  


