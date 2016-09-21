package net.kwas.impatient.ch6

import org.scalatest._

class SuitsSpec extends FlatSpec with Matchers {

  "Suits" should "print funky unicode characters" in {
    println(Suits.values.mkString(" "))
  }

  "The Heart Suit" should "be red" in {
    Suits.isRed(Suits.Heart) should be (true)
  }

  "The Diamond Suit" should "be red" in {
    Suits.isRed(Suits.Diamond) should be (true)
  }

  "The Club Suit" should "not be red" in {
    Suits.isRed(Suits.Club) should be (false)
  }

  "The Spade Suit" should "not be red" in {
    Suits.isRed(Suits.Spade) should be (false)
  }

}
