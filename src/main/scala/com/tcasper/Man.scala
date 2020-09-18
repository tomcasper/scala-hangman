package com.tcasper

object Man {

  def showZeroOuts(currentWord: String, currentOuts: Int, guesses: List[Char]): Unit = {
    println("""    ----------""")
    println("""    |        |""")
    println("""    |        |""")
    println("""    |         """)
    println("""    |         """)
    println("""    |         """)
    println("""    |         """)
    println("""    |         """)
    println("""    |         """)
    println("""    |         """)
    println("""---------""")
    displayCurrentState(currentWord)
    println()
  }

  def displayCurrentState(word: String): Unit = {
    for (i <- 0 until word.length) {
      print("__ ")
    }
    /*
      1. try using the letters guessed by the player in a Set, and somehow take the disjoint union of that Set with
         the word in "__ __ __ ... __ __" form
     */
  }

  def showFirstOut(): Unit = {
    println("""    ----------""")
    println("""    |        |""")
    println("""    |        |""")
    println("""    |        ___""")
    println("""    |       |___|""")
    println("""    |         """)
    println("""    |         """)
    println("""    |         """)
    println("""    |         """)
    println("""    |         """)
    println("""---------""")
  }

  def showSecondOut(): Unit = {
    println("""    ----------""")
    println("""    |        |""")
    println("""    |        |""")
    println("""    |        ___""")
    println("""    |       |___|""")
    println("""    |         |""")
    println("""    |         """)
    println("""    |         """)
    println("""    |         """)
    println("""    |         """)
    println("""---------""")
  }

  def showThirdOut(): Unit = {
    println("""    ----------""")
    println("""    |        |""")
    println("""    |        |""")
    println("""    |        ___""")
    println("""    |       |___|""")
    println("""    |         | /""")
    println("""    |          """)
    println("""    |         """)
    println("""    |         """)
    println("""    |         """)
    println("""---------""")
  }

  def showFourthOut(): Unit = {
    println("""    ----------""")
    println("""    |        |""")
    println("""    |        |""")
    println("""    |        ___""")
    println("""    |       |___|""")
    println("""    |       \ | /""")
    println("""    |          """)
    println("""    |         """)
    println("""    |         """)
    println("""    |         """)
    println("""---------""")
  }

  def showFifthOut(): Unit = {
    println("""    ----------""")
    println("""    |        |""")
    println("""    |        |""")
    println("""    |        ___""")
    println("""    |       |___|""")
    println("""    |       \ | /""")
    println("""    |         |""")
    println("""    |         """)
    println("""    |         """)
    println("""    |         """)
    println("""---------""")
  }

  def showSixthOut(): Unit = {
    println("""    ----------""")
    println("""    |        |""")
    println("""    |        |""")
    println("""    |        ___""")
    println("""    |       |___|""")
    println("""    |       \ | /""")
    println("""    |         |""")
    println("""    |          \""")
    println("""    |         """)
    println("""    |         """)
    println("""---------""")
  }

  def showSeventhOut(): Unit = {
    println("""    ----------""")
    println("""    |        |""")
    println("""    |        |""")
    println("""    |        ___""")
    println("""    |       |___|""")
    println("""    |       \ | /""")
    println("""    |         |""")
    println("""    |        / \""")
    println("""    |         """)
    println("""    |         """)
    println("""---------""")
  }
}
