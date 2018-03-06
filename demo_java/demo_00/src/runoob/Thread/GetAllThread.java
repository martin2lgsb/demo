package runoob.Thread;

/**
 * Created by m2lgsb on 06/03/2018
 */
public class GetAllThread extends Thread {
    public static void main(String[] args) {
        GetAllThread t1 = new GetAllThread();
        t1.setName("thread 1");
        t1.start();
        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int noThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[noThreads];
        currentGroup.enumerate(lstThreads);
        for (int i = 0; i < noThreads; i++) {
            System.out.println("线程号：" + i + " - " + lstThreads[i].getName());
        }
    }
}
