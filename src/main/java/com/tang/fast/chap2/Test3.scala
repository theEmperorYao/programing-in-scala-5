package com.tang.fast.chap2

/**
 * @Classname Test3
 * @Description
 * @Date 2022/12/18 17:18
 * @Author by tangyao
 */
object Test3 {

  def main(args: Array[String]): Unit = {

    def a: Int => Int => Int = x => y => x + y

    val i: Int = a(3)(4)

    println(i)


    def f: (Int => Int) => ((Int => Int) => (Int => Int)) = x => y => z => x.apply(y.apply(z))

    def f1: Int => Int = x => x * 2

    def f2: Int => Int = x => x * x

    val f3: Int => Int = f(f1)(f2)

    val i1: Int = f3(10)

    println(i1)



  }

}
