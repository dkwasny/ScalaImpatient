package net.kwas.impatient.ch6

import org.scalatest._

class ArgumentReverserSpec extends FlatSpec with Matchers {

  "ArgumentReverser" should "print out reversed arguments" in {
    ArgumentReverser.main(Array("1", "2", "3"))
  }
}
