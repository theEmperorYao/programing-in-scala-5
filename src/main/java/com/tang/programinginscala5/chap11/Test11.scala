package com.tang.programinginscala5.chap11

import scala.collection.mutable.ArrayBuffer

/**
 * @Classname Test11
 * @Description
 * @Date 2022/12/20 22:53
 * @Author by tangyao
 */

abstract class IntQueue:
  def get(): Int

  def put(x: Int): Unit


class BasicIntQueue extends IntQueue :
  private val buf = ArrayBuffer.empty[Int]

  def get(): Int = buf.remove(0)

  def put(x: Int) = buf += x

trait Doubling extends IntQueue :
  abstract override def put(x: Int) = super.put(2 * x)

trait Incrementing extends IntQueue :
  abstract override def put(x: Int): Unit = super.put(x + 1)

trait Filtering extends IntQueue :
  abstract override def put(x: Int): Unit = if x >= 0 then super.put(x)

class MyQueue extends BasicIntQueue, Incrementing, Doubling :
  override def put(x: Int): Unit =
    super[Incrementing].put(x)
    super[Doubling].put(x)


object Test11 {
  def main(args: Array[String]): Unit = {
    val queue = new BasicIntQueue
    queue.put(10)
    queue.put(20)
    val a: Int = queue.get()
    val b: Int = queue.get()
    println(a)
    println(b)

    val q2 = new BasicIntQueue with Doubling
    q2.put(10)
    val i: Int = q2.get()
    println(i)


    val q3 = new BasicIntQueue with Incrementing with Filtering
    q3.put(-1)
    q3.put(0)
    q3.put(1)
    val i1 = q3.get()
    val i2 = q3.get()
    println(i1)
    println(i2)

    println("==============")
    val q4 = new BasicIntQueue with Incrementing with Doubling

    q4.put(1)
    q4.put(2)
    println(q4.get())
    println(q4.get())
    println("==============")
    val myQueue = new MyQueue
    myQueue.put(10)
    myQueue.put(20)

    println()


  }
}


