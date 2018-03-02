package runoob;

import java.util.StringTokenizer;

/**
 *
 * Java 字符串 - 字符串分割(StringTokenizer)
 *
 * Created by m2lgsb on 02/03/2018
 */
public class StringSplitTkEmp {
    public static void main(String[] args) {
        String str = "This is String, split by StringTokenizer, created by runoob";

        StringTokenizer st1 = new StringTokenizer(str);
        while (st1.hasMoreElements()) {
            System.out.println(st1.nextElement());
        }

        StringTokenizer st2 = new StringTokenizer(str, ",");
        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }

}
