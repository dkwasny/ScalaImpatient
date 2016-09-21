package net.kwas.impatient.ch3

import org.scalatest._

class ExercisesSpec extends FlatSpec with Matchers {
  "Chapter 3 exercises" should "not explode" in {
    Exercises.main(Array.empty)
  }
}
