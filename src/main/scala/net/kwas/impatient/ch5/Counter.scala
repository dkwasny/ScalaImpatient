package net.kwas.impatient.ch5

class Counter {
  // Changing the inital value to a long allows us to blow past Int.MaxValue...
  private var value = 0L
  def increment() { increment(1) }
  def increment(num: Long) { value += num }
  def current() = value
}
