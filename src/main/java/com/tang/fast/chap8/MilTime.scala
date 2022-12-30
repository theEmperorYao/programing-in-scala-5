package com.tang.fast.chap8

class MilTime(val time: Int) extends AnyVal :
  def minutes = time % 100

  def hours = time / 100

  override def toString: String = f"$time O4d"


object MilTime:

  def apply(t: Int): MilTime =
    if 0 <= t && t < 2400 && t % 100 < 60 then
      new MilTime(t)
    else
      throw new IllegalAccessException

  def main(args: Array[String]): Unit = {
    val time = new MilTime(1230)
    println(time)
    println(time.hours)
//    println(time * 2)
  }
