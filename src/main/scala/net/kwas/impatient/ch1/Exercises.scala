package net.kwas.impatient.ch1
object Exercises extends App {
  import math.sqrt
  import math.pow
  import math.BigInt
  import math.BigInt.probablePrime
  import util.Random

  val notReallyThree = pow(sqrt(3),2)
  println(s"Not Quite Three: ${notReallyThree}")

  println("crazy" * 3)

  val normalExponent = pow(2, 1024)
  println(s"Normal Exponent: ${normalExponent}")

  val bigExponent = BigInt(2) pow 1024
  println(s"Big Exponent: ${bigExponent}")

  val myPrime = probablePrime(100, Random)
  println(s"My Prime: ${myPrime}")

  val randomString = BigInt(50, Random) toString 36
  println(s"Random String: ${randomString}")
  
  val myString = "gahnachies"
  val firstChar = myString(0)
  val otherFirstChar = myString take 1
  val lastChar = myString(myString.length - 1)
  val otherLastChar = myString takeRight 1
  println(s"My String: ${myString}")
  println(s"First Char: ${firstChar} and ${otherFirstChar}")
  println(s"Last Char: ${lastChar} and ${otherLastChar}")
}
