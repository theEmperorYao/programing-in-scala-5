package com.tang.programinginscala5.chap4

import ChecksumAccumulator.calculate


/**
 * @Classname Summer
 * @Description TODO
 * @Date 2022/7/23 23:36
 * @Author by tangyao
 */
object Summer {

  def main(args: Array[String]): Unit =
    for arg <- args do
      println(arg + ": " + calculate(arg))

}
