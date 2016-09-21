package net.kwas.impatient.ch5

import org.scalatest._

class MinuteTimeSpec extends FlatSpec with Matchers {
  
  "A MinuteTime" should "convert hours correctly" in {
    val time = new MinuteTime(2, 10)
    time.minutes should be (130)
  }

  behavior of "A MinuteTime with 100 minutes"
  val base = new MinuteTime(100)

  it should "be before a MinuteTime with 120 minutes" in {
    val greater = new MinuteTime(120)
    base.before(greater) should be (true)
  }

  it should "not be bore a MinuteTime with 90 minutes" in {
    val lesser = new MinuteTime(90)
    base.before(lesser) should be (false)
  }
}
