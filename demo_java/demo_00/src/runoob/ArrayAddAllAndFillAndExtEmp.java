package runoob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by m2lgsb on 02/03/2018
 */
public class ArrayAddAllAndFillAndExtEmp {
    public static void main(String[] args) {
        String[] a = {"A", "E", "I"};
        String[] b = {"O", "U"};
        List ls = new ArrayList(Arrays.asList(a));
        ls.addAll(Arrays.asList(b));
        Object[] c = ls.toArray();
        System.out.println(Arrays.toString(c));

        int[] arr1 = new int[6];
        Arrays.fill(arr1, 100);
        for (int i: arr1) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1, 3, 6, 50);
        for (int i: arr1) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(arr1));

        String[] names = new String[] {"A", "B", "C"};
        String[] ext = new String[5];
        ext[3] = "D";
        ext[4] = "E";
        System.arraycopy(names, 0, ext, 0, names.length);
        System.out.println(Arrays.toString(ext));
    }
}
