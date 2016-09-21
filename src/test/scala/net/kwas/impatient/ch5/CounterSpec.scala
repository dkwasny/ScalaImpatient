package net.kwas.impatient.ch5

import org.scalatest._

class CounterSpec extends FlatSpec with Matchers {
  behavior of "A Counter"
  
  it should "should initalize to zero" in {
    val counter = new Counter
    counter.current() should be (0)
  }

  it should "be one after increment" in {
    val counter = new Counter
    counter.increment()
    counter.current() should be (1)
  }

  it should "not overflow when greater than Int.MaxValue" in {
    val counter = new Counter
    counter.increment(Int.MaxValue)
    counter.increment()
    counter.current() should be (1L + Int.MaxValue)
  }
}
