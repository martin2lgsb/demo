package runoob;

import java.util.ArrayList;
import java.util.Set;
import java.util.Vector;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class KeyInstanceOfEmp {
    public static void main(String[] args) {
//        Object testObject = new ArrayList();
        Object testObject = new Set[5];
        displayObjectClass(testObject);
    }

    public static void displayObjectClass(Object o) {
        if (o instanceof Vector) {
            System.out.println("Vector");
        } else if (o instanceof ArrayList) {
            System.out.println("ArrayList");
        } else {
            System.out.println("Other:" + o.getClass());
        }
    }
}
