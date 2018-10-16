/**
  * Created by m2lgsb on 2018/10/15 19:26
  */
// TODO: debug notcompare to document
object apply_emp01 {
  def main(args: Array[String]): Unit = {
    val email = apply_emp01("abc", "qq.com")
    println(email)
  }

  def apply(user: String, domain: String): String = {
    println("Apply method called")
    user + "@" + domain
  }
}
