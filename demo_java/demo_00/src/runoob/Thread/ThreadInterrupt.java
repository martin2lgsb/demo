package runoob.Thread;

/**
 * Created by m2lgsb on 06/03/2018
 */
public class ThreadInterrupt extends Thread {
    public void run() {
        try {
            sleep(50000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        Thread t = new ThreadInterrupt();
        t.start();
        System.out.println("50秒内任意键中断");
        System.in.read();
        t.interrupt();
        t.join();
        System.out.println("线程已经退出");
    }
}