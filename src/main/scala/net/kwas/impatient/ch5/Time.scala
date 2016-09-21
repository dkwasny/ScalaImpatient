package net.kwas.impatient.ch5

class Time(val hours: Int, val minutes: Int) {
  def before(other: Time): Boolean = {
    (hours < other.hours) || (hours == other.hours && minutes < other.minutes)
  }
}
