package net.kwas.impatient.ch5

import org.scalatest._

class BankAccountSpec extends FlatSpec with Matchers {
  behavior of "A BankAccount"

  it should "initalize to zero" in {
    val bank = new BankAccount
    bank.balance should be (0)
  }

  it should "increase balance when depositing" in {
    val bank = new BankAccount
    bank.deposit(12)
    bank.balance should be (12)
  }

  it should "decrease balance when withdrawing" in {
    val bank = new BankAccount
    bank.deposit(100)
    bank.withdraw(10)
    bank.balance should be (90)
  }
}
