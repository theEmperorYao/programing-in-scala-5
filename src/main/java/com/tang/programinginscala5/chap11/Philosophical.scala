package com.tang.programinginscala5.chap11

import org.springframework.stereotype.Component

/**
 * @Classname Philosophical
 * @Description
 * @Date 2022/12/20 22:59
 * @Author by tangyao
 */
trait Philosophical:
  def philosophize = "I consume memory,therefore I am!"

class Frog extends Animal, Philosophical, HasLegs :
  override def toString: String = "green"

  override def philosophize: String = s"It ain't easy being $this!"



class Animal

trait HasLegs


@main def a() =
  val frog = new Frog
  frog.philosophize
  val phil: Philosophical = frog

  println(phil.philosophize)





