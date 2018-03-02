package runoob;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by m2lgsb on 02/03/2018
 */
public class ArrayUnionEmp {
    public static void main(String[] args) {
        String[] arr1 = {"1", "2", "3"};
        String[] arr2 = {"4", "5", "6"};
        String[] result_union = union(arr1, arr2);

        for (String i: result_union) {
            System.out.println(i);
        }
    }

    public static String[] union(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<String>();

        for (String i: arr1) {
            set.add(i);
        }

        for (String i: arr2) {
            set.add(i);
        }

        String[] ret = {};
        return set.toArray(ret);
    }

}
