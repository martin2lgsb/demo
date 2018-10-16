/**
  * Created by m2lgsb on 2018/10/16 10:10
  */
class companion_emp(name: String) {
  private def getUniqueSkill() = name + "的必杀技: " + companion_emp.uniqueSkill
}

object companion_emp {
  private val uniqueSkill = "scala"
  private val persion = new companion_emp("小强")
  def printUniqueSkill() = println(persion.getUniqueSkill())

  def main(args: Array[String]): Unit = {
    companion_emp.printUniqueSkill()
  }
}
