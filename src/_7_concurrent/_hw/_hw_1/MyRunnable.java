package _7_concurrent._hw._hw_1;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
