package net.kwas.impatient.ch3
object Exercises extends App {
  import util.Random
  import reflect.ClassTag

  def arrayString[A](array: Array[A]): String = { array.mkString("[", ", ", "]") }

  // --- Exercise 1

  // You can omit the () or {} surrounding the random call.
  // Including both for demonstrative purposes.
  val randomIntArray = Array.fill(10)({ Random.nextInt(10) })
  println("Random Int Array: " + arrayString(randomIntArray))
  
  // --- Exercise 2

  val orderedArray = Array(1, 2, 3, 4, 5)

  // I have no idea what they expect for question 2,
  // so I made a chunky Java style loop.
  // They also imply you should do inline swapping on an Array,
  // which is not really possible (need ArrayBuffer).
  def swapAdjacentChunky[A:ClassTag](array: Array[A]): Array[A] = {
    var retVal = Array[A]()
    val grouped = array.grouped(2)
    for (x <- grouped) {
      val reversed = x.reverse
      retVal = retVal ++ reversed
    }
    retVal
  }
  println(
    "Adjacent Swapped Array (Chunky Function): "
    + arrayString(swapAdjacentChunky(orderedArray))
  )
 
  // --- Exercise 3

  // This cannot be what they're expecting...but I'm using for/yield!
  def swapAdjacentForYield[A:ClassTag](array: Array[A]): Array[A] = {
    (for (y <- (for (x <- array.grouped(2)) yield x.reverse); z <- y ) yield z).toArray
  }
  println(
    "Adjacent Swapped Array (For/Yield Function)"
    + arrayString(swapAdjacentForYield(orderedArray))
  )
  
  // --- My way to do exercise 2 & 3

  // This is more what I would expect from Scala,
  // but I don't think we're that far yet.
  def swapAdjacentOneLiner[A:ClassTag](array: Array[A]): Array[A] = {
    array.grouped(2).flatMap(_.reverse).toArray
  }
  println(
    "Adjacent Swapped Array (OneLiner Function): "
    + arrayString(swapAdjacentOneLiner(orderedArray))
  )

  // --- Exercise 4

  val arrayWithNegatives = Array(4, 1, -5, 2, -9, -3, 3)
  def pushNegativeToEnd(array: Array[Int]): Array[Int] = {
    val partitioned = array.partition(_ >= 0)
    Array.concat(partitioned._1, partitioned._2)
  }
  println(
    "Array w/ Negatives at End: "
    + arrayString(pushNegativeToEnd(arrayWithNegatives))
  )

  // --- Exercise 5

  val doubleArray = Array(1.0, 2.0, 3.0)
  val doubleArrayAverage = doubleArray.sum / doubleArray.size
  println("Double Array Avg: " + doubleArrayAverage)

  // --- Exercise 6

  val unsortedArray = Array(4, 9, 2, -1, 88, 1, 23, 9)
  val reverseSortedArray = unsortedArray.sorted.reverse
  println("Reverse Sorted Array: " + arrayString(reverseSortedArray))

  // Reverse sorting an ArrayBuffer is exactly the same as an Array

  // --- Exercise 7

  // This one feels too easy...turns out it was even easier than i thought (Array.disctinct)
  val arrayWithDupes = Array(1, 1, 3, 3, 3, 3, 4, 5, 5, 1, 3, 2)
  val dedupedArray = arrayWithDupes.toSet.toArray
  println("Deduped Array: " + arrayString(dedupedArray))

  // --- Exercise 8

  val negativeBuffer = collection.mutable.ArrayBuffer.concat(arrayWithNegatives)
  val negativeIndicies = for (i <- 0 until negativeBuffer.length if negativeBuffer(i) < 0) yield i
  for (i <- negativeIndicies.drop(1).reverse) {
    negativeBuffer.remove(i)
  }
  println("ArrayBuffer with a Single Negative: " + negativeBuffer)

  // --- Exercise 9

  val timezones = java.util.TimeZone.getAvailableIDs
  val americanTimezones = for (i <- timezones if i.startsWith("America/")) yield i.replace("America/", "")
  println("American Timezones: " + americanTimezones.sorted.mkString("[", ", ", "]"))

  // --- Exercise 10

  import java.awt.datatransfer._
  import collection.JavaConversions.asScalaBuffer
  val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  val natives = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
  val nativesBuffer : collection.mutable.Buffer[String] = natives
  println("Natives Buffer Type: "+ nativesBuffer.getClass)

}
