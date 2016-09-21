package net.kwas.impatient.ch5

class AgedPerson(var age: Int) {
  age = if (age < 0) 0 else age
}
