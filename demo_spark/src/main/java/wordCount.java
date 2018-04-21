/**
 * Created by m2lgsb on 21/04/2018 12:34
 *
 * Java 版本的单词数统计应用（暂时不需要深究细节）
 */

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;

import java.util.Arrays;
import java.util.Iterator;

public class wordCount {
    // 创建一个Java版本的Spark Context
    SparkConf conf = new SparkConf().setAppName("wordCount");
    JavaSparkContext sc = new JavaSparkContext(conf);

    // 读取我们的输入数据
    JavaRDD<String> input = sc.textFile("./README.txt");

    // 切分为单词
    JavaRDD<String> words = input.flatMap(
            new FlatMapFunction<String, String>() {
                public Iterator<String> call(String s) throws Exception {
                    return Arrays.asList(s.split(" "));
                }
            }
    );

    // 转换为键值对并计数
    JavaPairRDD<String, Integer> counts = words.mapToPair(
            new PairFunction<String, String, Integer>() {
                public Tuple2<String, Integer> call(String s) throws Exception {
                    return new Tuple2<String, Integer>(s, 1);
                }
            }
    ).reduceByKey(new Function2<Integer, Integer, Integer>() {
        public Integer call(Integer integer, Integer integer2) throws Exception {
            return integer + integer2;
        }
    });

    // 将统计出来的单词总数存入一个文本文件，引发求值
    counts.saveAsTextFile("./output/txt");
}
