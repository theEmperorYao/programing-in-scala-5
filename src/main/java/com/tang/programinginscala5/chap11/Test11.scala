//package com.tang.programinginscala5.chap11
//
//import scala.collection.mutable.ArrayBuffer
//import scala.tools.nsc.doc.html.HtmlTags.THead
//
///**
// * @Classname Test11
// * @Description
// * @Date 2022/12/20 22:53
// * @Author by tangyao
// */
//
//abstract class IntQueue:
//  def get(): Int
//
//  def put(x: Int): Unit
//
//
//class BasicIntQueue extends IntQueue :
//  private val buf = ArrayBuffer.empty[Int]
//
//  def get(): Int = buf.remove(0)
//
//  def put(x: Int) = buf += x
//
//
//object Test11 {
//  def main(args: Array[String]): Unit = {
//    val queue = new BasicIntQueue
//    queue.put(10)
//    queue.put(20)
//    queue.get()
//    queue.get()
//
////    Thread.startVirtualThread(() => {
////      val name: String = Thread.currentThread().getName
////      println("aaaa" + name)
////    })
//
////    Thread.sleep(123232)
//
//  }
//}
//
//
