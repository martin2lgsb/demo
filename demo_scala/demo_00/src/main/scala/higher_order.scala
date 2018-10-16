/**
  * Created by m2lgsb on 2018/10/16 10:18
  */
class higher_order {

}

object higher_order {
  def main(args: Array[String]): Unit = {
    // 函数可以直接赋值给变量
    val hiData = hiBigData _ // hiBigData(_)
    hiData("spark")

    // 匿名函数
    val f = (name: String) => println("Hi: " + name)
    f("Kafka")

    val list = List.range(1, 10)
    println(list.filter((x: Int) => x % 2 == 0))
    println(list.filter(x => x % 2 == 0))
    println(list.filter(_ % 2 == 0))

    // 函数可作为参数直接传给方法
    getName(f, "Scala")

    Array(1 to 10: _*).map{ (item: Int) => 2 * item }.foreach{ x => println(x) }

    // 函数的返回值可以是函数
    funcResult("Hello")("Java") //Currying 函数写法
    val res = funcResult("hello")
    res("java")

    // 函数作为参数
    val sayHello: () => Unit = () => println("Hello")
    sayHello()

    g(sayHello, 3)

    // 函数闭包
    var standardAge = 20
    val aa = (age: Int) => age >= standardAge
    println(aa(22))
    g2(aa, 22)

    standardAge = 23
    g2(aa, 22)


    var sum = 0
    val arr_s = Array(10, 20, 30)
    arr_s.foreach( (x: Int) => sum += x)
    println(sum)

    arr_s.foreach(sum += _)
    println(sum)

    println(arr_s.reduce(_+_))

    // 部分应用函数
    val sum_ = (a: Int, b: Int, c: Int) => a + b + c
    val f_s:Int => Int = sum_(10, 10, _: Int)
    println(f_s(30))

    // 柯里化函数 - Currying
    def multiply(x: Int)(y: Int) = println(x * y)
    multiply(10)(20)
  }

  def hiBigData(str: String): Unit = {
    println(str)
  }

  def getName(func: (String) => Unit, name: String): Unit = {
    func(name)
  }

  def funcResult(msg: String) = (name: String) => println(msg + ": " + name)

  def g(f:() => Unit, num: Int) = {
    for (i <- 1 to num) f()
  }

  def g2(f:Int => Boolean, age: Int) = {
    println(f(age))
  }
}
