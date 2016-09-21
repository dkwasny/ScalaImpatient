package net.kwas.impatient.ch5

import scala.beans.BeanProperty

class StudentBean(@BeanProperty var name: String, @BeanProperty var id: Long) {
}

