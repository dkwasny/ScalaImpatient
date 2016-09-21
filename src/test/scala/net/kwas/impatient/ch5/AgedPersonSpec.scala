package net.kwas.impatient.ch5

import org.scalatest._

class AgedPersonSpec extends FlatSpec with Matchers {
  
  behavior of "An AgedPerson"

  it should "allow positive ages" in {
    val person = new AgedPerson(12)
    person.age should be (12)
  }

  it should "allow the zero age" in {
    val person = new AgedPerson(0)
    person.age should be (0)
  }

  it should "normalize negative ages to zero" in {
    val person = new AgedPerson(-12)
    person.age should be (0)
  }
}
