package com.tang.programinginscala5

import java.util.{Comparator, PriorityQueue}
import scala.jdk.javaapi.CollectionConverters
import scala.jdk.javaapi.CollectionConverters.*


/**
 * @Classname Coffee
 * @Description
 * @Date 2022/11/28 10:26
 * @Author by tangyao
 */
class Node(var timePoint: Int, var workTime: Int)

object Coffee {

  def coffee(array: Array[Int], n: Int, wash: Int, air: Int): Int =
    if array == null || array.isEmpty then return 0

    def diff(t2: (Node, Node)): Int = t2._1.workTime + t2._1.timePoint - t2._2.timePoint - t2._2.workTime

    val value: Comparator[Node] = Comparator.comparingInt((o: Node) => (o.timePoint + o.workTime))

    val nodes: PriorityQueue[Node] = new PriorityQueue[Node](Comparator.comparingInt((o: Node) => (o.timePoint + o.workTime)))

    array.foreach(item => nodes.add(new Node(0, item)))

    val drinks: Array[Int] =
      (0 to n - 1).map(i => {
        val node: Node = nodes.poll()
        node.timePoint += node.workTime
        nodes.add(node)
        node.timePoint
      }).toArray

    def bestTime(drinks: Array[Int], wash: Int, air: Int, index: Int, washLine: Int): Int =
      if index == drinks.length then return 0

      // 用机器洗当前这个咖啡杯需要花费的时间
      val t1: Int = math.max(drinks(index), washLine) + wash
      // 洗剩下的咖啡杯花费的时间
      val t2: Int = bestTime(drinks, wash, air, index + 1, t1)
      val t3: Int = math.max(t1, t2)

      // 不用机器洗当前这个咖啡杯，自然风干需要花费的时间
      val t4: Int = drinks(index) + air
      // 不用机器洗后面需要的时间
      val t5: Int = bestTime(drinks, wash, air, index + 1, washLine)
      val t6: Int = math.max(t4, t5)

      math.min(t3, t6)


    bestTime(drinks, wash, air, 0, 0)


  def main(args: Array[String]): Unit = {
    val ints: Array[Int] = Array(3, 4, 1, 2, 7)
    val i: Int = coffee(ints, 20, 2, 3)
    println(s"最短花费时间 $i")

  }


}


