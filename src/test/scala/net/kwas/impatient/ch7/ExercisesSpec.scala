package net.kwas.impatient.ch7

import org.scalatest._

class ExercisesSpec extends FlatSpec with Matchers {
  "Chapter 7 exercises" should "not explode" in {
    Exercises.main(Array.empty)
  }
}
