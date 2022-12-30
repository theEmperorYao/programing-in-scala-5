package com.tang.test

import scala.annotation.tailrec
import scala.beans.BeanProperty

object Test07 {

  def main(args: Array[String]): Unit = {

    def arrayOperation(array: Array[String], op: String => String) = {
      array.map(elem => op(elem))
    }

    def arrayOperation2(array: Array[String], op: String => String) = {
      for elem <- array yield op(elem)
    }

    val array = Array("a", "b", "c")
    val strings1: Array[String] = arrayOperation(array, elem => elem.toUpperCase())
    println(strings1.mkString(","))
    val strings: Array[String] = arrayOperation2(array, elem => elem.toUpperCase())
    println(strings.mkString(","))

    def test(n: Int, s: String, c: Char): Boolean = (n == 0 && s == "0" && c == '0')

    val bool: Boolean = test(n = 0, s = "0", c = '0')
    println(bool)

    def test2(n: Int): String => Char => Boolean = {
      def test3(s: String): Char => Boolean = {
        def test4(c: Char) = {
          (n == 0 && s == "0" && c == '0')
        }

        test4
      }

      test3
    }

    val bool1: Boolean = test2(0)("0")('0')
    println(bool1)
    val bool2: Boolean = test2(1)("0")('0')
    println(bool2)


    def t2(n: Int): String => Char => Boolean = {
      s => c => (n == 0 && s == "0" && c == '0')
    }

    def t3(n: Int)(s: String)(c: Char) = {
      (n == 0 && s == "0" && c == '0')
    }

    val bool3: Boolean = t3(1)("0")('0')
    println(bool3)


    def fn(n: Int): Int =
      if n == 1 then 1 else fn(n - 1) * n

    println(fn(5))

    def tailFunc(n: Int): Int =
      @tailrec
      def fun(n: Int, curRes: Int): Int =
        if n == 0 then curRes else fun(n - 1, curRes * n)

      fun(n, 1)


    println("================")
    println(tailFunc(10))


    def f2(n: => Int) = {
      println(s"a${n}b")
      println(s"a${n}c")
    }

    f2({
      println("hahaha")
      1 + 3
    })

    var num = 1

    def testWhile(bool: => Boolean): (=> Unit) => Unit = {

      def Loop(op: => Unit): Unit =
        if bool then
          op
          testWhile(bool)(op)

      Loop
    }

    testWhile(num <= 20) {
      println(s"${num}")
      num += 1
    }

    num = 0

    def testWhile2(bool: => Boolean): (=> Unit) => Unit = {
      op =>
        if bool then
          op
          testWhile2(bool)(op)
    }

    testWhile2(num <= 20) {
      println(s"${num}")
      num += 1
    }

    num = 0

    def testWhile3(bool: => Boolean)(op: => Unit): Unit =
      if bool then
        op
        testWhile3(bool)(op)

    testWhile3(num <= 200) {
      println(s"${num}")
      num += 1
    }

    lazy val result = {
      println("aaaaaa")
      10
    }

    println("13e434134")
    println("33113133")
    println(result)
    val student = new Student()

    val age: Int = student.age

    println("------------------------------")



  }
}

class Student {

  @BeanProperty
  private var name: String = "tang"
  @BeanProperty
  var age: Int = _
  @BeanProperty
  var sex: String = _
}

