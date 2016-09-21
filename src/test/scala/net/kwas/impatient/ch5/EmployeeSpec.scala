package net.kwas.impatient.ch5

import org.scalatest._

class EmployeeSpec extends FlatSpec with Matchers {

  behavior of "An Employee"

  it should "default name to 'John Q. Public'" in {
    val employee = new Employee
    employee.name should be ("John Q. Public")
  }

  it should "default salary to 0.0" in {
    val employee = new Employee
    employee.salary should be (0.0)
  }

}
