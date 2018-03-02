package runoob;

/**
 * Java 字符串 - 链接字符串
 *
 * Created by m2lgsb on 02/03/2018
 */
public class StringConcatenateEmp {
    public static void main(String[] args) {
        String str1 = "This is" + "String";
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer();
        str2.append("This is");
        str2.append("StringBuffer");
        System.out.println(str2);
    }

}
