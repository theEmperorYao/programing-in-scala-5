package com.tang.fast.chap1

import scala.collection.mutable.ArrayBuffer

class Network {

  outer =>
  class Member(var name: String):
    //Network#Member 类型投影
    val contacts = new ArrayBuffer[Network#Member]

  private val member = new ArrayBuffer[Member]

  def join(name: String) =
    val m = new Member(name)
    member += m
    m


}

@main def m = {

  val network = new Network
  val network1 = new Network

  val a3434: network.Member = new network.Member("a")

  val ererer: network1.Member = new network1.Member("d")

  val aa: network.Member = network.join("aa")
  val cc: network.Member = network.join("cc")
  aa.contacts += cc
  val barney: network1.Member = network1.join("Barney")
  aa.contacts += barney
  println()

}

