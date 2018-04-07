package runoob;

import java.io.IOException;

/**
 * 利用堆栈将中缀表达式转换成后缀表达式
 *
 * Created by m2lgsb on 05/03/2018
 */
public class StructFixEmp {
    private Stack theStack;
    private String input;
    private String output = "";

    public StructFixEmp(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new Stack(stackSize);
    }

    public String doTrans() {
        for (int j=0; j<input.length(); j++) {
            char ch = input.charAt(j);
//            System.out.println(theStack.isEmpty());
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }

            if (!theStack.isEmpty()) {
//                System.out.println(theStack.peek());
            }
        }
        while (!theStack.isEmpty()) {
            output = output + theStack.pop();
        }
        return output;
    }

    public void gotOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else {
                    output = output + opTop;
                }
            }
        }
        theStack.push(opThis);
    }

    public void gotParen(char ch) {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(') {
                break;
            } else {
                output = output + ch;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String input= "1+2*4/5-7+3/(5+2)";
        String output;
        StructFixEmp theTrans = new StructFixEmp(input);
        output = theTrans.doTrans();
        System.out.println(input);
        System.out.println(output);
    }

}

