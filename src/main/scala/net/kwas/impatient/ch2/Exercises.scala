package net.kwas.impatient.ch2
object Exercises extends App {
  import math.pow

  def signum(x: Int) = { if (x > 0) 1 else if (x < 0) -1 else 0 }
  val sigs = for (i <- -3 to 3) yield signum(i)
  println(s"Sigs: ${sigs}")

  var y = -1
  val x = y = 1
  println(s"Unit: ${x}")

  println("For Loop:")
  for (i <- 10 to 0 by -1) {
    print(i)
  }
  println

  println("Foreach call:")
  (10 to 0 by -1).foreach(print)
  println

  def countdown(x: Int) {
    for (i <- x to 0 by -1) {
      print(i + " ")
    }
    println
  }
  print("Countdown: ")
  val unit = countdown(10)
  println(s"Return Type of Countdown: ${unit}")

  def product(input: String) = {
    var retVal = 1
    for (x <- input) {
      // x is a Char, but is implicitly converted to Int
      retVal *= x
    }
    retVal
  }
  val helloProduct = product("Hello")
  println(s"Hello Product: ${helloProduct}")

  // Without mapping to Ints the multiplication happens as chars, which overflows
  val easyProduct = "Hello".map(Char.char2int).product
  println(s"Easy Product: ${easyProduct}")

  def recursiveProduct(input: String): Int = {
    if (input.isEmpty) {
      1
    }
    else {
      input.head * recursiveProduct(input.tail)
    }
  }
  val helloRecursiveProduct = recursiveProduct("Hello")
  println(s"Recursive Product: ${helloRecursiveProduct}")

  def exponent(x: Int, n: Int): Double = {
    if (n == 0) {
      1
    }
    else if (n < 0) {
      1 / exponent(x, -n)
    }
    else if (n % 2 == 0) {
      pow(exponent(x, n/2), 2)
    }
    else {
      x * exponent(x, n - 1)
    }
  }
  val twoExponentFour = exponent(2, 4)
  println(s"Two Exponent Four: ${twoExponentFour}")
  val hugeExponent = exponent(28, 51)
  println(s"Huge Exponent: ${hugeExponent}")
  val twoExponentNegativeFour = exponent(2, -4)
  println(s"Two Exponent Negative Four: ${twoExponentNegativeFour}")
}
