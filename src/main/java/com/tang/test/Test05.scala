package com.tang.test

object Test05 {

  def main(args: Array[String]): Unit = {


    def f(func: String => Unit): Unit = {
      func("tangyao")
    }

    f(name => println(name))

    f((name: String) => println(name))

    f(println(_))


    def dualFunctionOneAndTwo(fun: (Int, Int) => Int): Int = {
      val i = fun(1, 2)
      println(s"计算结果为：${i}")
      i
    }

    dualFunctionOneAndTwo((a, b) => a + b)
    dualFunctionOneAndTwo((a, b) => a - b)
    dualFunctionOneAndTwo((a, b) => a * b)
    dualFunctionOneAndTwo((a, b) => a / b)
    dualFunctionOneAndTwo(Math.max)
    dualFunctionOneAndTwo(_ + _)
    dualFunctionOneAndTwo(-_ + _)
    


  }


}
