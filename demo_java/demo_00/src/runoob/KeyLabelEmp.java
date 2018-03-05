package runoob;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class KeyLabelEmp {
    public static void main(String[] args) {
        String strSearch = "This is the string in which you have to search for a substring.";
        String substring = "substring";
        boolean found = false;
        int max = strSearch.length() - substring.length();

        System.out.println("Fxck label");
        lblabc:
        for (int i=0; i<=max; i++) {
            int length = substring.length();
            int j = i;
            int k = 0;
            while (length-- != 0) {
                if (strSearch.charAt(j++) != substring.charAt(k++)) {
                    continue;
//                    continue lblabc;
                }
            }

            found = true;
            break;
//            break lblabc;
        }

        if (found) {
            System.out.println("发现子串");
        } else {
            System.out.println("未发现子串");
        }

    }
}
