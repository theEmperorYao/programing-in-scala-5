package com.tang.pragmaticscala.chap5

object OptooinExample {

  def commentOnPractice(input: String) =
    if input == "test" then
      Some("good")
    else
      None

  def compute(input: Int) =
    if input > 0 then
      Right(math.sqrt(input))
    else
      Left("Error computing, invalid input")

  def displayResult(result: Either[String, Double]): Unit =
    println(s"Raw:$result")
    result match {
      case Right(value) => println(s"result $value")
      case Left(err) => println(s"Error:$err")
    }

  def compute2(input: Any): Either[Array[String], Map[String, Any]] = {

    if (input.isInstanceOf[Map[String, Any]]) {
      println("hhhh")
    }

    if input.isInstanceOf[Array[String]] then
      Left(Array("a", "b", "C"))
    else
      Right(Map("a" -> "b", "c" -> 1))
  }

  def displayResult2(result: Either[Array[String], Map[String, Any]]) =
    println(s"Raw:$result")
    result match {
      case Right(value) => println(s"result 我是map $value")
      case Left(value) => println(s"result 我是数组 $value")
    }

  def main(args: Array[String]): Unit = {

    for (input <- Set("test", "hack")) do
      val comment = commentOnPractice(input)
      val commentDisplay = comment.getOrElse("Found no comments")
      println(s"input: $input comment:$commentDisplay")

    println(compute(-1))
    println(compute(-1).getClass)
    println(compute(1))
    println(compute(1).getClass)

    // 想表示一个值不存在，就使用Option类型，但是结果可能会在两个不同的值之间变化，就用Either
    displayResult(compute(-1))

    val ints = Array("a", "bbbb")

    displayResult2(compute2(ints))
    displayResult2(compute2(Map("1" -> 2)))



  }

}
