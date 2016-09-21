package net.kwas.impatient.ch6

import org.scalatest._

class ColorSpec extends FlatSpec with Matchers {

  "Color" should "have interesting hex-based ids" in {
    println(
      for (x <- Color.values) yield (x, x.id.toHexString)
    )
  }
}
