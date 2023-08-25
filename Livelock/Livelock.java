package Livelock;

public class Livelock {
    public static void main(String[] args) {
        final Worker worker1 = new Worker("Worker 1", true);
        final Worker worker2 = new Worker("Worker 2", true);

        final Resource resource = new Resource(worker1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker1.work(resource, worker2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker2.work(resource, worker1);
            }
        }).start();
    }
}
