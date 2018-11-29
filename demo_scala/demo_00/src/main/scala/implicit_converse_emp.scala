/**
  * Created by m2lgsb on 2018/11/29 13:48
  */
class implicit_converse_emp {

}

object implicit_converse_emp extends App {

}

class Implicit(val num: Int) {
  def show = println(num)
}

object Implicit {
  implicit def implToInt(impl: Implicit) = impl.num
  def apply(num: Int) = new Implicit(num)

  implicit def intToImpl(num: Int) = new Implicit(num)

  implicit val impl = 200.0
  def testImplocit(implicit num: Double) = println(num)
}

// 当一个实例自身和方法的参数都能通过隐式转换来满足方法调用时，优先转换方法参数而不是实例自身
class Impl1(val str: String = "100") {
  def show(impl: Impl2) = println(impl.str)
}

object Impl1 {
  implicit def impl1ToImpl2(impl: Impl1) = new Impl2(impl.str)
}

class Impl2(val str: String = "200") {
  def show(impl: Impl1) = println(impl.str)
  def test = println(300)
}

object Main extends App {
  implicit def implToStr(impl: Implicit) = impl.num.toString

  def showNum(num: Int) = println(num)
  def showStr(str: String) = println(str)

  showNum(Implicit(100))
  showStr(Implicit(200))

  import Implicit.intToImpl
  120.show

  val impl1 = new Impl1
  impl1.test
  impl1.show(impl1)

  import Implicit.impl
  Implicit.testImplocit
}

/**
def testImplicit(implicit num0: Int, num1: Int) {} //正确。num0、num1，皆为隐式参数
def testImplicit(implicit num0: Int, implicit num1: Int) {} //错误。只能在参数表的首个参数前添加implicit关键字修饰
def testImplicit(num0: Int, implicit num1: Int) {} //错误。只能在参数表的首个参数前添加implicit关键字修饰

def testImplicit(num: Int)(implicit num0: Int, num1: Int) {} //正确。对于柯里化函数，最后一个参数表可以设为隐式参数
def testImplicit(implicit num0: Int)(implicit num1: Double) {} //错误。一个方法不允许拥有多个隐式参数表
def testImplicit(implicit num0: Int)(num1: Double) {} //错误。只有最后一个参数表可以设为隐式参数表
*/