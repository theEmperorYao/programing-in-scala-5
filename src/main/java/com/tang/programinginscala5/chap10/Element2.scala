package com.tang.programinginscala5.chap10

/**
 * @Classname Element2
 * @Description
 * @Date 2022/8/27 01:01
 * @Author by tangyao
 */
abstract class Element2 {
  def demo = "Element's implemention invoked"
}

class VectorElement2 extends Element2 :
  override def demo: String = "VectorElements's implementation invoked"

class LineElement2 extends VectorElement2 :
  override def demo: String = "LineElements's implementation invoked"

class UniformElement2 extends Element2

def invokeDemo(e: Element2) = e.demo

@main def m(args: String*) =
  println(invokeDemo(VectorElement2()))
  println(invokeDemo(UniformElement2()))


