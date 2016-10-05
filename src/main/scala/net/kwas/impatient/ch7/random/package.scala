package net.kwas.impatient.ch7

package object random {
  var seed = 0;

  def nextInt(): Int = {
    seed = seed * 1664525 + 1013904223 % 2 * 32
    seed
  }

  def setSeed(newSeed: Int): Unit = {
    // Println to prove my RNG is being used
    println(s"Setting seed to ${newSeed}")
    seed = newSeed
  }
}
