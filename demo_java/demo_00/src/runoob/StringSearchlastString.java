package runoob;

/**
 *
 * Java 字符串 - 查找字符串最后一次出现的位置
 *
 * Created by m2lgsb on 02/03/2018
 */
public class StringSearchlastString {
    public static void main(String[] args) {
        String strOrig = "Hello world, Hello Runoob";
        int lastIndex = strOrig.lastIndexOf("Runoob");
        if (lastIndex == -1) {
            System.out.println("没有找到字符串");
        } else {
            System.out.println("字符串最后出现的位置：" + lastIndex);
        }
    }

}
