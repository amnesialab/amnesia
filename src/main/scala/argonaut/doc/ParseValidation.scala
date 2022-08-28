package amnesialab.doc

import amnesialab._, amnesialab._

object ParseValidation extends App {
  val result = Parse.parse("""
    {
      "name" : "bob",
      "age" : 49
    }
  """)

  println(if (result.isRight) "Parse was successful" else "Parse failed")
}
