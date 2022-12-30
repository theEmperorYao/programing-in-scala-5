package com.tang.test

class Test09 {

}

class Person {
  private var idCard: String = "34141"
  protected var name: String = "Alice"
  var sex: String = "male"
  private[test] var age: Int = 19

  def info() = println(s"${idCard} ${name} ${sex} ${age}")
}



