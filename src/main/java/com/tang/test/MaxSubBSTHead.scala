package com.tang.test

import java.util
import scala.collection.mutable.ArrayBuffer


object Code_03_MaxSubBSTHead2:
  class Node(v: Int):
    var value: Int = v
    var left: Node = _
    var right: Node = _

  /**
   *
   * @param maxSubBSTHead 最大的搜索二叉子树头结点
   * @param maxSubBSTSize 最大的搜索二叉子树结点个数
   * @param min           结点最大值
   * @param max           结点最小值
   */
  class Info(val maxSubBSTHead: Node, val maxSubBSTSize: Int, val min: Int, val max: Int)

  def maxSubBSTHead2(head: Node): Node =
    if head == null then null
    else process2(head).maxSubBSTHead

  def maxSubBSTHead(head: Node): Node =
    if head == null then null
    else process(head).maxSubBSTHead

  def process(x: Node): Info =
    if x == null then return null

    val leftInfo: Info = process(x.left)
    val rightInfo: Info = process(x.right)

    var maxSubBSTHead: Node = null
    var maxSubBSTSize = 0
    var min = x.value
    var max = x.value

    if leftInfo != null then
      min = math.min(min, leftInfo.min)
      max = math.max(max, leftInfo.max)
      maxSubBSTSize = leftInfo.maxSubBSTSize
      maxSubBSTHead = leftInfo.maxSubBSTHead

    if rightInfo != null then
      min = math.min(min, rightInfo.min)
      max = math.max(max, rightInfo.max)
      if rightInfo.maxSubBSTSize > maxSubBSTSize then
        maxSubBSTSize = rightInfo.maxSubBSTSize
        maxSubBSTHead = rightInfo.maxSubBSTHead

    if (leftInfo == null || (leftInfo.maxSubBSTHead == x.left && leftInfo.max < x.value))
      &&
      (rightInfo == null || (rightInfo.maxSubBSTHead == x.right && rightInfo.min > x.value)) then

      maxSubBSTHead = x
      maxSubBSTSize = (if leftInfo == null then 0 else leftInfo.maxSubBSTSize)
        + (if rightInfo == null then 0 else rightInfo.maxSubBSTSize)
        + 1

    new Info(maxSubBSTHead, maxSubBSTSize, min, max)


  def process2(x: Node): Info =
    if x == null then
      return new Info(null, 0, Int.MaxValue, Int.MinValue)

    val leftInfo: Info = process2(x.left)
    val rightInfo: Info = process2(x.right)

    var maxSubBSTHead: Node = null
    var maxSubBSTSize = 0
    val min = math.min(math.min(leftInfo.min, x.value), rightInfo.min)
    val max = math.max(math.max(leftInfo.max, x.value), rightInfo.max)

    // 包括X结点在内都是搜索二叉树
    val rightBSTSize: Int = rightInfo.maxSubBSTSize
    val leftBSTSize: Int = leftInfo.maxSubBSTSize
    val leftBSTHead: Node = leftInfo.maxSubBSTHead
    val rightMaxBSTHead: Node = rightInfo.maxSubBSTHead

    if (leftBSTHead == x.left && leftInfo.max < x.value)
      &&
      (rightMaxBSTHead == x.right && rightInfo.min > x.value) then
      maxSubBSTHead = x
      maxSubBSTSize = leftBSTSize + rightBSTSize + 1
    else {
      if rightBSTSize > leftBSTSize then
        maxSubBSTHead = rightMaxBSTHead
        maxSubBSTSize = rightBSTSize
      else
        maxSubBSTHead = leftBSTHead
        maxSubBSTSize = leftBSTSize
    }

    new Info(maxSubBSTHead, maxSubBSTSize, min, max)


  def generateRandomBST(maxLevel: Int, maxValue: Int): Node = generate(1, maxLevel, maxValue)

  def generate(level: Int, maxLevel: Int, maxValue: Int): Node =
    if level > maxLevel || math.random() < 0.5 then return null
    val head = new Node((math.random() * maxValue).toInt)
    head.left = generate(level + 1, maxLevel, maxValue)
    head.right = generate(level + 1, maxLevel, maxValue)
    head

  def maxSubBSTHead1(head: Node): Node =
    if head == null || getBSTSize(head) != 0 then return head
    val leftAns = maxSubBSTHead1(head.left)
    val rightAns = maxSubBSTHead1(head.right)

    if getBSTSize(leftAns) >= getBSTSize(rightAns) then leftAns
    else rightAns


  def getBSTSize(head: Node): Int =
    if head == null then return 0
    val arr = ArrayBuffer[Node]()
    in(head, arr)

    Range(1, arr.size).foreach(index =>
      if arr(index).value <= arr(index - 1).value then
        return 0

    )
    arr.size


  def in(head: Node, array: ArrayBuffer[Node]): Unit =
    if head == null then return;
    in(head.left, array)
    array += head
    in(head.right, array)

  def main(args: Array[String]): Unit = {
    val maxLevel = 4
    val maxValue = 100
    val testTimes = 100_0000
    1 to testTimes foreach (_ => {
      val head = generateRandomBST(maxLevel, maxValue)
      if maxSubBSTHead1(head) != maxSubBSTHead2(head) then
        println("Oops!")
    })
    println("finsh!")

  }









