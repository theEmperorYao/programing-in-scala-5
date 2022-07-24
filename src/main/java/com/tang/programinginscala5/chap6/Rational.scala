package com.tang.programinginscala5.chap6

/**
 * @Classname Chap6Test
 * @Description TODO
 * @Date 2022/7/24 22:29
 * @Author by tangyao
 */
class Rational(n: Int, d: Int):
  println("Created " + n + "/" + d)

  // Scala编程中说 虽然n和d在类定义体中被使用，但是由于他们只出现在构造方法中，Scala编译器并不会为他们生成字段
  // 所以通过that.n 访问不到(猜测是不是已经超出作用域了)
  val number: Int = n
  val denom: Int = d

  require(d != 0) //如果为false会抛出IllegalArgumentException

  override def toString: String = s"$n/$d"

  def add(that: Rational): Rational =
    Rational(
      number * that.denom + that.number * denom,
      denom * that.denom)

  def aaa(that: Rational): Unit =
    println("n= " + n)
    println("d= " + d)
    println(that.number)
    println(that.denom)
//    Rational(
//      n * that.d + that.n * d,
//      d * that.denom)


object Rational:
  def main(args: Array[String]): Unit =
    val a = new Rational(1, 2)
    println(a)
    val y = Rational(3, 4)
    println(y)
    //    val b: Rational = Rational(3, 0)
    //    println(b)
    val oneHalf = Rational(1, 2)
    val twoThirds = Rational(2, 32)
    println(oneHalf.add(twoThirds))
    oneHalf.aaa(twoThirds)
    println(twoThirds.number)
    println(twoThirds.denom)


