package runoob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by m2lgsb on 02/03/2018
 */
public class ArrayReverseEmp {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        arr.add("F");
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);

        Integer[] num = {8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(num));
        int max = (int) Collections.max(Arrays.asList(num));
        System.out.println(num + ":" + min + "|" + max);
    }

}
