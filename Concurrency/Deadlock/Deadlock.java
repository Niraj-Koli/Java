package Deadlock;

public class Deadlock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    private static class Thread1 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: Has lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread 1: Has lock1 and lock2");
                }
                System.out.println("Thread 1: Released lock2");
            }
            System.out.println("Thread 1: Released lock1. Existing...");
        }
    }

    // When you will switch the locks in synchronized block in any one thread such
    // that //
    // if both threads are acquiring different locks at the start it will create a
    // deadlock //
    // To fix it both threads should acquire same lock so that one thread can finish
    // its execution //
    // and pass it to another thread //

    private static class Thread2 extends Thread {
        public void run() {
            synchronized (lock1) { // synchronized (lock2) = deadlock //
                System.out.println("Thread 2: Has lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread 2: Has lock1 and lock2");
                }
                System.out.println("Thread 2: Released lock2");
            }
            System.out.println("Thread 2: Released lock1. Exiting...");
        }
    }

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }

}