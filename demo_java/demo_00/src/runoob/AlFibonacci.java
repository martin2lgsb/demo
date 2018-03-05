package runoob;

/**
 * 斐波那契数列
 *
 * Created by m2lgsb on 05/03/2018
 */
public class AlFibonacci {
    public static void main(String[] args) {
        for (int counter=0; counter<=10; counter++) {
            System.out.println(counter + " : " + fibonacci(counter));
        }
    }

    public static long fibonacci(long number) {
        if (number == 0 || number ==1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

}
