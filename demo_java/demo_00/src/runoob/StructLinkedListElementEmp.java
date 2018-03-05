package runoob;

import java.util.LinkedList;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class StructLinkedListElementEmp {
    private LinkedList list = new LinkedList();

    public static void main(String[] args) {
        StructLinkedListElementEmp stack = new StructLinkedListElementEmp();
        for (int i=30; i<40; i++) {
            stack.push(i);
        }
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

    public void push(Object v) {
        list.addFirst(v);
    }

    public Object top() {
        return list.getFirst();
    }

    public Object pop() {
        return list.removeFirst();
    }
}
