//package com.tang.fast.chap6

/**
 * @Classname Hello
 * @Description
 * @Date 2022/12/29 09:18
 * @Author by tangyao
 */

object Hello extends App :
  if args.length > 0 then
    println(s"Hello,${args(0)}")
  else
    println("Hello,World!")
