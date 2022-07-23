package com.tang.programinginscala5.chap4

/**
 * @Classname PersonTest
 * @Description TODO
 * @Date 2022/7/23 18:20
 * @Author by tangyao
 */
object PersonTest {

  def main(args: Array[String]): Unit = {
    val p = Person("Sally", 30)
    println(p)
    println(Person.apply("aa", 34))
    println(p.age)
    println(p.name)
    println(p.toString)

    println(p == Person("Sally", 32))
    println(p.hashCode() == Person("Sally", 32).hashCode())
    println(p == Person("James", 39))
    println(p.hashCode() == Person("James", 39).hashCode())

    val q = Person("sally", 2)
    println(q)

    val person: Person = q.appendToName(" Smith")
    println(person)

  }

}
