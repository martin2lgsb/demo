package runoob.Thread;

/**
 * Created by m2lgsb on 06/03/2018
 */
public class TwoThreadAlive extends Thread {
    public void run() {
        for (int i=0; i<10; i++) {
            printMsg();
        }
    }

    public void printMsg() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);
    }

    public static void main(String[] args) {
        TwoThreadAlive tt = new TwoThreadAlive();
        tt.setName("Thread");
        System.out.println(tt.isAlive());
        tt.start();
        System.out.println(tt.isAlive());
        for (int i=0; i<10; i++) {
            tt.printMsg();
        }
        System.out.println(tt.isAlive());
    }
}
