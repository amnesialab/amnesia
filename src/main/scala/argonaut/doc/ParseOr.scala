package amnesialab.doc

import amnesialab._, amnesialab._

object ParseOr extends App {

  val json = """
    [ "thing1", "thing2", "cat", "hat" ]
  """

  val result = Parse.parseOr(json, _.arrayOrEmpty, Nil)

  println("Valid list elements: ")
  result.foreach(println)

}
