package net.kwas.impatient.ch4

import org.scalatest._

class ExercisesTest extends FlatSpec with Matchers {
  "Chapter 4 exercises" should "not explode" in {
    Exercises.main(Array.empty)
  }
}
