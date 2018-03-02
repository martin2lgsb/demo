package runoob;

/**
 *
 * Java 字符串 - 删除字符串中的最后一个字符
 *
 * Created by m2lgsb on 02/03/2018
 */
public class StringRemoveCharEmp {
    public static void main(String[] args) {
        String str = "this is Java";
        System.out.println(removeCharAt(str, 3));
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

}
