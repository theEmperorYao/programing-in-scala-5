package com.tang.programinginscala5.chap8

/**
 * @Classname Padding
 * @Description
 * @Date 2022/8/21 13:27
 * @Author by tangyao
 */
object Padding:

  def padLines(text: String, minWidth: Int): String =
    val paddedLines: Iterator[String] =
      for line <- text.linesIterator yield
        padLine(line, minWidth)
    paddedLines.mkString("\n")

  private def padLine(line: String, minWidth: Int): String =
    if line.length >= minWidth then line
    else line + " " * (minWidth - line.length)


  def padlines2(text: String, minWidth: Int): String =

    def padLine(line: String): String =
      if line.length >= minWidth then line
      else line + " " * (minWidth - line.length)

    val paddedLines: Iterator[String] =
      for line <- text.linesIterator yield
        padLine(line)

    paddedLines.mkString("\n")


  def main(args: Array[String]): Unit = {
    val str: String = padLines("abcdefg d的地方\n" +
      "341 " + "3的r", 102)
    println(str)

    val increase: Int => Int = (x: Int) => x + 1

    println(increase(10))

    val addTwo = (x: Int) => {
      val increment = 2
      x + increment
    }

    println(addTwo(10))

    val someNumbers = List(-11, 1, 3, 431)

    someNumbers.foreach(println)

    println("===============")
    someNumbers.filter(x => x > 0).foreach(println)

    println("===============")
    val value: List[Int] = someNumbers.filter(_ > 0)
    println(value)

    println("===============")
    val f = (_: Int) + (_: Int)
    println(f(3, 4))
    println("===============")

    def sum(a: Int, b: Int, c: Int) = a + b + c
    // 将函数sum应用到入参1，2，3上
    println(sum(1, 2, 3))

    val a = sum //名称为a的变量指向一个函数值对象

    println(a(3, 4, 2))

    println("===============")

    var more = 1
    val addMore: Int => Int = (x: Int) => x + more
    println(addMore(10))

    var sum1 = 0
    someNumbers.foreach(sum1 += _)
    println(sum1)
    println("===============")

    def makeIncrease(more: Int) = (x: Int) => x + more

    // scala的闭包捕获的是变量本身，而不是变量引用的值
    var x = 1
    val inc1 = makeIncrease(x)
    x = 9999
    val inc9999 = makeIncrease(x)

    println(inc1(10))
    println(inc9999(10))

  }
