package runoob;

/**
 * Java 字符串 - 字符串性能比较测试
 *
 * Created by m2lgsb on 02/03/2018
 */
public class StringComparePerformanceEmp {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        for (int i=0; i<50000; i++) {
            String s1 = "hello";
            String s2 = "hello";
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("String 关键词创建：" + (endTime1 - startTime1));

        long startTime2 = System.currentTimeMillis();
        for (int i=0; i<50000; i++) {
            String s3 = new String("hello");
            String s4 = new String("hello");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("String 对象创建：" + (endTime2 - startTime2));
    }

}
