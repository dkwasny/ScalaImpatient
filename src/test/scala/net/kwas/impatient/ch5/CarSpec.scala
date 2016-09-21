package net.kwas.impatient.ch5

import org.scalatest._

class CarSpec extends FlatSpec with Matchers {

  behavior of "A Car"

  it should "default model year to -1" in {
    val car = new Car("make", "model")
    car.modelYear should be (-1)
  }
  
  it should "default license plate to the empty string" in {
    val car = new Car("make", "model")
    car.licensePlate should be ("")
  }
}

