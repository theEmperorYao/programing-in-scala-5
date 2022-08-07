package com.tang.programinginscala5.controller

import com.tang.programinginscala5.chap6.Rational
import com.tang.programinginscala5.testjava.Test1
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}


/**
 * @Classname ScalaController
 * @Description TODO
 * @Date 2022/8/6 15:06
 * @Author by tangyao
 */

@RestController
@GetMapping(value = Array("bb"))
class ScalaController @Autowired()(var rational: Rational) {


  @GetMapping(value = Array("helloworld"))
  def getString: String = {
    val test = new Test1()
    rational.toString

  }


}
