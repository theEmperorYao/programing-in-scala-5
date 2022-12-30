package com.tang.fast.chap8

/**
 * @Classname Employee
 * @Description
 * @Date 2022/12/29 09:46
 * @Author by tangyao
 */

class Person(name: String):
  override def toString: String = s"${getClass.getName} [name=$name]"

class Employee(name: String) extends Person(name) :
  var salary = 3.0

  override def toString: String = s"${super.toString}[salary=$salary]"


object Employee:
  def main(args: Array[String]): Unit = {
    val employee = new Employee("tangyao")
    println(employee)

    if employee.isInstanceOf[Employee] then
      val employee1: Employee = employee.asInstanceOf[Employee]

    if employee.getClass == classOf[Employee] then
      val employee1: Employee = employee.asInstanceOf[Employee]


  }


