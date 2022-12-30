package com.tang.fast.chap1

class Accounts(val id: Int, initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) =
    balance += amount


}


object Accounts {
  def printInfo() = println(s"lastNumber: $lastNumber")

  private var lastNumber = 0

  def newUniqueNumber() =
    lastNumber += 1
    lastNumber

  def apply(initialBalance: Double) =
    val value = new Accounts(newUniqueNumber(), initialBalance)
    value

  def main(args: Array[String]): Unit = {
    val i: Int = newUniqueNumber()
    //    println(i)

    //    (1 to 12).foreach(i => println(newUniqueNumber()))
    //
    //    val action = Map("a" -> DoNothingAction, "b" -> DoNothingAction)
    //    val action1: DoNothingAction.type = action("a")
    //
    //    val array: Array[Array[Int]] = Array(Array(2199), Array(343))

    //    println(array.foreach(i => {
    //      if i.length == 0 then
    //        println()
    //      print(i.mkString("[", ",", "]"))
    //    }))

    //    apply()
    val value: Accounts = Accounts(1)
    val value1: Accounts = new Accounts(3, 323.3)

    val d: A = A("D")

    d.printInfo


  }
}



@main def m2 = {
  val a: A = A("3")
  a.printInfo
}


object Hello extends App :
  println("Hello world")
  args

class A private(name: String):
  def printInfo = println(s"$name")

object A:

  def apply(name: String): A = new A(name)

abstract class UndoableAction(val description: String):
  def undo: Unit

  def redo: Unit

object DoNothingAction extends UndoableAction("Do nothing") :
  override def redo: Unit = ???

  override def undo: Unit = ???

  override def toString: String = "啥也不做"

