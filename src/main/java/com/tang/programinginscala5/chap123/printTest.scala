package com.tang.programinginscala5.chap123

/**
 * @Classname printTest
 * @Description TODO
 * @Date 2022/7/24 00:09
 * @Author by tangyao
 */

def function1 =
  val a = 1
  println(a * 100)
  val b = "*"
  println(b * 100)

@main def main(args: String*) =
  1 to 10 foreach (_ -> function1)
