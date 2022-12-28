package com.tang.fast.chap5


import scala.collection.mutable.ArrayBuffer

/**
 * @Classname NetWork
 * @Description
 * @Date 2022/12/28 09:50
 * @Author by tangyao
 */
class NetWork:

  // 在scala中，每个实例都有它的Member类
  class Member(val name: String):
    //NetWork#Member 类型投影，任何NetWork下的Member
    val contacts = new ArrayBuffer[NetWork#Member]()

  private val members = new ArrayBuffer[Member]()

  def join(name: String) =
    val m = new Member(name)
    members += m
    m


object NetWork {

  //  class Member(val name: String):
  //    val contacts = new ArrayBuffer[Member]()

  def main(args: Array[String]): Unit = {
    val chatter = new NetWork
    val myFace = new NetWork

    val fred = chatter.join("Fred")
    val wilma = chatter.join("Wilma")
    fred.contacts += wilma
    val barney = myFace.join("Barney")
    fred.contacts += barney
    println(fred)


  }
}