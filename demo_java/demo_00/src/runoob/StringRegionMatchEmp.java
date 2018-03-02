package runoob;

/**
 * Java 字符串 - 测试两个字符串区域是否相等
 *
 * Created by m2lgsb on 02/03/2018
 */
public class StringRegionMatchEmp {
    public static void main(String[] args) {
        String first_str = "Welcome to Microsoft";
        String second_str = "I work with microsoft";
        boolean match1 = first_str.regionMatches(11, second_str, 12, 9);
        boolean match2 = first_str.regionMatches(true, 11, second_str, 12, 9);
        System.out.println(match1 + "," + match2);
    }

}
