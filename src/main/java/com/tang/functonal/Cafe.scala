package com.tang.functonal

import com.tang.pragmaticscala.chap4.Charge


class CreditCard:
  def charge(d: Double) = 0.0


class Coffee:
  var price: Double = _

case class Charge(cc: CreditCard, amount: Double):
  def combine(other: Charge) =
    if cc == other.cc then
      Charge(cc, amount + other.amount)
    else
      throw new Exception("Can't combine charges to different cards")

class Cafe:
  //  def buyCoffee(cc: CreditCard) =
  //    val cup = new Coffee()
  //    // 副作用，信用卡计费 应该只返回咖啡
  //    cc.charge(cup.price)
  //    cup
  def bugCoffee(cc: CreditCard) =
    val cup = new Coffee()
    (cup, Charge(cc, cup.price))
    
    

    
