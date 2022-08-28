package com.tang.programinginscala5.chap10

import com.tang.programinginscala5.chap10.Element3.elem

/**
 * @Classname Element3
 * @Description
 * @Date 2022/8/27 01:01
 * @Author by tangyao
 */
abstract class Element3:
  def contents: Vector[String]

  // 多少行
  def height: Int = contents.length

  // 每行几个字符
  def width: Int = if height == 0 then 0 else contents(0).length

  // 使得两个列表一样、宽，将两个列表合并起来
  def above(that: Element3): Element3 =
    val this1 = this.widen(that.width)
    val that1 = that.widen(this.width)
    elem(this1.contents ++ that1.contents)

  // 使得两个列表一样高，将两个列表合并起来
  def beside(that: Element3): Element3 =
    val this1 = this.heighten(that.height)
    val that1 = that.heighten(this.height)
    elem(
      for (line1, line2)
    <- this1.contents.zip(that1.contents)
    yield line1 + line2

  )

  def widen(w: Int): Element3 =
    if w <= width then this
    else
      val left = elem(' ', (w - width) / 2, height)
      val right = elem(' ', w - width - left.width, height)
      left beside this beside right

  def heighten(h: Int): Element3 =
    if h <= height then this
    else
      val top = elem(' ', width, (h - height) / 2)
      val bot = elem(' ', width, h - height - top.height)
      top above this above bot

  override def toString: String =
    contents.mkString("\n")
  //    println("=======================")
  //    s"contents:${contents}" + "\n" + s"height:${height}" + "\n" + s"width:${width}"


end Element3


object Element3:

  private class VectorElement3(val contents: Vector[String]) extends Element3

  private class LineElement3(s: String) extends Element3 :
    val contents = Vector(s)

    override def width: Int = s.length

    override def height: Int = 1

  private class UniformElement3(ch: Char, override val width: Int, override val height: Int) extends Element3 :
    private val line = ch.toString * width

    override def contents: Vector[String] = Vector.fill(height)(line)


  def elem(contents: Vector[String]): Element3 = VectorElement3(contents)

  def elem(chr: Char, width: Int, height: Int): Element3 = UniformElement3(chr, width, height)

  def elem(line: String): Element3 = LineElement3(line)

  def main(args: Array[String]): Unit = {
    val element1: Element3 = elem('a', 2, 4)
    println(element1)
    val element2: Element3 = elem("tang111")
    println(element2)
    val element3: Element3 = elem(Vector("a", "B", "C"))
    println(element3)

    val element4: Element3 = element1 above element2
    println(element4)

    val element5: Element3 = element1 beside element2
    println(element5)


  }

end Element3









