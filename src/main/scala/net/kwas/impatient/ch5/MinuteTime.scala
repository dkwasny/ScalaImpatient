package net.kwas.impatient.ch5

class MinuteTime(val minutes: Int) {
  def this(hours: Int, minutes: Int) {
    this(hours * 60 + minutes)
  }

  def before(other: MinuteTime): Boolean = {
    minutes < other.minutes
  }
}
