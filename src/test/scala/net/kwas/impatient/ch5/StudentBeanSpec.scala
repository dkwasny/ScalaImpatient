package net.kwas.impatient.ch5

import org.scalatest._

class StudentBeanSpec extends FlatSpec with Matchers {
  "A StudentBean" should "allow me to use Java bean properties" in {
    val studentBean = new StudentBean("Boo", 1)
    studentBean.setName("Kwas")
    studentBean.setId(12)
    studentBean.getName() should be ("Kwas")
    studentBean.getId() should be (12)
  }

  /* Yes, you can use the generated Java bean methods.
   * No, you should never use them unless you are coding in Java.
   * What's made in Scala should stay in Scala unless it can't.
   */
}
