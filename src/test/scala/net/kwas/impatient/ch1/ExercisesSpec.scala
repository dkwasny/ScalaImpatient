package net.kwas.impatient.ch1

import org.scalatest._

class ExercisesSpec extends FlatSpec with Matchers {
  "Chapter 1 exercises" should "not explode" in {
    Exercises.main(Array.empty)
  }
}
