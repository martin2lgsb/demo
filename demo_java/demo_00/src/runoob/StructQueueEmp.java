package runoob;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class StructQueueEmp {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for (String q: queue) {
            System.out.println(q);
        }
        System.out.println(queue);

        System.out.println(queue.poll()); //remove 抛异常 - poll 返回null;
        System.out.println(queue);

        System.out.println(queue.element());
        System.out.println(queue.peek()); //element 抛异常 - peek 返回null;

    }

}
