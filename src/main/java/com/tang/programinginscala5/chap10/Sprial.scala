package com.tang.programinginscala5.chap10

import com.tang.programinginscala5.chap10.Element3.elem


/**
 * @Classname Sprial
 * @Description
 * @Date 2022/8/28 13:14
 * @Author by tangyao
 */
object Sprial:
  val space = elem(" ")
  val corner = elem("+")

  def sprial(nEdges: Int, direction: Int): Element3 =
    if nEdges == 1 then
      elem("+")
    else
      val sp = sprial(nEdges - 1, (direction + 3) % 4)

      def verticalBar = elem('|', 1, sp.height)

      def horizontalBar = elem('-', sp.width, 1)

      if direction == 0 then
        (corner beside horizontalBar) above (sp beside space)
      else if direction == 1 then
        (sp above space) beside (corner above verticalBar)
      else if direction == 2 then
        (space beside sp) above (horizontalBar beside corner)
      else
        (verticalBar above corner) beside (space above sp)


  def main(args: Array[String]): Unit = {
    val nSides =  3
    println(sprial(nSides, 0))
  }

end Sprial
