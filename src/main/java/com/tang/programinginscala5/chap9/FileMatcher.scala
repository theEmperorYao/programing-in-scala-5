package com.tang.programinginscala5.chap9

import java.io.{File, PrintWriter}
import java.time.{LocalDate, LocalDateTime}
import scala.util.control.Breaks.break

/**
 * @Classname FileMatcher
 * @Description
 * @Date 2022/8/23 00:44
 * @Author by tangyao
 */
object FileMatcher {

  private def filesHere = (new File(".")).listFiles()

  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))

  def filesMatching(matcher: (String) => Boolean) =
    for file <- filesHere if matcher(file.getName) yield file

  def containsNeg(nums: List[Int]): Boolean =
    var exists = false
    for num <- nums do
      if num < 0 then
        exists = true
    exists

  def containNeg2(nums: List[Int]): Boolean = nums.exists(_ < 0)

  def containOdd(nums: List[Int]): Boolean =
    var exists = false
    for num <- nums do
      if num % 2 == 1 then
        exists = true
    exists

  def containOdd2(nums: List[Int]): Boolean = nums.exists(_ % 2 == 0)

  def plainOldSum(x: Int, y: Int) = x + y

  def curriedSum(x: Int)(y: Int) = x + y

  def first(x: Int) = (y: Int) => x + y

  def twice(op: Double => Double, x: Double) = op(op(x))


  def main(args: Array[String]): Unit = {
    println(containsNeg(List(-1, 3, 3)))
    println(containsNeg(Nil))
    println(containNeg2(List(-1, 3, 4, 5)))
    println(containOdd(List(2, 34, 5)))
    println(containOdd2(List(3, 343, 1)))
    println(plainOldSum(1, 2))
    println(curriedSum(1)(34))
    val second = first(1)
    println(second)
    println(second(2))
    val onePlus = curriedSum(1)
    println(onePlus(23333))
    val twoPlus = curriedSum(2)
    println(twoPlus(2))
    println(twice(a => a * 2, 3))

    def withPrintWriter(file: File, op: PrintWriter => Unit) =
      val writer = new PrintWriter(file)
      try op(writer)
      finally writer.close()


    //    withPrintWriter(new File("data.txt"), _.println(LocalDateTime.now()))


    val s = "Hello,world!"
    s.charAt(1)

    println(s.charAt {
      1
    })

    def withPrintWriter2(file: File)(op: PrintWriter => Unit) =
      val writer = new PrintWriter(file)
      try op(writer)
      finally writer.close()

    // 一个参数的时候可以用花括号，目的是让调用方程序员在花括号中编写函数字面量，让方法用起来更像是抽象控制
    //控制抽象被描述为是一系列语句的聚集，是一种特殊的函数，因为它是本质上只是对一系列语句的封装，所以它理应
    //没有参数输入；
    //没有值返回
    withPrintWriter2(new File("data.txt")) {
      writer => writer.println(LocalDateTime.now())
    }

    var assertionEnabled = true

    def myAssert(predicate: () => Boolean) =
      if assertionEnabled && !predicate() then
        throw new AssertionError

    myAssert(() => 5 > 3) // 更希望直接输入5>3

    def byNameAssert(predicate: => Boolean) =
      if assertionEnabled && !predicate then
        throw new AssertionError

    def boolAssert(predicate: Boolean) =
      if assertionEnabled && !predicate then
        throw new AssertionError

    // 5>3不会被提前计算，表达式5>3 在调用byNameAssert之前不会被求值
    // 而是有一个函数值被创建出来，这个函数值的apply方法将会对5>3求值传入byNameAssert的是这个函数值
    println(byNameAssert(5 > 3))

    val x = 5
    assertionEnabled = false
    //    boolAssert(x / 0 == 0) //java.lang.ArithmeticException: / by zero

    byNameAssert(x / 0 == 0)

  }


}
