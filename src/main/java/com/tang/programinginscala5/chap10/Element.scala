package com.tang.programinginscala5.chap10

/**
 * @Classname Element
 * @Description
 * @Date 2022/8/26 22:14
 * @Author by tangyao
 */
abstract class Element {
  def contents: Vector[String]

  def height: Int = contents.length

  // 对于没有参数且只通过读取所在对象字段的方式访问其状态（确切的说，并不改变状态）的情况
  // 尽量使用无参方法。这样的做法支持所谓的统一访问原则，可以用 val 替换 def
  // 替换为 val 后，访问速度可能更快一些，因为字段值在类初始化的时候就被计算好了

  def width: Int = if height == 0 then 0 else contents(0).length

}


object Element:
  def main(args: Array[String]): Unit = {
    println(Array(1, 2, 3).toString)
    println("abc".length)
  }

// 定义参数化字段
class VectorElement(val contents: Vector[String]) extends Element


object VectorElement:

  def main(args: Array[String]): Unit = {
    val ve: Element = VectorElement(Vector("hello", "world"))
    println(ve.width)

  }

class Cat:
  val dangerous = false

class Tiger(override val dangerous: Boolean, private var age: Int) extends Cat


object Tiger {
  def main(args: Array[String]): Unit = {
    println(Tiger(false, 10))
    println(LineElement("A"))

  }
}

class LineElement(s: String) extends VectorElement(Vector(s)) :
  override def width: Int = s.length

  override def height: Int = 1

class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element :
  private val line = ch.toString * width

  override def contents: Vector[String] = Vector.fill(height)(line)




object UniformElement {
  def main(args: Array[String]): Unit = {
    val element: Element = UniformElement('x', 3, 4)
    println(element.contents)
  }
}