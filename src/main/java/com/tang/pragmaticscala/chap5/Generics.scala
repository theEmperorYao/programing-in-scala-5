package com.tang.pragmaticscala.chap5

import java.util


object Generics {

  def main(args: Array[String]): Unit = {


    val list1 = new util.ArrayList[Int]
    // java.util.ArrayList[Nothing] Nothing 类型处于最底层的位置。
    //    var list2 = new util.ArrayList
    //    list2 = list1
    var list2 = new util.ArrayList[Any]

    var ref1: Int = 1

//    var ref2: Any = _;
//
//    ref2 = ref1
    //    list2 = list1

    def madMethod() = throw new IllegalArgumentException()

    madMethod()
    


  }

}
