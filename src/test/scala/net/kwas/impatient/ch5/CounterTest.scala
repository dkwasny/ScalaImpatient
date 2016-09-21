package net.kwas.impatient.ch5

import org.scalatest._

class CounterTest extends FlatSpec with Matchers {
  "A Counter" should "be cool" in {
    val counter = new Counter
    counter.current() should be (0)
  }
}
