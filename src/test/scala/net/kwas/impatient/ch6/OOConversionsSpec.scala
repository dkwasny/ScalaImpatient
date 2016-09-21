package net.kwas.impatient.ch6

import org.scalatest._

class OOConversionsSpec extends FlatSpec with Matchers {

  "InchesToCentimeters" should "convert inches to centimeters" in {
    InchesToCentimeters.convert(10) should be (25.4)
  }

  "GallonsToLiters" should "convert gallons to liters" in {
    GallonsToLiters.convert(10) should be (37.85411784)
  }

  "MilesToKilometers" should "convert miles to kilometers" in {
    MilesToKilometers.convert(10) should be (16)
  }

}
