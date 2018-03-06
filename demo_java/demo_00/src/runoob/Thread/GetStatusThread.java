package runoob.Thread;

/**
 * Created by m2lgsb on 06/03/2018
 */
public class GetStatusThread extends Thread {
    boolean waiting = true;
    boolean ready = false;

    GetStatusThread() {

    }

    public void run() {
        String thrdName = Thread.currentThread().getName();
        System.out.println(thrdName + " starting...");
        while (waiting) {
            System.out.println("waiting:" + waiting);
            System.out.println("waiting...");
            startWait();
            try {
                Thread.sleep(1000);
            } catch (Exception exc) {
                System.out.println(thrdName + " interrupted.");
            }
            System.out.println(thrdName + " terminating.");
        }
    }

    synchronized void startWait() {
        try {
            while (!ready) wait();
        } catch (InterruptedException exc) {
            System.out.println("wait() interrupted");
        }
    }

    synchronized void notice() {
        ready = true;
        notify();
    }

    public static void main(String[] args) throws Exception {
        GetStatusThread thrd = new GetStatusThread();
        thrd.setName("Thread #1");
        showThreadStaus(thrd);
        thrd.start();
        Thread.sleep(50);
        showThreadStaus(thrd);
        thrd.waiting = false;
        Thread.sleep(50);
        showThreadStaus(thrd);
        thrd.notice();
        Thread.sleep(50);
        showThreadStaus(thrd);
        while (thrd.isAlive()) {
            System.out.println("alive");
        }
        showThreadStaus(thrd);
    }

    static void showThreadStaus(Thread thrd) {
        System.out.println(thrd.getName() + " Alive:=" + thrd.isAlive() + " State:=" + thrd.getState());
    }
}

