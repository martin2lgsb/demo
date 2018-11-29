
/**
  * Created by m2lgsb on 2018/11/29 10:33
  */
class generic_class_emp {

}

object generic_class_emp {
  def main(args: Array[String]): Unit = {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    println(stack.pop)
    println(stack.pop)

    val stack2 = new Stack[Fruit]
    val apple = new Apple
    val banana = new Banana
    stack2.push(apple)
    stack2.push(banana)
    stack2.pop()
  }
}

class Stack[A] {
  private var elements: List[A] = Nil
  def push(x: A) { elements = x::elements }
  def peek: A = elements.head
  def pop(): A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }
}

class Fruit
class Apple extends Fruit
class Banana extends Fruit