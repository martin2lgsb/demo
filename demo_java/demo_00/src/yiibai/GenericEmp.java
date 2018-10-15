package yiibai;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by m2lgsb on 2018/10/15 15:30
 */
public class GenericEmp {
    public static void main(String[] args) {
        /*
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add(111);
        */


        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
//        list.add(111);

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.println("name: " + name);
        }
    }
}

