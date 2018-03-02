package runoob;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by m2lgsb on 02/03/2018
 */
public class ArrayUniqueEmp {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 5, 5, 6, 6, 7, 2};
        Set ls1 = new HashSet();
        List ls2 = new ArrayList();

        for (int i=0; i<arr1.length-1; i++) {
            for (int j=i+1; j<arr1.length; j++) {
                if ((arr1[i] == arr1[j]) && (i != j)) {
                    ls1.add(arr1[i]);
                }
            }
        }

        System.out.println(ls1.toString());
    }
}
