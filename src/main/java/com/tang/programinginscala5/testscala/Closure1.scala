package com.tang.programinginscala5.testscala

import java.util
import java.util.{ArrayList, List}
import java.util.function.{IntSupplier, Supplier}

/**
 * @Classname Closure1
 * @Description
 * @Date 2022/9/4 15:08
 * @Author by tangyao
 */
object Closure1 {

  def makeFun(x: Int): () => Int = {
    var i = 10
    val i1: () => Int = () => i + x
    i += 1
    return i1
  }

  def main(args: Array[String]): Unit = {
    val i: Int = makeFun(10).apply()
    println(i)

  }

}
