package runoob;

import java.io.IOException;

/**
 * 压栈出栈的方法实现字符串反转
 *
 * Created by m2lgsb on 05/03/2018
 */
public class StructStringReverseEmp {
    private String input;
    private String output;

    public StructStringReverseEmp(String in) {
        input = in;
    }

    public String doRev() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        String input = "www.w3cschool.cc";
        String output;
        StructStringReverseEmp theReverser = new StructStringReverseEmp(input);
        output = theReverser.doRev();
        System.out.println(output);
    }

}

class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int max) {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
