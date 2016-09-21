package net.kwas.impatient.ch5

import org.scalatest._

class NamedPersonSpec extends FlatSpec with Matchers {

  behavior of "A NamedPerson"

  val person = new NamedPerson("Bob Bobbinson")

  it should "parse the first name correctly" in {
    person.firstName should be ("Bob")
  }

  it should "parse the last name correctly" in {
    person.lastName should be ("Bobbinson")
  }
}
