package com.tang.test

object CollectionUtilities:

  def foldLeft[T, U](list: List[T], identity: U, f: Function[U, Function[T, U]]): U = {
    var result: U = identity
    //    for t <- list do
    //      result = f.apply(result).apply(t)
    //    result
    list.foreach(t => {
      result = f.apply(result).apply(t)
    })
    result
  }

  
  def foldLeft2[T, U](list: List[T], identity: U, f: U => T => U): U = {
    var result = identity
    val it = list.iterator
    while it.hasNext do
      result = f(result)(it.next())
    result

  }

  def foldRight[T, U](list: List[T], identity: U, f: U => T => U): U = {
    var result: U = identity

    list.foreach(t => {
      result = f.apply(result).apply(t)
    })
    result
  }


  def main(args: Array[String]): Unit = {

    //    val list = List("a", "b", "c", "d")
    val list = List(1, 2, 3, 4, 5)


    val str: String = foldLeft(list, "0", x => y => "(" + x + "+" + y + ")")
    val str2: String = foldLeft2(list, "0", x => y => "(" + x + "+" + y + ")")

    println(str)
    println(str2)

  }

