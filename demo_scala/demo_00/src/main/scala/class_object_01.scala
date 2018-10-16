/**
  * Created by m2lgsb on 2018/10/16 11:29
  */
class class_object_01 {
  private var name = "scala"
  def sayName() = println("Hi: " + name)
  def getName() = name
  def setName(str: String) = name = str

}

object class_object_01 {
  def main(args: Array[String]): Unit = {
    val scala = new class_object_01
    scala.sayName()
    scala.setName("fxck")
    scala.sayName()
  }
}
