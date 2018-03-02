package runoob;

/**
 * Java 字符串 - 字符串优化
 *
 * Created by m2lgsb on 02/03/2018
 */
public class StringOptimizationEmp {
    public static void main(String[] args) {
        String[] varibles = new String[50000];
        for (int i=0; i<50000; i++) {
            varibles[i] = "s" + i;
        }

        long startTime0 = System.currentTimeMillis();
        for (int i=0; i<50000; i++) {
            varibles[i] = "hello";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("直接使用字符串：" + (endTime0 - startTime0));

        long startTime1 = System.currentTimeMillis();
        for (int i=0; i<50000; i++) {
            varibles[i] = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("new 关键字：" + (endTime0 - startTime0));

        long startTime2 = System.currentTimeMillis();
        for (int i=0; i<50000; i++) {
            varibles[i] = new String("hello");
            varibles[i] = varibles[i].intern();
        }
        long endTime2 =System.currentTimeMillis();
        System.out.println("intern() 方法：" + (endTime0 - startTime0));
    }

}
