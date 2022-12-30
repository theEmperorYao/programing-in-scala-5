package com.tang.test

object Test06 {

  def main(args: Array[String]): Unit = {

    def f(a: Int) = {
      println(s"入参为：${a}")
      a + 1
    }

    def fun() = {
      println("aaa")
    }

    val f1 = f _
    val f2: Int => Int = f

    println(f1)
    println(f1(10))
    println(f2)
    println(f2(10))

    println("=================")
    val f3 = f _
    println(f3)
    val f4 = f(34)
    println(f4)
    val f5 = f
    println(f5)
    println(f3(10))
    println(f5(10))

    println("===============")
    println(f3)
    println(f5)

    val a = println _
    val b = println
    println(a)
    println(b)

    val c = fun _
    println(c)
    val d = fun _
    println(d)

    val e = f
    val e2 = f _

    println(e)
    println(e2)


    def dual(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    println(dual(_ + _, 1, 43))
    println(dual(_ - _, 1, 43))
    println(dual(_ * _, 1, 43))
    println(dual(_ / _, 1, 43))


    def fun1() = {
      def fun2(a: Int) = {
        println(s"f6 入参为：${a}")
      }

      fun2
    }

    fun1()(10)


    def fun3() = {
      def fun2() = {
        println(s"fun2")
      }

      fun2 _
    }
    fun3()()


  }

}
