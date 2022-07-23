package com.tang.programinginscala5.chap4

/**
 * @Classname Person
 * @Description TODO
 * @Date 2022/7/23 18:19
 * @Author by tangyao
 */
case class Person(name: String, age: Int):
  def appendToName(suffix: String): Person =
    Person(s"$name$suffix", age)

object Person:
  def apply(name: String, age: Int): Person =
    val capitalizedName =
      if !name.isEmpty then
        val fisrtChar = name.charAt(0).toUpper
        val restOfName = name.substring(1)
        s"$fisrtChar$restOfName"
      else
        throw new IllegalArgumentException("Empty name")

    new Person(capitalizedName, age)