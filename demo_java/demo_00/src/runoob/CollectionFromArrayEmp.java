package runoob;

import java.io.IOException;
import java.util.*;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class CollectionFromArrayEmp {
    public static void main(String[] args) throws IOException {
        String[] name = new String[] {"张三", "李四", "王二", "麻子"};
        System.out.println(Arrays.toString(name));

        List<String> list = Arrays.asList(name);
        System.out.println(list);

        String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
        Set<String> set1 = new TreeSet<String>();
        for (String i: coins) {
            set1.add(i);
        }
        System.out.println(Collections.min(set1, String.CASE_INSENSITIVE_ORDER));

        HashMap<String, String> hMap1 = new HashMap<>();
        hMap1.put("1", "d1");
        hMap1.put("2", "d2");
        hMap1.put("3", "d3");
        hMap1.put("4", "d4");
        hMap1.put("5", "d5");
        hMap1.put("6", "d6");
        Collection cl1 = hMap1.values();
        Iterator itr1 = cl1.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println(cl1.size());
        System.out.println(cl1.isEmpty());

        hMap1.remove("1");
        System.out.println(hMap1);
        System.out.println(hMap1.keySet());
        System.out.println(hMap1.values());

        String[] arr1 = {"d", "a", "f", "x", "c"};
        List l1 = new ArrayList(Arrays.asList(arr1));
        Collections.rotate(l1, 3);
        System.out.println(l1);

        List<String> l2 = new ArrayList<>();
        l2.add("老张");
        l2.add("李四");
        l2.add("张三");
        Collections.replaceAll(l2, "张三", "麻子");
        String[] s1 = l2.toArray(new String[0]);
        System.out.println(Arrays.toString(s1));

        List<String> l3 = new ArrayList<>();
        l3.add("李四");
        System.out.println(Collections.indexOfSubList(l2, l3));

        Hashtable<String, String> ht1 = new Hashtable<>();
        ht1.put("1", "one");
        ht1.put("2", "two");
        ht1.put("3", "three");

        Enumeration enu = ht1.elements();
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }
    }
}
