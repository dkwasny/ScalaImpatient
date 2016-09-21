package net.kwas.impatient.ch5

/* I get it...scala has kickass syntatic sugar over
 * other languages.  I'm not going to implement this
 * in another language.
 */
class Car(
  val manufacturer: String,
  val modelName: String,
  val modelYear: Int = -1,
  var licensePlate: String = ""
) {
}
