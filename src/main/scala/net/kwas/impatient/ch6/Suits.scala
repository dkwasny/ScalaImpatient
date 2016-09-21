package net.kwas.impatient.ch6

object Suits extends Enumeration {
  val Club = Value("\u2663")
  val Diamond = Value("\u2666")
  val Heart = Value("\u2665")
  val Spade = Value("\u2660")

  def isRed(suit: Value): Boolean = {
    suit == Heart || suit == Diamond
  }
}
