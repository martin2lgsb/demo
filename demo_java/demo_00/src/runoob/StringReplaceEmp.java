package runoob;

/**
 *
 * Java 字符串 - 字符串替换
 *
 * Created by m2lgsb on 02/03/2018
 */
public class StringReplaceEmp {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println( str.replace('o', 'O') );
        System.out.println( str.replaceFirst("l", "L") );
        System.out.println( str.replaceAll("l", "L") );
    }

}
