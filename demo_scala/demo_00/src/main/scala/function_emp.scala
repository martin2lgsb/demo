
/**
  * Created by m2lgsb on 2018/10/15 18:44
  */
object function_emp {
  def main(args: Array[String]): Unit = {
    println(addInt(2, 3))
    val multiplier = (i: Int) => i * 10 // 匿名函数
    println(multiplier(2))

    val arr1 = Array[Int](3)
    println(arr1.toList)

    val arr2 = Array("a", "b", "c")
    println(arr2.toList)
    for (x <- arr2) {
      println(x)
    }

  }

  def addInt(a: Int, b: Int): Int = {
    a + b
  }

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }

}
