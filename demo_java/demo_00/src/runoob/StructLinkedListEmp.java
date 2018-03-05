package runoob;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class StructLinkedListEmp {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        System.out.println(lList);
        lList.addFirst("0");
        lList.addLast("6");
        System.out.println(lList);

        System.out.println(lList.getFirst());
        lList.subList(2, 4).clear();
        System.out.println(lList);
        System.out.println(lList.indexOf("2"));
        System.out.println(lList.lastIndexOf("4"));
        lList.set(2, "8");
        System.out.println(lList);

        Vector<String> v = new Vector<>();
        v.add("X");
        v.add("M");
        v.add("D");
        v.add("A");
        v.add("O");
        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, "D");
        System.out.println(index);
        Collections.swap(v, 0, 4);
        System.out.println(v);

        Vector<Double> v2 = new Vector<>();
        v2.add(new Double("3.424"));
        v2.add(new Double("3.4324"));
        v2.add(new Double("3.24"));
        v2.add(new Double("3.44"));
        System.out.println(Collections.max(v2));

    }
}
