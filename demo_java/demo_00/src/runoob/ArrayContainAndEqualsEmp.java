package runoob;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by m2lgsb on 02/03/2018
 */
public class ArrayContainAndEqualsEmp {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        ArrayList<String> arr2 = new ArrayList<String>();
        arr1.add(0, "A0");
        arr1.add(1, "A1");
        arr1.add(2, "A2");
        arr1.add(3, "A3");
        arr1.add(4, "A4");
        arr1.add(5, "A5");
        arr2.add(0, "A3");
        arr2.add(1, "A5");

        System.out.println("arr1-A3:" + arr1.contains("A3"));
        System.out.println("arr2-A5:" + arr2.contains("A5"));

        int[] ary1 = {1, 2, 3, 4, 5};
        int[] ary2 = {1, 3, 5};
        int[] ary3 = {1, 3, 5};
        System.out.println("1-2:" + Arrays.equals(ary1, ary2));
        System.out.println("2-3:" + Arrays.equals(ary2, ary3));
    }

}
