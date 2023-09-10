package Starvation;

public class Starvation {

    private static final Object lock = new Object();

    private static class Worker implements Runnable {
        private int Count = 1;
        private final String threadColor;

        public Worker(String threadColor) {
            this.threadColor = threadColor;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    System.out.format(threadColor + "%s: Count = %d\n", Thread.currentThread().getName(), Count++);
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

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
