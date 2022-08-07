package com.tang.programinginscala5.chap7

import java.io.{FileNotFoundException, FileReader, IOException}
import java.net.{MalformedURLException, URL}

/**
 * @Classname Chap711Test
 * @Description
 * @Date 2022/8/7 21:58
 * @Author by tangyao
 */
object Chap711Test {

  def half(n: Int) =
    if n % 2 == 0 then
      n / 2
    else
      throw new RuntimeException("n must be even")


  def urlFor(path: String) =
    try new URL(path)
    catch
      case e: MalformedURLException => new URL("http://www.*******.org")

  def f(): Int = try return 1 finally return 2

  def g(): Int = try 1 finally 2
  


  def main(args: Array[String]): Unit = {
    //    var f = new FileReader("input.txt")
    try new FileReader("input.txt")
    catch
      case ex: FileNotFoundException => println("文件没找到")
      case ex: IOException =>

    //      f.close()

    println(f())
    println(g())

    val firstArg = if !args.isEmpty then args(0) else ""

    firstArg match
      case "salt" => println("pepper")
      case "chips" => println("salsa")
      case "eggs" => println("bacon")
      case _ => println("huh?")

    val friend =
      firstArg match
        case "salt" => "pepper"
        case "chips" => "salsa"
        case "eggs" => "bacon"
        case _ => "huh?"

    println(friend)

  }


}

