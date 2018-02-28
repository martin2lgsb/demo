import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by m2lgsb on 28/02/2018
 */
public class Test {

    public static void main(String[] args) {

        String[] str1 = "1 2 3 4 5".split(" ");
        String[] str2 = "2 4".split(" ");
//        System.out.println(Arrays.toString(str1));
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (String i: str1) {
            arr1.add(Integer.parseInt(i));
        }
        for (String i: str2) {
            arr2.add(Integer.parseInt(i));
        }

        boolean ret = arr1.removeAll(arr2);

        String out1 = "";
        for (Integer i: arr1) {
            out1 += i.toString() + " ";
        }

        System.out.println(out1);
    }

}
