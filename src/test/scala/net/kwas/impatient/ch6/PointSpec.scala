package net.kwas.impatient.ch6

import org.scalatest._

class PointSpec extends FlatSpec with Matchers {
  
  "A Point" should "be constructable from the companion object" in {
    val point = Point(1, 2)
    point.x should be (1)
    point.y should be (2)
  }

}
