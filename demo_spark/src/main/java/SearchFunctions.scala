import org.apache.spark.rdd.RDD

/**
  * Created by m2lgsb on 21/04/2018 13:10
  *
  * 函数传递
  */

class SearchFunctions(val query: String) {
  def isMatch(s: String): Boolean = {
    s.contains(query)
  }

  def getMatchesFunctionsReference(rdd: RDD[String]): RDD[String] = {
    rdd.map(isMatch)
  }

  def getMatchesFieldReference(rdd: RDD[String]): RDD[String] = {
    rdd.map(x => x.split(query))
  }

  def getMatchesNoReference(rdd: RDD[String]): RDD[String] = {
    val query_ = this.query
    rdd.map(x => x.split(query_))
  }
}