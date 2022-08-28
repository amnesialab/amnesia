package amnesialab.doc

import amnesialab._, amnesialab._

object DecodeJsonExample extends App {

  case class Person(name: String, age: Int)

  // Explicit DecodeJson instance using hcursor
  //   (See http://amnesialab.io/doc/zipper for more detail).

  // In this example `--\` is just a combinator on HCursor,
  // you can and should utilize the full range of operations.

  implicit def PersonDecodeJson: DecodeJson[Person] =
    DecodeJson(c => for {
      name <- (c --\ "name").as[String]
      age <- (c --\ "age").as[Int]
    } yield Person(name, age))
}
