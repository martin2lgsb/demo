package runoob;

/**
 * Java 字符串 - 字符串分割
 *
 * Created by m2lgsb on 02/03/2018
 */
public class StringSplitEmp {
    public static void  main(String[] args) {
        String str = "www-runoob-com";
        String[] temp = str.split("-");
//        for (int i=0; i < temp.length; i++) {
//            System.out.println(temp[i]);
//        }

        for (String i: temp) {
            System.out.println(i);
        }
    }

}
