package com.tang.programinginscala5.chap7

/**
 * @Classname Chap716Test
 * @Description
 * @Date 2022/8/7 23:05
 * @Author by tangyao
 */
object Chap716Test {

  def main(args: Array[String]): Unit = {
    var i = 0
    var fountIt = false
    while i < args.length && !fountIt do
      if !args(i).startsWith("-") then
        if args(i).endsWith(".scala") then
          fountIt = true
        else
          i = i + 1
      else
        i = i + 1


    // 因为所有的递归调用都在函数尾部，所以编译器会生成与while一样的代码。
    def searchFrom(i: Int): Int = {
      if i > args.length then -1
      else if args.startsWith("-") then searchFrom(i + 1)
      else if args.endsWith(".scala") then i
      else searchFrom(i + 1)
    }

    val a = searchFrom(0)
    println(a)

    println(multiTable())
  }

  def makeRowSeq(row: Int) =
    for col <- 1 to 10 yield
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod

  def makeRow(row: Int) = makeRowSeq(row).toString()


  def multiTable() =
    val tableSwq =
      for row <- 1 to 10 yield
        makeRow(row)

    tableSwq.mkString("\n")

}
