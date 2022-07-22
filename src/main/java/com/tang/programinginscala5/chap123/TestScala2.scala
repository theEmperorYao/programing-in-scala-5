package com.tang.programinginscala5.chap123

import scala.collection.mutable

object TestScala2 {

  def main(args: Array[String]): Unit = {
    val greetStrings: Array[String] = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ","
    greetStrings(2) = "world!\n"
    val s = greetStrings.apply(2)
    greetStrings.update(2, "er")
    println("s:" + s)
    for i <- 0 to 2 do
      print(greetStrings(i))
      print(i)

    for (i <- 0.to(2)) {
      print(greetStrings(i))
    }
    Console println 10

    val numNames: Array[String] = Array("zero", "one", "two")
    val oneTwoThree = List(1, 2, 3)
    val fourFive = List(4, 5)
    val a = oneTwoThree ::: fourFive
    println(a)
    val b = 6 :: a
    println(b)

    val c = 1 :: 2 :: 3 :: Nil
    println(c)

    val d = c :+ 1111
    println(d)

    val pair: Tuple2[Int, String] = (99, "abc")
    val num = pair(0)
    val what = pair(1)
    println(num)
    println(what)

    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    val query = jetSet.contains("Lear")
    println(query)

    val movieSet = mutable.Set("Spotlight", "Moonlight")
    movieSet += "Parasite"

    println(movieSet)

    val treasureMap = mutable.Map.empty[Int, String]
    treasureMap += (1 -> "Go to island")
    treasureMap += (2 -> "find big X on groud")
    treasureMap += (3 -> "Dig.")
    val step2 = treasureMap(2)
    println(treasureMap)
    println(step2)

    val adjectives = List("One", "Two", "Red", "Blue")

    val nouns = adjectives.map(adj => adj + " Fish")

    println(nouns)

    val nonus2 = for adj <- adjectives yield
      adj + " Fish"

    println(nonus2)

    val lengths = nouns.map(adj => adj.length)
    println(lengths)

    val ques = Vector("Who", "What", "When", "Where", "Why")
    val useingMap = ques.map(q => q.toLowerCase + "?")
    println(useingMap)

    val usingForYield =
      for q <- ques yield
        q.toLowerCase + "?"

    println(usingForYield)
  }

}
