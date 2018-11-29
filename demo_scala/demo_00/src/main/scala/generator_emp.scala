/**
  * Created by m2lgsb on 2018/11/29 10:13
  */
class generator_emp {

}

object generator_emp {
  def main(args: Array[String]): Unit = {
    case class User(name: String, age: Int)

    val userBase = List(User("Travis", 28),
      User("Kelly", 33),
      User("Jenifer", 44),
      User("Dennis", 23))

    val twentySomethings = for (user <- userBase if (user.age >= 20 && user.age <30))
      yield user.name

    twentySomethings.foreach(println)

    val xs = List(1, 3, 5)
    val ys = List(2, 4, 6)

    println(for (x <- xs; y <- ys) yield x*y)
    println(xs flatMap {x => ys map {y => x*y}})
  }
}


