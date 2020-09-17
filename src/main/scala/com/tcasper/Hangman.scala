package com.tcasper

import scala.io.Source

object Hangman extends App {

  val filename = "/Users/tcasper/dev/hangman/src/main/resources/words.txt"
  val words = for (word <- Source.fromFile(filename).getLines()) yield word
  val wordsList = words.toList

  val currentWord = wordsList.head
  val currentWordSize = currentWord.length

  println(s"current word = $currentWord")

  Man.showInitial
  for (i <- 0 until currentWordSize) {
    print("__ ")
  }

  println()
  print("Enter a letter: ")
  val letterGuess = scala.io.StdIn.readLine()

  def insertLatestGuess(guess: Char): Int = {
    0
  }

  def initializeGame() = {

  }

}
