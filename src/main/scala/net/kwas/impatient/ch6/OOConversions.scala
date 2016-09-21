package net.kwas.impatient.ch6

class UnitConversion(val multiplier: Double) {
  def convert(value: Double): Double = {
    value * multiplier
  }
}

object InchesToCentimeters extends UnitConversion(2.54)
object GallonsToLiters extends UnitConversion(3.785411784)
object MilesToKilometers extends UnitConversion(1.6)
