package com.tang.pragmaticscala.chap4

class Construct(param: String) {
  println(s"Creating an instance of Construct with paramter $param")
}

@main def m =
  println("Let's create an instance")
  new Construct("sample")



