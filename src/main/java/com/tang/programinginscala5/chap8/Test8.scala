package com.tang.programinginscala5.chap8

import com.tang.programinginscala5.chap6.Rational

/**
 * @Classname Test88
 * @Description
 * @Date 2022/8/22 21:07
 * @Author by tangyao
 */
object Test8 {

  // String* 其实是 Seq[String]
  def echo(args: String*) = for arg <- args do println(arg)

  def speed(distance: Float, time: Float) = distance / time

  def point(x: Int = 0, y: Int = 0) = (x, y)

  trait Increaser:
    def increase(i: Int): Int

  def increaseOne(increaser: Increaser): Int = increaser.increase(1)

  //  def approximate(guess: Double): Double =
  //    if isGoodEnough(guess) then guess
  //    else approximate(impove(guess))

  def boom(x: Int): Int =
    if x == 0 then throw new Exception("boom!")
    else boom(x - 1) + 1

  def bang(x: Int): Int =
    if x == 0 then throw new Exception("bang!")
    else bang(x - 1)

  def isEven(x: Int): Boolean =
    if x == 0 then true else isOdd(x - 1)

  def isOdd(x: Int): Boolean =
    if x == 0 then false else isEven(x - 1)

  val funValue = nestedFun

  def nestedFun(x: Int): Unit =
    if x != 0 then
      println(x)
      funValue(x - 1)//不会尾递归，funcvalue 变量指向一个本质上只是打包了对nestedFun调用的函数值

  def main(args: Array[String]): Unit = {
    echo("a", "c")
    echo("b")
    echo()

    val seq = Seq("What's", "up", "doc")
    // 告诉编辑器，将seq的每个元素作为参数传递给echo，而不是将所有的元素都放在一起作为单个实参传入
    echo(seq *)

    println(speed(time = 10, distance = 100))

    println(Rational(42))

    println(point(x = 1))

    increaseOne(new Increaser {
      override def increase(i: Int): Int = i + 7
    })

    increaseOne(x => x + 7)

    //    boom(10)
    //    bang(10)


  }

}
