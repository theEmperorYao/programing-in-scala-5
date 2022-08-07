package com.tang.programinginscala5.chap7

import java.io.File
import scala.io.Source
import scala.io.StdIn.readLine


/**
 * @Classname Chap7Test
 * @Description
 * @Date 2022/8/6 15:58
 * @Author by tangyao
 */
object Chap7Test:


  def gcdLoop(x: Long, y: Long): Long =
    var a = x
    var b = y
    val c = while a != 0 do
      val temp = a
      a = b % a
      b = temp
    println(c)
    b

  def greet() = println("hi")

  val iAmUnit = greet() == ()

  println(s"iAmUnit = $iAmUnit")

  def add: Unit = {

  }
  

  def main(args: Array[String]) =
    var fileName = "default.txt"
    if !args.isEmpty then
      fileName = args(0)
    println(fileName)

    val fileName2 = if !args.isEmpty then args(0) else "default"
    println(fileName2)

    println(gcdLoop(1000, 4))

    //    while
    //      val line = readLine()
    //      println(s"Read: $line")
    //      line != ""
    //    do ()

    //    var line = ""
    //    val a = line = readLine()
    //    println("a:" + a)
    //    println(line)
    // 对 var 再赋值本身也是unit值
    // 赋值语句的结果永远是单元值()，也就是line = readLine() 会返回 一个unit值

    //    while (line = readLine()) != "" do
    //      println(s"Read:$line")
    val filesHere = (File(".")).listFiles

    for file <- filesHere do
      println(file)

    for i <- 1 to 4 do
      println(s"Interation $i")

    for i <- 1 until 4 do
      println(s"Interation $i")


    for i <- 0 to filesHere.length - 1 do
      println(filesHere(i))

    println("===================")
    for file <- filesHere if file.getName.endsWith(".git") do
      println(file)


    for file <- filesHere do
      val unit: Unit = if file.getName.endsWith(".git") then println(file)
      println(unit)


    println("===================")

    for
      file <- filesHere
      if file.isDirectory
      if file.getName.endsWith(".git")
    do println(file)


    def fileLines(file: File) =
      Source.fromFile(file).getLines().toArray

    def grep(pattern: String) =
      val files: Array[File] = (File("./src/main/java/com/tang/programinginscala5/chap4")).listFiles
      for
        file <- files
        if file.isFile
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
        if line.trim.matches(pattern)
      do println(s"file:{ ${line.trim} }")

    val files: Array[File] = (File("./src/main/java/com/tang/programinginscala5/chap4")).listFiles

    def grep2(pattern: String) =
      for
        file <- files
        if file.isFile
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(pattern)
      do println(s"file:{ $trimmed }")

    grep2(".*cache.*")


    val scalaFiles: Array[File] =
      for file <- files
          if file.getName.endsWith(".scala")
      yield file

    scalaFiles.foreach(file => println(file.getName))


    val forLineLengths: Array[Int] =
      for
        file <- files
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(".*cache.*")
      yield trimmed.length

    println("===========")
    forLineLengths.foreach(println(_))

    println("=============")

    










