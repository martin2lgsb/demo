/**
  * Created by m2lgsb on 2018/10/16 09:59
  */
object optional_emp {
  def main(args: Array[String]): Unit = {
    val sites = Map(
      "runoob" -> "m.runoob.com",
      "google" -> "www.google.com"
    )

    println(sites.get("runoob"))
    println(show(sites.get("runoob")))
    println(show(sites.get("fxck")))

    val a: Option[Int] = Some(5)
    val b: Option[Int] = None
    println(a.getOrElse(0))
    println(b.getOrElse(0))


  }

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }
}
