package net.kwas.impatient.ch5

class BankAccount {
  private var value = 0
  def deposit(amount: Int) { value += amount }
  def withdraw(amount: Int) { value -= amount }
  def balance = value
}
