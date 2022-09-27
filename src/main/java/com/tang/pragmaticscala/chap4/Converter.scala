package com.tang.pragmaticscala.chap4

import Currency._

object Converter {
  def convert(money: Money, to: Currency): Money =
    val conversionRate = 2
    new Money(money.amount * conversionRate, to)
}

object Charge:
  def chargeInUSD(money: Money): String =
    def moneyInUSD = Converter.convert(money, Currency.USD)

    s"charged $$${moneyInUSD.amount}"

object CurrencyApp extends App :
  var moneyInGBP = new Money(10, Currency.GBP)
  println(Charge.chargeInUSD(moneyInGBP))
  println(Converter.convert(moneyInGBP, Currency.USD))