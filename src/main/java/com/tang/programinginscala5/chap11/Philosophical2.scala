package com.tang.programinginscala5.chap11

trait Philosophical2(message: String):
  def philosophize = message

class Frog2 extends Animal, Philosophical2("I croak , therefore I am !")


class Duck extends Animal, Philosophical2("I quack , therefore I am !")

class ProfoundAnimal extends Animal,Philosophical2("In the beginning was the deed.")

class Frog3 extends ProfoundAnimal,Philosophical2

trait PhilosophicalAnimal extends Animal with Philosophical2

class Frog4 extends PhilosophicalAnimal,Philosophical2("aaa")

@main def chap11() = {
  val frog = new Frog2
  println(frog.philosophize)
  val duck = new Duck
  println(duck.philosophize)

  val frog1 = new Frog3
  println(frog1.philosophize)
}