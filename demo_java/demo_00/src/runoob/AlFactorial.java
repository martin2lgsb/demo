package runoob;

/**
 * 阶乘
 *
 * Created by m2lgsb on 05/03/2018
 */
public class AlFactorial {
    public static void main(String[] args) {
        for (int counter=0; counter<=10; counter++) {
            System.out.println(counter + "! = " + factorial(counter));
        }
    }

    public static long factorial(long number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
