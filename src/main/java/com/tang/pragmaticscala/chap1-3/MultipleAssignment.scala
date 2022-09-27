package com.tang.pragmaticscala.chap1.com.tang.pragmaticscala.chap1


object MultipleAssignment {

  def getPersonInfo(primaryKey: Int) =
    val tuple: (String, String, String) = ("Venkat", "Subramnaiam", "xx@qq.com")
    tuple

  val (firstName, lastName, emailAddress) = getPersonInfo(1)
  val info = getPersonInfo(1)

  def max(values: Int*) = values.foldLeft(values(0)) {
    Math.max
  }


  def main(args: Array[String]): Unit = {
    println(s"First Name: $firstName")
    println(s"Last Name: $lastName")
    println(s"emailAddress: $emailAddress")

    val value = info._1
    println(s"info_1 :$value")
    val i: Int = max(10, 34, 3, 53, 5)
    println(i)

    def function(input: Int*): Unit = println(input.getClass)

    function(1, 2, 4)

    val numbers = Array(3, 4, 5, 6, 2)
    function(numbers: _*)

    def mail(destination: String = "head office", mailClass: String = "first"): Unit =
      println(s"sending to $destination by $mailClass class");

    mail("Houston office", "Priority")
    mail("Boston office")
    mail(mailClass = "aaa")

    println("==================================")
    atOffice()
    atJoesHome()

    val str =
      s""" for you ask
         | what you can do
         | |for yoour contry $lastName
         |""".stripMargin

    println(str)

    println(s"$$${1 * 3}")

    println(f"$$${10 * 200 / 9.0}%1.5f")

    val c1 = new Complex(1, 2)
    val c2 = new Complex(2, -3)
    val sum = c1 + c2
    println(s"($c1)+($c2)=$sum")

  }

}

class Wifi(name: String):
  override def toString: String = name

def coonnectToNetWork(user: String)(implicit wifi: Wifi): Unit =
  println(s"User: $user connected to WIFI $wifi")

def atOffice(): Unit =
  println("---at the office---")

  implicit def officeNetWork: Wifi = new Wifi("office-network")

  val cafeteriaNetwork = new Wifi("cafe-connect")

  coonnectToNetWork("guest")(cafeteriaNetwork)
  coonnectToNetWork("Jill Coder")
  coonnectToNetWork("Joe Hacker")

def atJoesHome(): Unit =
  println("---at Joe's home---")

  implicit def homeNetWork: Wifi = new Wifi("home-network")

  coonnectToNetWork("guest")(homeNetWork)
  coonnectToNetWork("Joe Hacker")

class Complex(val real: Int, val imagenary: Int):
  def +(operand: Complex): Complex = new Complex(real + operand.real, imagenary + operand.imagenary)

  override def toString: String =
    val sign = if imagenary < 0 then "" else "+"
    s"$real$sign${imagenary}i"
    
  


