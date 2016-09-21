package net.kwas.impatient.ch6

import org.scalatest._

class ConversionsSpec extends FlatSpec with Matchers {

  behavior of "Conversions"

  it should "convert inches to centimeters" in {
    Conversions.inchesToCentimeters(10) should be (25.4)
  }

  it should "convert gallons to liters" in {
    Conversions.gallonsToLiters(10) should be (37.85411784)
  }

  it should "convert miles to kilometers" in {
    Conversions.milesToKilometers(10) should be (16)
  }
}
