package runoob;

import java.util.ArrayList;

/**
 * Created by m2lgsb on 02/03/2018
 */
public class ArrayOperateEmp {
    public static void main(String[] args) {
        ArrayList<String> lsArr1 = new ArrayList<String>();
        lsArr1.clear();
        lsArr1.add(0, "A0");
        lsArr1.add(1, "A1");
        lsArr1.add(2, "A2");
        System.out.println(lsArr1);
        lsArr1.remove(1);
        System.out.println(lsArr1);

        ArrayList<String> lsArr2 = new ArrayList<String>();
        lsArr2.add(0, "A0");
        lsArr2.add(1, "A1");
        lsArr2.add(2, "A2");
        lsArr2.add(3, "A3");

        lsArr2.removeAll(lsArr1); //差集
        System.out.println(lsArr2);

        lsArr2.retainAll(lsArr1); //交集
        System.out.println(lsArr1);
    }
}
