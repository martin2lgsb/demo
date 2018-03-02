package runoob;

/**
 *
 * Java 字符串 - 字符串反转
 *
 * Created by m2lgsb on 02/03/2018
 */
public class StringReverseEmp {
    public static void main(String[] args) {
        String str = "runoob";
        String rev = new StringBuffer(str).reverse().toString();
        System.out.println(str + " => " + rev);
    }

}
