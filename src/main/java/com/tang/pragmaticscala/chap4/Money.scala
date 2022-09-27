package com.tang.pragmaticscala.chap4

import Currency._

class Money(val amount: Int, val currency: Currency) {
  override def toString: String = s"$amount $currency"
}
