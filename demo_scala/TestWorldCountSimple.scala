import scala.io.Source

object TestWorldCountSimple {
    def main(args: Array[String]): Unit = {
        val b = Source.fromFile("""./world.txt""").getLines().toList.flatMap(_.split("\t")).map((_, 1)).groupBy(_._1).mapValues(_.map((_._2)).reduce(_+_))
        println(b)

    }
}
