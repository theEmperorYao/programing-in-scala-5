package com.tang.fast.chap6

import com.tang.fast.chap6.Account.newUniqueNumber

/**
 * @Classname Accounts
 * @Description
 * @Date 2022/12/28 23:46
 * @Author by tangyao
 */
object Account:
  private var lastNumber = 0

  def newUniqueNumber() =
    lastNumber += 1
    lastNumber

  def apply(initialBalance: Double) =
    new Account(newUniqueNumber(), initialBalance)


class Account private(val id: Int, initialBalance: Double):

  private var balance = initialBalance

  def deposit(amount: Double) =
    balance += amount


abstract class UndoableAction(val description: String):
  def undo(): Unit

  def redo(): Unit

object DoNothingAction extends UndoableAction("Do nothing") :
  override def undo(): Unit = ???

  override def redo(): Unit = ???


@main def main =
  Map("open" -> DoNothingAction, "save" -> DoNothingAction)

  Array("Mary", "had", "a", "little", "lamb")

  val array = Array(Array(1, 7), Array(3))
  println(array)

  val account: Account = Account(10)
  println(account)
