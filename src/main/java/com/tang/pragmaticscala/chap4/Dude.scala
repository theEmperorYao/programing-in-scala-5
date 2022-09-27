package com.tang.pragmaticscala.chap4

import scala.beans.BeanProperty


class Dude(@BeanProperty val firstName: String, val lastName: String) {
  @BeanProperty var position: String = _;
}

@main def m2 =
  val dude1 = new Dude("a", "b")
  val position = dude1.position
  println(position)


