/**
  * Created by m2lgsb on 2018/10/16 11:39
  */
class class_object_02 {
  private var myName = "Kylin"
  def name = this.myName

  def name_(newName: String) = this.myName = newName

  var update = (newName: String) => this.myName = newName

  var bark: String => Unit = (w: String) => println(w)

}

object class_object_02 {
  def main(args: Array[String]): Unit = {
    val a = new class_object_02
//    a.update("asdf")
    a.name_("zzz")
    println(a.name)

    a.bark("aaa")

    val say: () => Unit = () => println("fxck")
    say()
  }
}
