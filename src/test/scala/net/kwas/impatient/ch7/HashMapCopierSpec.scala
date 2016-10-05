package net.kwas.impatient.ch7

import org.scalatest._
import java.util.{HashMap => JavaHashMap}
import collection.immutable.{HashMap => ScalaHashMap}

class HashMapCopierSpec extends FlatSpec with Matchers {

  behavior of "HashMapCopier"

  it should "copy a populated map" in {
    val javaMap = new JavaHashMap[Int, Int]()
    javaMap.put(1, 2)
    javaMap.put(3, 4)

    val actual = HashMapCopier.copy(javaMap)
    val expected = ScalaHashMap(
      (1, 2),
      (3, 4)
    )

    expected should be (actual)
  }

  it should "copy an empty map" in {
    val javaMap = new JavaHashMap[Int, Int]()
    val actual = HashMapCopier.copy(javaMap)
    val expected = ScalaHashMap()
    expected should be (actual)
  }

}
