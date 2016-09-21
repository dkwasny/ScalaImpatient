package net.kwas.impatient.ch6

import org.scalatest._

class OrginSpec extends FlatSpec with Matchers {
  
  "Origin" should "act like java.awt.point" in {
    Origin.getX() should be (0)
    Origin.getY() should be (0)

    Origin.move(1, 2)
    Origin.getX() should be (1)
    Origin.getY() should be (2)

    Origin.x should be (1)
    Origin.y should be (2)
  }

}
