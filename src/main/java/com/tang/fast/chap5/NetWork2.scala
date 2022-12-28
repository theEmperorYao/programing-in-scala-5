package com.tang.fast.chap5


import scala.collection.mutable.ArrayBuffer

/**
 * @Classname NetWork
 * @Description
 * @Date 2022/12/28 09:50
 * @Author by tangyao
 */
class NetWork2(val name: String):
  outer =>
  class Member(val name: String):
    def description = s"$name inside ${outer.name}"

    println(description)

  private val members = new ArrayBuffer[Member]()

  def join(name: String) =
    val m = new Member(name)
    members += m
    m


object NetWork2 {

  //  class Member(val name: String):
  //    val contacts = new ArrayBuffer[Member]()

  def main(args: Array[String]): Unit = {

    val tang: NetWork2 = new NetWork2("tang")
    val yao = new tang.Member("yao")
    println(yao)

  }
}