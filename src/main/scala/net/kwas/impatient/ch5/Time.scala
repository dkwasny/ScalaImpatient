package net.kwas.impatient.ch5

class Time {
  private var hours_ = 0
  private var minutes_ = 0

  def hours = hours_
  def minutes = minutes_

  def before(other: Time): Boolean = {
    (hours < other.hours) || (hours == other.hours && minutes < other.minutes)
  }
}
