/**
  * Created by m2lgsb on 2018/11/29 11:19
  */
class types_emp {

}

object types_emp {
  def main(args: Array[String]): Unit = {
    val buf = newIntSeqBuf2(7, 8)
    println(buf.length)
    println(buf.element)
  }

  def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuff =
    new IntSeqBuff {
      type T = List[Int]
      val element = List(elem1, elem2)
    }

  def newIntSeqBuf2(e1: Int, e2:Int): SeqBuff2[Int, Seq[Int]] =
    new SeqBuff2[Int, List[Int]] {
      val element = List(e1, e2)
    }
}

// condition - 1st
trait Buffer {
  type T
  val element: T
}

abstract class SeqBuff extends Buffer {
  type U
  type T <: Seq[U]
  def length = element.length
}

abstract class IntSeqBuff extends SeqBuff {
  type U = Int
}

// condition - 2nd
abstract class Buffer2[+T] {
  val element: T
}

// + -> new, <: -> V: type[A, B]
abstract class SeqBuff2[U, +T <: Seq[U]] extends Buffer2[T] {
  def length = element.length
}