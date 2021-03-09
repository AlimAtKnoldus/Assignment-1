package traits

class Person(val name:String, val age: Int) extends  Ordered[Person] {

  /*
  comparing two person age on the basis of
  * if name are same, then compare age
  * if name are not same then compare the name length
   */

  override def compare(that:Person): Int = {

    //if name are same

    if (this.name == that.name) {

      // comparing age

      if(this.age<that.age) {
        -1
      }
      else {
        1
      }
    }

    //if name are not same then comparing name length

    else
      {
        if (this.name.length < that.name.length) {
          -1
        }
        else{
          1
        }
      }
  }
}