package Thread;

public class OddEvenLockVariable {

    private static final Object lock = new Object();
    private static int count = 1;

    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddPrinter());
        Thread evenThread = new Thread(new EvenPrinter());

        oddThread.start();
        evenThread.start();
    }

    static class OddPrinter implements Runnable {
        @Override
        public void run() {
            while (count <= 10) {
                synchronized (lock) {
                    if (count % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + count++);
                        lock.notify(); // Notify waiting thread (evenThread)
                    } else {
                        try {
                            lock.wait(); // Wait for notification from evenThread
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            while (count <= 10) {
                synchronized (lock) {
                    if (count % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + count++);
                        lock.notify(); // Notify waiting thread (oddThread)
                    } else {
                        try {
                            lock.wait(); // Wait for notification from oddThread
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

//https://www.youtube.com/watch?v=4uQAokzfm-Q