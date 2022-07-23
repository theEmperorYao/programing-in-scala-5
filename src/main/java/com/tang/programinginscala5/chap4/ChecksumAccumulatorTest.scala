package com.tang.programinginscala5.chap4

/**
 * @Classname ChecksumAccumulatorTest
 * @Description TODO
 * @Date 2022/7/23 17:09
 * @Author by tangyao
 */
object ChecksumAccumulatorTest {

  def main(args: Array[String]): Unit = {
    val acc = new ChecksumAccumulator
    val csa = new ChecksumAccumulator
    acc.add(1)
    println(acc.checksum())

  }


}
