package com.tang.leetcode

object Code_02_LongestValidParentheses {

  def longestValidParentheses(s: String) = {

    if s == null || s == "" then 0
    val array = s.toCharArray
    val dp = new Array[Int](s.length)
    (1 to s.length - 1).map(i => {
      val pre = i - dp(i - 1) - 1
      if array(i) == ')' then
        if pre >= 0 && array(pre) == '(' then
          dp(i) = 2 + dp(i - 1) + (if pre > 0 then dp(pre - 1) else 0)
      dp(i)
    }).max

  }

  def main(args: Array[String]): Unit = {
    val i = longestValidParentheses("()()()))((()))()()")
    println("i = " + i)
  }

}
