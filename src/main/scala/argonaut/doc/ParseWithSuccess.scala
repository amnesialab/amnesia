package amnesialab.doc

import amnesialab._, amnesialab._

object ParseWithSuccess extends App {

  val json = """
    {
      "name" : "bob",
      "age" : 49
    }
  """

  val result = Parse.parseWith(json, _.isObject, _ => false)

  println(if (result) "json is an object" else "json is not an object")

}
