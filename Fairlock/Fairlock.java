package Fairlock;

import java.util.concurrent.locks.ReentrantLock;

public class Fairlock {
    private static final ReentrantLock lock = new ReentrantLock(true); // true = Fair Lock // First come first served //

    private static class Worker implements Runnable {
        private int Count = 1;
        private final String threadColor;

        public Worker(String threadColor) {
            this.threadColor = threadColor;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                try {
                    System.out.format(threadColor + "%s: Count = %d\n", Thread.currentThread().getName(), Count++);
                } finally {
                    lock.unlock();
                }

            }

        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker(ThreadColors.ANSI_RED), "Priority 10");
        Thread t2 = new Thread(new Worker(ThreadColors.ANSI_YELLOW), "Priority 8");
        Thread t3 = new Thread(new Worker(ThreadColors.ANSI_BLUE), "Priority 6");
        Thread t4 = new Thread(new Worker(ThreadColors.ANSI_GREEN), "Priority 4");
        Thread t5 = new Thread(new Worker(ThreadColors.ANSI_PURPLE), "Priority 2");

        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(6);
        t4.setPriority(4);
        t5.setPriority(2);

        t4.start();
        t1.start();
        t5.start();
        t3.start();
        t2.start();
    }

}
