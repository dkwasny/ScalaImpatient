package net.kwas.impatient.ch1
object Exercises extends App {
  import math.sqrt
  import math.pow
  import math.BigInt

  // --- Exercise 1
  // Lots of stuff.
  // See the Int Scaladoc.
  
  // --- Exercise 2
  // Rounding error
  
  val notReallyThree = pow(sqrt(3),2)
  println(s"Not Quite Three: ${notReallyThree}")
  
  // --- Exercise 3
  // val

  // --- Exercise 4
  // It repeats the string 4 times.
  // See the StringOpts Scaladoc.
  
  println("crazy" * 3)

  // --- Exercise 5
  // It checks if 10 is greater than 2.
  // Check the Int Scaladoc.
  
  // --- Exercise 6
  
  val normalExponent = pow(2, 1024)
  println(s"Normal Exponent: ${normalExponent}")

  val bigExponent = BigInt(2) pow 1024
  println(s"Big Exponent: ${bigExponent}")
  
  // --- Exercise 7

  import math.BigInt.probablePrime
  import util.Random
  val myPrime = probablePrime(100, Random)
  println(s"My Prime: ${myPrime}")

  // --- Exercise 8

  val randomString = BigInt(50, Random) toString 36
  println(s"Random String: ${randomString}")
  
  // --- Exercise 9 & 10
  // The functions are fun wrappers that emulate various usecases for
  // the substring method.
  // You don't have to worry about indicies like you do with substring.
  // You can just say "gimme the last/first x chars" and go.

  val myString = "gahnachies"
  val firstChar = myString(0)
  val otherFirstChar = myString take 1
  val lastChar = myString(myString.length - 1)
  val otherLastChar = myString takeRight 1
  println(s"My String: ${myString}")
  println(s"First Char: ${firstChar} and ${otherFirstChar}")
  println(s"Last Char: ${lastChar} and ${otherLastChar}")
}
