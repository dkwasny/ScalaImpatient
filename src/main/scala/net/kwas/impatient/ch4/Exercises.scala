package net.kwas.impatient.ch4
object Exercises extends App {

  // --- Exercise 1

  val gizmoMap = Map(
    ("Controller", 10),
    ("Microphone", 60),
    ("Computer", 400),
    ("Tape", 1)
  )
  println("Gizmos: " + gizmoMap)

  val discountedGizmoMap = gizmoMap.mapValues(_ * 0.9)
  println("Discounted Gizmos: " + discountedGizmoMap)

  // --- Exercise 2
  
  import collection.Traversable
  
  def doExerciseTwo(header: String, words: Traversable[String], map: collection.mutable.Map[String, Int]): Unit = {
    for (x <- words) {
      map(x) = map.getOrElse(x, 0) + 1
    }
    println(header + map.getClass + map)
  }

  // Instead of reading a file, I will just use a list of words
  val words = """David was a person but now David is not.
    Was David in the right to become a punk?"""
    .split(' ')
    .map(_.trim)
    .filter(!_.isEmpty)

  val wordMap = collection.mutable.Map[String, Int]()
  doExerciseTwo("Scala Mutable Map: ", words, wordMap)

  // --- Exercise 3

  def doExerciseThree(header: String, words: Traversable[String], map: collection.Map[String, Int]): Unit = {
    var retVal = map
    for (x <- words) {
     retVal = retVal + (x -> (retVal.getOrElse(x, 0) + 1))
    }
    println(header + retVal.getClass + " " + retVal)
  }

  val immutableWordMap = Map[String, Int]()
  doExerciseThree("Immutable Word Map: ", words, immutableWordMap)
  
  // --- Exercise 4

  import collection.SortedMap
  val sortedWordMap = SortedMap[String, Int]()
  doExerciseThree("Sorted Word Map: ", words, sortedWordMap)

  // --- Exercise 5
  
  import collection.JavaConversions.mapAsScalaMap
  import java.util.TreeMap
  val javaMap: collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
  doExerciseTwo("Java Tree Map: ", words, javaMap)

  // --- Exercise 6

  import collection.mutable.LinkedHashMap
  import java.util.Calendar
  val dayMap = LinkedHashMap[String, Int]()
  dayMap("Sunday") = Calendar.SUNDAY
  dayMap("Monday") = Calendar.MONDAY
  dayMap("Tuesday") = Calendar.TUESDAY
  dayMap("Wednesday") = Calendar.WEDNESDAY
  dayMap("Thursday") = Calendar.THURSDAY
  dayMap("Friday") = Calendar.FRIDAY
  dayMap("Saturday") = Calendar.SATURDAY

  // Since mkString comes from TraversableOnce, it should be enough
  // to show the iterating order of the map.
  println("Day Map: " + dayMap.mkString("[", ", ", "]"))

  // --- Exercise 7

  import collection.JavaConversions.propertiesAsScalaMap

  val propertyMap: collection.mutable.Map[String, String] = System.getProperties()
  val maxPropNameSize = propertyMap.maxBy(_._1.length)._1.length
  println("Java Property Table:")
  for ((x, y) <- propertyMap) {
    println(x.padTo(maxPropNameSize, ' ') + " | " + y)
  }

  // --- Exercise 8

  val ints = Array(1, 2, 3, 4, 5)
  
  def minmax(values: Array[Int]): (Int, Int) = {
    (values.min, values.max)
  }
  println("Minmax: " + minmax(ints))

  // --- Exercise 9

  def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
    (values.count(_ < v), values.count(_ == v), values.count(_ > v))
  }
  println("Lteqgt: " + lteqgt(ints, 4))

  // --- Exercise 10
  // Zip appears to just be a way to quickly map independent lists together.
  //
  // To steal from the book, a good use case would be mapping
  // an operation to the number of times it should be executed.
  //
  // I feel like anything I would use zip for would already
  // have a relationship in the data or I would make the mapping myself.
  //
  // Relying on two independent lists to just "line up" is not ideal to me.
  //
  // Maybe managing legacy code/data would be a good place for zip.

  println("Zipped String: " + "Hello".zip("World"))
}
