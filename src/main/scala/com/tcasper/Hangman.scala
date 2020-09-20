package com.tcasper

import scala.io.Source

object Hangman extends App {

  val filename = "/Users/tcasper/dev/hangman/src/main/resources/words.txt"
  val words = for (word <- Source.fromFile(filename).getLines()) yield word
  val wordsList = words.toList
  val gameNotOver: Boolean = true
  val currentWord = wordsList.head
  println(s"current word = $currentWord") // TODO remove this

  while (true) {
    val guess = scala.io.StdIn.readChar()
    val updatedWord = currentWord.map(c => compareChars(guess, c))
    println(updatedWord)
    Man.showZeroOuts(currentWord, 0, List.empty)


  }


  def compareChars(c1: Char, c2: Char): String = if (c1 == c2) c1.toString else "__ "

  //  print("Enter a letter: ")
//  val letterGuess = {
//    while (gameNotOver) {
//      scala.io.StdIn.readLine()
//    }
//  }
}
