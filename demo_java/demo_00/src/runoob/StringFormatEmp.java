package runoob;

import java.util.Locale;

/**
 * Java 字符串 - 字符串格式化
 *
 * Created by m2lgsb on 02/03/2018
 */
public class StringFormatEmp {
    public static void main(String[] args) {
        double e = Math.E;
        System.out.println(e);
        System.out.format("%f%n", e);
        System.out.format(Locale.CHINA, "%-10.4f%n%n", e);
    }

}
