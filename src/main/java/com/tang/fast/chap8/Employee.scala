package com.tang.fast.chap8

import com.fasterxml.jackson.core.io.UTF8Writer

import java.io.PrintWriter
import java.nio.charset.{Charset, StandardCharsets}
import java.nio.file.{Files, Paths, Path}

/**
 * @Classname Employee
 * @Description
 * @Date 2022/12/29 09:46
 * @Author by tangyao
 */

class Person(name: String, age: Int):
  override def toString: String = s"${getClass.getName} [name=$name]"

class Employee(name: String, age: Int, val salary: Double) extends Person(name, age) :

  override def toString: String = s"${super.toString}[salary=$salary]"


object Employee:
  def main(args: Array[String]): Unit = {
    val employee = new Employee("tangyao", 24, 100)
    println(employee)

    if employee.isInstanceOf[Employee] then
      val employee1: Employee = employee.asInstanceOf[Employee]


    employee match {
      case employee1: Employee =>
      case _ =>
    }

    if employee.getClass == classOf[Employee] then
      val employee1: Employee = employee.asInstanceOf[Employee]

    val writer = new PathWriter(Paths.get("E:\\迅雷下载\\1.txt"), StandardCharsets.UTF_8)
    writer.print("aaa")
    writer.close()
    println()
  }

class PathWriter(p: Path, cs: Charset) extends PrintWriter(Files.newBufferedWriter(p, cs))

