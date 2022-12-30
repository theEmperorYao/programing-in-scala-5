package com.tang.fast.chap1

import java.text.MessageFormat
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn
import scala.util.*

object Test1 {

  def main(args: Array[String]): Unit = {
    val str: String = "Hello".intersect("world")
    println(str)

    val int: Int = 99.44.toInt
    println(int)
    val char: Char = "99".toInt.toChar
    println(char)

    val tuple: (BigInt, BigInt) = BigInt.int2bigInt(10) /% 13
    println(tuple)

    val x: BigInt = 123456789

    println(x * x * x)

    val sorted: String = "djckqq".sorted
    println(sorted)


    val d: Double = math.sqrt(122)
    println(d)

    val int1: BigInt = BigInt.probablePrime(5, Random)
    println(int1)

    val s = "hello"
    println(s(4))
    println(s.sorted.apply(3))
    val sorted1: String = s.sorted

    val i: Int = "hello".count(_ == 'l')
    println(i)

    "hello".count(_.isUpper)
    val bool: Boolean = "Bierstube".containsSlice('r' to 'u')
    println(bool)

    //    val name = "tang"
    //    val age = 16
    //    print(f"Hello $name! In six months,you will be ${age + 0.5}%4.2f years old.%n")
    //    print(raw"\nHello $name! In six months,you will be ${age + 0.5}%4.2f years old.%n")
    //    print(s"\nHello $name! In six months,you will be ${age + 0.5}%4.2f years old.%n")

    //    val name: String = StdIn.readLine("Your name: ")
    //    println("you age: ")
    //    val age = StdIn.readInt()
    //    println(s"Hello $name! Next year ,you will be ${age + 1}")


    val value: IndexedSeq[Int] = for i <- 1 to 3; j <- 1 to 3 if i != j
      yield
        print(f"${10 * i + j}  ")
        10 * i + j

    println(value)

    for (i <- 1 to 3; from = 4 - i; j <- from to 3) print(f"${10 * i + j}%3d")

    println("=====================")
    val value1: IndexedSeq[Char] = for c <- "Hello"; i <- 0 to 1 yield (c + i).toChar
    println(value1)

    def sum(nums: Int*) =
      var sum = 0
      for n <- nums do
        sum += n
      sum

    val i1: Int = sum(2, 34, 5, 6)
    println(i1)
    // 把这个参数当做参数序列处理
    println(sum(1 to 6: _ *))


    def recursiveSum(args: Int*): Int = {
      if args.length == 0 then 0
      else
        println(args.head)
        println(args.tail)
        args.head + recursiveSum(args.tail: _*)
    }

    println(recursiveSum(1 to 10: _*))
    val str2 = MessageFormat.format("The answer to {0} is {1} ",
      "everything", 42.asInstanceOf[AnyRef])
    println(str2)

    val value2 = new ArrayBuffer[String]()
    value2.addOne("aa")
    value2 += "bb"
    value2 += ("d", "df", "fd")
    value2 ++= Array("df", "cd", "3")
    value2 ++= ArrayBuffer("df", "cd", "3")
    value2.toArray
    println(value2)

    val range: Range = 0 until 100 by -1

    //    val buffer: mutable.Buffer[Int] = range.toBuffer
    //    println(buffer)
    //    range.foreach(println)

    for i <- (0 until 100).reverse.by(-3) do
      println(i)

    val a = ArrayBuffer(1, 34, -3, 315, -1)
    val result = for elem <- a if elem >= 0 yield elem
    println(result.toVector)
    //    val positionsToRemove = for i <- a.indices if a(i) < 0 yield i
    //    for i <- positionsToRemove.reverse do
    //      a.remove(i)

    //    print(positionsToRemove)

    val positionsToKeep = for (i <- a.indices if a(i) >= 0) yield i


    for j <- positionsToKeep.indices do
      a(j) = a(positionsToKeep(j))

    a.trimEnd(a.length - positionsToKeep.length)

    println(a)

  }


}