package com.tang.programinginscala5.controller

import com.tang.programinginscala5.chap6.Rational
import com.tang.programinginscala5.testjava.Test1
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

import java.util
import scala.util.parsing.json.JSON
import collection.mutable.*
import scala.collection.mutable
import scala.jdk.CollectionConverters.*


/**
 * @Classname ScalaController
 * @Description TODO
 * @Date 2022/8/6 15:06
 * @Author by tangyao
 */

@RestController
@GetMapping(value = Array("bb"))
class ScalaController @Autowired()(var rational: Rational) {


  @GetMapping(value = Array("helloworld"))
  def getString: String = {
    val test = new Test1()
    rational.toString
  }

  @GetMapping(value = Array("map"))
  def getMapping: Any = {
    //
    //    val map = Map("a" -> "b", "c" -> "d")
    //
    //
    //    println(map)
    //创建一个Scala集合
    val list2 = List(1, 2, 3, 4, 5, 6, 7)

    //导入隐式转换


    //scala集合转换成java集合

    val list = new util.ArrayList[Int]
    list.addAll(util.Arrays.asList(1, 3, 4))
    val scala: mutable.Buffer[Int] = list.asScala


    val value: mutable.Seq[Int] = Seq(1, 3, 5)
    val a = value.asJava
    a

    Map(1 -> 2, "3" -> 3).asJava

  }


}

object ScalaController {
  val n = 100_000_000


  def a() = for (i <- 0 until n) println(s"for loop with $i")

  def b() =
    var i = 0;
    while (i < n) {
      println(s"while loop with $i")
      i += 1
    }

  def main(args: Array[String]): Unit = {
    //81343923323
    //88454889325
    //83950050854
    val l1: Long = System.nanoTime()
    a()
    val l2: Long = System.nanoTime()



    val l3: Long = System.nanoTime()
    b()
    val l4: Long = System.nanoTime()
    println(l2 - l1)
    println(l4 - l3)


  }
}