package implementations

import traits.Person

// implementing comparison between two person

object mainClass {
  def main(args: Array[String]) {

    val firstPerson = new Person(name = "Mohd Alimuddin", age = 21)
    val secondPerson = new Person(name = "Dhruv Verma", age = 22)

    // checking all possible camparision

    println(firstPerson < secondPerson)
    println(secondPerson > firstPerson)
    println(firstPerson <= secondPerson)
    println(secondPerson >= firstPerson)
  }
}