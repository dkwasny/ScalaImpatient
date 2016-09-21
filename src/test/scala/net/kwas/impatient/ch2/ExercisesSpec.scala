package net.kwas.impatient.ch2

import org.scalatest._

class ExercisesSpec extends FlatSpec with Matchers {
  "Chapter 2 exercises" should "not explode" in {
    Exercises.main(Array.empty)
  }
}
