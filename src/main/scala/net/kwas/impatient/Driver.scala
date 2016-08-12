package net.kwas.impatient
object Driver extends App {
	import collection.immutable.List
	import net.kwas.impatient._
	
	val apps = List(ch1.Exercises)
	
	for (app <- apps) {
		println(s"\nRunning ${app.getClass}")
		app.main(Array.empty)
	}
}