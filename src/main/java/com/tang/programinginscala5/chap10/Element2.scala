package com.tang.programinginscala5.chap10

import com.tang.programinginscala5.chap10.Element2.elem

/**
 * @Classname Element2
 * @Description
 * @Date 2022/8/27 01:01
 * @Author by tangyao
 */
abstract class Element2:
  def contents: Vector[String]

  def height: Int = contents.length

  def width: Int = if height == 0 then 0 else contents(0).length

  def demo = "Element's implemention invoked"



  def above(that: Element2): Element2 =
    elem(this.contents ++ that.contents)

  def beside(that: Element2): Element2 =
    val newContents = new Array[String](this.contents.length)
    for i <- this.contents.indices do
      newContents(i) = this.contents(i) + that.contents(i)
    elem(newContents.toVector)

  def beside2(that: Element2): Element2 =
    elem(
      for (line1, line2)
    <- this.contents.zip(that.contents)
    yield line1 + line2

  )

end Element2

class VectorElement2(val contents: Vector[String]) extends Element2 :
  //  final
  override def demo: String = "VectorElements's implementation invoked"

  //  override def contents: Vector[String] = Vector("a")
  override def toString: String = contents.mkString("\n")

class LineElement2(s: String) extends Element2 :

  override def demo: String = "LineElements's implementation invoked"

  val contents = Vector(s)

class UniformElement2(ch: Char, override val width: Int, override val height: Int) extends Element2 :
  val contents = Vector(ch.toString * width)


//def invokeDemo(e: Element2) = e.demo


@main def m =
  //  println(invokeDemo(VectorElement2()))
  //  println(invokeDemo(UniformElement2()))

  val element: Element2 = VectorElement2(Vector("1")).above(VectorElement2(Vector("2")))
  println(element.toString)
  val element1: Element2 = VectorElement2(Vector("13414", "3434", "Ererer")).beside2(VectorElement2(Vector("34", "3edeee", "3434")))
  println(element1.toString)

object Element2:

  private class VectorElement2(val contents: Vector[String]) extends Element2

  private class LineElement2(s: String) extends Element2 :
    val contents = Vector(s)

    override def width: Int = s.length

    override def height: Int = 1

  private class UniformElement2(ch: Char, override val width: Int, override val height: Int) extends Element2 :
    private val line = ch.toString * width

    override def contents: Vector[String] = Vector.fill(height)(line)


  def elem(contents: Vector[String]): Element2 = VectorElement2(contents)

  def elem(chr: Char, width: Int, height: Int): Element2 = UniformElement2(chr, width, height)

  def elem(line: String): Element2 = LineElement2(line)










