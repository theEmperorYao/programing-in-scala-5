package com.tang.fast.chap2

import java.util
import scala.collection.{Searching, mutable}
import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting
import scala.collection.JavaConverters.asJava
import scala.jdk.CollectionConverters.*
import scala.jdk.javaapi.CollectionConverters

/**
 * @Classname Test1
 * @Description
 * @Date 2022/11/19 12:58
 * @Author by tangyao
 */
object Test1 {

  def main(args: Array[String]): Unit = {

    val ints: Array[Int] = Array(1, 34, 4, 3, 4)
    val sum: Int = ints.sum
    println(sum)

    val value: mutable.Buffer[Int] = ints.toBuffer.sortWith(_ < _)
    val ints1 = value
    println(ints1)
    Sorting.quickSort(ints)
    println(ints.mkString("[", ",", "]"))

    val array = new Array[Any](5)
    println(array.mkString(","))
    ints.copyToArray(array, 4, 2)
    println(array.mkString(","))

    val value1: IndexedSeq[Char] = ArrayBuffer('c', 'd') ++: "cd"
    println(value1)

    val array1: Array[Array[Double]] = Array.ofDim[Double](3, 4)

    array1(2)(3) = 123

    array1.foreach(a => println(a.mkString(",")))

    var triangle = new Array[Array[Int]](10)

    triangle.indices.foreach(i => triangle(i) = new Array[Int](i + 1))

    println()

    val a: Array[String] = Array("Mary", "a", "had", "lamd", "little")

    val i: Int = java.util.Arrays.binarySearch(a.asInstanceOf[Array[Object]], "beef")
    println(i)
    println("===========")
    val result: Searching.SearchResult = a.search("litt33le")
    println(result)

    val value2: ArrayBuffer[String] = ArrayBuffer("ls", "ar", "d3", "34")

    val strings: util.List[String] = collection.JavaConverters.asJava(value2)
    //    scala.jdk.CollectionConverters.


    val s2: java.util.Set[String] = Set("one", "two").asJava

    val strings1: util.Set[String] = CollectionConverters.asJava(Set("one"))
    val value3: mutable.Set[String] = CollectionConverters.asScala(strings1)


    val strings2 = new util.HashSet[String]
    strings2.add("a")
    println(strings2)

    val round: Long = -1.6.round
    println(round)


  }

}
