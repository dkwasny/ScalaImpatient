package net.kwas.impatient.ch7

// --- Exercise 1

package com {
  package horstmann {
    object Exercise1MiddleTier {
      val value = "MiddleTier"
    }
    package impatient {
      object Exercise1Nested {
        def run(): Unit = {
          println("Exercise 1: Nested package name")
          println(Exercise1MiddleTier.value)
        }
      }
    }
  }
}
  
package com.horstmann.impatient {
  object Exercise1Chained {
    def run(): Unit = {
      println("Exercise 1: Chained package name")
      
      // This object can access Exercise1Nested since the
      // package names end up being the same.
      Exercise1Nested.run()
      
      // This object cannot acces the object defined in
      // com.horstmann since it uses a chained package name.
      //println(Exercise1MiddleTier.value)
    }
  }
}

// --- Exercise 2

package zombo {
  package com.horstmann.impatient {
    object Exercise2 {
      def run(): Unit = {
        println("Welcome to Zombocom")
        println("The only limitation is yourself")
      }
    }
  }
}

// --- Exercise 5

package com.horstmann.impatient {
  object ComFriendlyObject {
    // Exposing "private" fields to the entire com root package
    // seems very silly.
    private[com] val hidden = "It's hidden...but not too well"
    val visible = "Not hidden at all"
  }
}

package com.kwas {
  object Exercise5 {
    def run(): Unit = {
      println(com.horstmann.impatient.ComFriendlyObject.visible)
      println(com.horstmann.impatient.ComFriendlyObject.hidden)
    }
  }
}

package kwas.com {
  object Exercise5 {
    def run(): Unit = {
      println(com.horstmann.impatient.ComFriendlyObject.visible)
      // The below line does not compile because this object is not
      // a part of the "com" root level package.
      //println(com.horstmann.impatient.ComFriendlyObject.hidden)
    }
  }
}

object Exercises extends App {
  
  // --- Exercise 1

  println("Running Nested")
  com.horstmann.impatient.Exercise1Nested.run()
  println("Running Chained")
  com.horstmann.impatient.Exercise1Chained.run()

  // --- Exercise 2

  // The below line only compiles once we import the zombo package.
  // Once the import is done, it looks like Exercise2 is
  // a part of the com.horstmann.impatient package.
  //com.horstmann.impatient.Exercise2.run()
  {
    import zombo._
    com.horstmann.impatient.Exercise2.run()
  }

  // --- Exercise 3

  {
    import random._
    setSeed(13)
    for (i <- 1 to 10) {
      println(s"${i} => ${nextInt()}")
    }
  }

  // --- Exercise 4
  
  // My guess is that it forces the dev to be more organized with their code.
  
  // --- Exercise 5
  
  com.kwas.Exercise5.run()
  kwas.com.Exercise5.run()

  // --- Exercise 8

  // It will import everything under the java and javax packages.
  // Importing that much stuff is bound to cause import conflicts
  // or just be plain sloppy and confusing.
  
  // --- Exercise 9
  
  // I am not going to read the password from standard in...
  // Automated testing becomes a pain if I do...
  // I would use System.console().readPassword() if I did.
  def checkPassword(password: String): Unit = {
    import java.lang.System

    val username = System.getProperty("user.name")

    if (password == "secret") {
      println(s"Welcome ${username}")
    }
    else {
      System.err.println(s"Invalid password for user ${username}")
    }

  }

  checkPassword("whoops")
  checkPassword("secret")

  // --- Exercise 10
  
  // Many of the boxed datatypes are overidden.
}
