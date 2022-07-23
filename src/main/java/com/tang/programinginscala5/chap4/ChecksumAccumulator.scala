package com.tang.programinginscala5.chap4

import scala.collection.mutable

/**
 * @Classname ChecksumAccumulator
 * @Description TODO
 * @Date 2022/7/23 17:00
 * @Author by tangyao
 */
class ChecksumAccumulator:
  private var sum = 0

  def add(b: Byte) = sum += b

  def checksum(): Int = ~(sum & 0xFF) + 1

// 当单例对象和某个类共用一个名称时，他就被乘坐这个类的伴生对象。
// 同时，类又叫做这个单例对象的伴生类，类和他的伴生对象可以互相访问对方的私有成员
object ChecksumAccumulator:
  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int =
    if cache.contains(s) then
      cache(s)
    else
      val acc = new ChecksumAccumulator
      for c <- s do
        acc.add((c >> 8).toByte)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs

  def main(args: Array[String]): Unit = {
    println(calculate("aaa"))
    println(calculate2("aaa"))
    println("111")
    println("ccc")
  }


  def calculate2(s: String): Int = {

    if (cache.contains(s)) {
      cache(s)
    } else {
      val acc = new ChecksumAccumulator()
      for (c <- s) {
        acc.add((c >> 8).toByte)
        acc.add(c.toByte)
      }
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }

