package net.kwas.impatient.ch5

import org.scalatest._

class TimeSpec extends FlatSpec with Matchers {

  behavior of "A Time with ten hours and 5 minutes"
  val base = new Time(10, 5)

  it should "be before a Time with eleven hours" in {
    val other = new Time(11, 0)
    base.before(other) should be (true)
  }
  
  it should "be before a Time with ten hours and ten minutes" in {
    val other = new Time(10, 10)
    base.before(other) should be (true)
  }

  it should "not be before a Time with nine hours" in {
    val other = new Time(9, 0)
    base.before(other) should be (false)
  }

  it should "not be before a Time with ten hours and one minute" in {
    val other = new Time(10, 1)
    base.before(other) should be (false)
  }

}
