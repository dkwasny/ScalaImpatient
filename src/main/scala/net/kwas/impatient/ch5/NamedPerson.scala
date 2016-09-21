package net.kwas.impatient.ch5

// Everything can be val since we are not mutating anything
class NamedPerson(val fullName: String) {
  val firstName = fullName.split(' ')(0)
  val lastName = fullName.split(' ')(1)
}
