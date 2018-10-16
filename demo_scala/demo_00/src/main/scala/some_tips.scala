import scala.collection.mutable

/**
  * Created by m2lgsb on 2018/10/16 11:09
  */
class some_tips {

}

object some_tips {
  def main(args: Array[String]): Unit = {
    println(max(1)(3))

    var c = Array(1, 3, 5, 7, 9)
    var str = c(2) // apply
    println(str)

    var score = mutable.Map(
      "Bob" -> 10
    )
    score("Bob") = 12 // update
    println(score)

    // map reduce filter foreach mkString zip fold
  }


  def as (x: Double) = { if (x > 0) x else -x }
  def fac(n: Int): Int = if (n < 0) 1 else fac(n - 1)
  def max(x: Int)(y: Int) = if (x >= y) x else y
}