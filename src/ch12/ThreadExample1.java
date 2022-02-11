package ch12;

public class ThreadExample1 {
    public static void main(String[] args) {
        Thread thread = new MovieThread1();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        thread.interrupt();
    }
}
