package com.tang.fast.chap8

class Item(val description: String, val price: Double):

  //  final override def equals(other: Any): Boolean =
  //    other.isInstanceOf[Item] && {
  //      val that = other.asInstanceOf[Item]
  //      description == that.description && price == that.price
  //    }

  final override def equals(other: Any): Boolean =
    other match
      case that: Item => description == that.description && price == that.price
      case _ => false

  // 对于null值，交出0而不是抛出异常
  final override def hashCode(): Int = (description, price).##
      

