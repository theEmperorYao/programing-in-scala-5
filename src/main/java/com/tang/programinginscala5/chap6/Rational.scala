package com.tang.programinginscala5.chap6

/**
 * @Classname Chap6Test
 * @Description TODO
 * @Date 2022/7/24 22:29
 * @Author by tangyao
 */

extension (x: Int)
  def +(y: Rational) = Rational(x) + y
  def -(y: Rational) = Rational(x) - y
  def *(y: Rational) = Rational(x) * y
  def /(y: Rational) = Rational(x) / y

/**
 *
 * scala编译器将会采集这两个类参数，并创建一个主构造方法，接收同样的两个参数
 *
 * @param n 类参数
 * @param d
 */
class Rational(n: Int, d: Int):
  //会将在类定义体中给出的非字段或方法定义的代码编译进主构造方法中
  //  println("Created " + n + "/" + d)

  // require 方法定义在Predef中，所有的scala源文件，都会自动引入Predef对象的成员
  require(d != 0) //如果为false会抛出IllegalArgumentException


  private val g = gcd(n.abs, d.abs)
  // Scala编程中说 虽然n和d在类定义体中被使用，但是由于他们只出现在构造方法中，Scala编译器并不会为他们生成字段
  // 所以通过that.n 访问不到(猜测是不是已经超出作用域了)
  val number: Int = n / g
  val denom: Int = d / g


  // 主构方法是类的唯一入口
  def this(n: Int) = this(n, 1)

  override def toString: String = s"$number/$denom"

  def add(that: Rational): Rational =
  // 用n和d也行，但是that 只能用number和denom
  //    Rational(
  //      n * that.denom + that.number * d,
  //      d * that.denom)
    Rational(
      number * that.denom + that.number * denom,
      denom * that.denom)

  def lessThan(that: Rational) =
    number * that.denom < that.number * denom

  def max(that: Rational) =
    if lessThan(that) then that else this

  private def gcd(a: Int, b: Int): Int =
    if b == 0 then a else gcd(b, a % b)

  def +(that: Rational): Rational = Rational(number * that.denom + that.number * denom, denom * that.denom)

  def +(i: Int): Rational = Rational(number + i * denom, denom)

  def *(that: Rational) = Rational(number * that.number, denom * that.denom)

  def *(i: Int) = Rational(number * i, denom)


  def -(that: Rational) = Rational(number * that.denom - that.number * denom, denom * that.denom)

  def -(i: Int) = Rational(number - i * denom, denom)

  def /(that: Rational) = Rational(number * that.denom, denom * that.denom)

  def /(i: Int) = Rational(number, i * denom)

object Rational:
  def main(args: Array[String]): Unit =
    val a = new Rational(1, 2)
    println(a)
    // 通用应用方法
    val y = Rational(3, 4)
    println(y)
    //    val b: Rational = Rational(3, 0)
    //    println(b)
    val oneHalf = Rational(1, 2)
    val twoThirds = Rational(2, 3)
    println(oneHalf.add(twoThirds))
    println(twoThirds.number)
    println(twoThirds.denom)
    val rational: Rational = oneHalf.max(twoThirds)
    println(rational)
    val rational2 = Rational(2)

    println(rational2)
    println(Rational(66, 42))

    val v = oneHalf + twoThirds
    val x1 = oneHalf
    val y1 = twoThirds

    val z1 = x1 + x1 * y1
    println(z1)

    val z2 = (x1 + x1) * y1
    println(z2)
    Thread.`yield`()

    println(x1 * 2)
    println(2 * x1)













