package runoob;

/**
 *
 * Java 字符串 - 字符串搜索
 *
 * Created by m2lgsb on 02/03/2018
 */
public class StringSearchStringEmp {
    public static void main(String[] args) {
        String strOing = "Google Runoob Taobao";
        int intIndex = strOing.indexOf("Runoob");
        if (intIndex == -1) {
            System.out.println("没有找到字符串");
        } else {
            System.out.println("字符串位置：" + intIndex);
        }
    }
}
