package runoob;

/**
 *
 * Java 字符串 - 字符串比较
 *
 * Created by m2lgsb on 02/03/2018
 */
public class StringCompareEmp {
    public static void main(String[] args) {
        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;

        System.out.println( str.compareTo(anotherString) );
        System.out.println( str.compareToIgnoreCase(anotherString) );
        System.out.println( str.compareTo(objStr.toString()));
    }

}
