/**
  * Created by m2lgsb on 21/04/2018 09:44
  *
  * Scala 版本的单词数统计应用（暂时不需要深究细节）
  */

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

// 创建一个Scala版本的Spark Context
val conf = new SparkConf().setMaster("local").setAppName("WordCount")
val sc = new SparkContext(conf)

// 读取我们的输入数据
val input = sc.textFile("./README.txt")

// 把他们切分成一个个单词
val words = input.flatMap(line => line.split(" "))

// 转换为键值对并计数
val counts = words.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}
counts.saveAsTextFile("./output.txt")


