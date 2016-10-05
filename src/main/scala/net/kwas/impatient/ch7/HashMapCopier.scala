package net.kwas.impatient.ch7

object HashMapCopier {
  import java.util.{HashMap => JavaHashMap}
  import collection.immutable.{HashMap => ScalaHashMap}
  
  def copy[A, B](source: JavaHashMap[A, B]): ScalaHashMap[A, B] = {
    val builder = ScalaHashMap.newBuilder[A, B]
    val iterator = source.entrySet().iterator()
    while (iterator.hasNext()) {
      val entry = iterator.next()
      builder += ((entry.getKey(), entry.getValue()))
    }

    builder.result
  }
}
