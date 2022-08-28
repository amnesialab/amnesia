package amnesialab.doc

import amnesialab._, amnesialab._

object EncodeJsonExample extends App {

  case class Person(name: String, age: Int)

  // Explicit EncodeJson instance using the object builder syntax
  //   (See http://amnesialab.io/doc/json for more detail).

  implicit def PersonEncodeJson: EncodeJson[Person] =
    EncodeJson((p: Person) =>
      ("name" := p.name) ->: ("age" := p.age) ->: jEmptyObject)
}
