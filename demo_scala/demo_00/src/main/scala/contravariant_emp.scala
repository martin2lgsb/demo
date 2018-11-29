/**
  * Created by m2lgsb on 2018/11/29 11:06
  */
class contravariant_emp {

}

object contravariant_emp {
  def main(args: Array[String]): Unit = {
//    val cv1: Contravarian[AnyRef] = new Contravarian[String]
    val cv2: Contravarian[String] = new Contravarian[AnyRef]
  }
}

class Contravarian[-A]
