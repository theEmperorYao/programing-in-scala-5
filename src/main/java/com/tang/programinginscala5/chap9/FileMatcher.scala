package com.tang.programinginscala5.chap9

import java.io.File

/**
 * @Classname FileMatcher
 * @Description
 * @Date 2022/8/23 00:44
 * @Author by tangyao
 */
object FileMatcher {

  private def filesHere = (new File(".")).listFiles()

  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))

  def filesMatching(matcher: (String) => Boolean) =
    for file <- filesHere if matcher(file.getName) yield file


  def main(args: Array[String]): Unit = {

  }


}
