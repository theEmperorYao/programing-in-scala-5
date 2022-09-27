package com.tang.pragmaticscala.chap5

class Pet(val name: String) {
  override def toString: String = name
}

class Dog(override val name: String) extends Pet(name)

def workWithPets(pets: Array[Pet]): Unit = {}

// 协变
def playWithPets[T <: Pet](pets: Array[T]): Unit =
  println("Playing with pets: " + pets.mkString(", "))

def copyPets[S, D >: S](fromPets: Array[S], toPets: Array[D]): Unit = {}

// +T 告诉 scala 允许协变
class MyList[+T]


@main def main =
  val dogs = Array(new Dog("Rover"), new Dog("Comet"))
  //  workWithPets(dogs)
  playWithPets(dogs)
  val pets = new Array[Pet](10)
  copyPets(dogs, pets)
  var list1 = new MyList[Int]
  var list2 = MyList[Any]
  list2 = list1

//import scala.language.implicitConversionsl

//implicit def convertInt2DateHelper(offset: Int): DateHelper = new DateHelper(offset)



