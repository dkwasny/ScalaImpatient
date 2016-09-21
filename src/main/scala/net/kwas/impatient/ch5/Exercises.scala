package net.kwas.impatient.ch5

object Exercises extends App {

  // --- Exercise 1
 
  val counter = new Counter
  println(s"Counter Zero: ${counter.current()}")
  counter.increment(Int.MaxValue - 1)
  println(s"Counter Before Max: ${counter.current()}")
  counter.increment(1)
  println(s"Counter at Max: ${counter.current()}")
  counter.increment(1)
  println(s"Counter after Max: ${counter.current()}")


  // --- Exercise 2

  var bankAccount = new BankAccount
  println(s"No Money: ${bankAccount.balance}")
  bankAccount.deposit(152)
  println(s"Some Money: ${bankAccount.balance}")
  bankAccount.withdraw(899)
  println(s"Debt Money: ${bankAccount.balance}")
}
