package MultipleThreads;

public class MultipleThreads {
    public static void main(String[] args) {
        Countdown1 countdown1 = new Countdown1();

        CountdownThread1 t1 = new CountdownThread1(countdown1);
        t1.setName("Thread 1");
        CountdownThread1 t2 = new CountdownThread1(countdown1);
        t2.setName("Thread 2");

        t1.start();
        t2.start();

        Countdown2 countdown2 = new Countdown2();

        CountdownThread2 t3 = new CountdownThread2(countdown2);
        t3.setName("Thread 3");
        CountdownThread2 t4 = new CountdownThread2(countdown2);
        t4.setName("Thread 4");

        t3.start();
        t4.start();
    }
}

class Countdown1 {
    public void doCountdown1() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColors.ANSI_RED;
                break;
            case "Thread 2":
                color = ThreadColors.ANSI_GREEN;
                break;
            default:
                color = ThreadColors.ANSI_BLUE;
                break;
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
        }
    }
}

class Countdown2 {

    private int i;

    public void doCountdown2() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 3":
                color = ThreadColors.ANSI_YELLOW;
                break;
            case "Thread 4":
                color = ThreadColors.ANSI_CYAN;
                break;
            default:
                color = ThreadColors.ANSI_PURPLE;
                break;
        }

        for (i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
        }
    }
}

class CountdownThread1 extends Thread {
    private final Countdown1 threadCountdown1;

    public CountdownThread1(Countdown1 countdown1) {
        threadCountdown1 = countdown1;
    }

    public void run() {
        threadCountdown1.doCountdown1();
    }
}

class CountdownThread2 extends Thread {
    private final Countdown2 threadCountdown2;

    public CountdownThread2(Countdown2 countdown2) {
        threadCountdown2 = countdown2;
    }

    public void run() {
        threadCountdown2.doCountdown2();
    }
}
