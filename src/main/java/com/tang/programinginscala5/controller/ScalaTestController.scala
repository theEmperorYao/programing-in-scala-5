package com.tang.programinginscala5.controller

import com.tang.programinginscala5.chap11.Philosophical
import com.tang.programinginscala5.chap6.{Data1, Rational}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

import java.util
import scala.jdk.CollectionConverters.*


@RestController
class ScalaTestController(
                           var rational: Rational,
                           var p: Philosophical
                         ):
  @RequestMapping(value = Array("/task1"))
  def newTask() =
    val rational = new Rational
    val map = Map("a" -> rational.toString).asJava
    p.philosophize
    Seq(rational.toString).asJava
    val data = new Data1("a", 1, "c")
    val strings = Array(data, data).map(_.a)
    strings

@main def main = {
  val data = new Data1("a", 1, "c")
  val data2 = new Data1("a", 3, "c")
  val data3 = new Data1("a", 33, "c")
  val str = Array(data, data2, data3).map(_.b).foldLeft("")((a, b) => a * 3 + b)
  println(str.mkString(","))
  
}
    
    
    
    
    
    
    
    
  
  
  
