package ch12;

public class YieldExample {
    public static void main(String[] args) {
        ThreadA1 threadA = new ThreadA1();
        ThreadB1 threadB = new ThreadB1();

        threadA.start();
        threadB.start();

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {}
        threadA.work = false;

        try {
            Thread.sleep(300);
        } catch(InterruptedException e) {}
        threadA.work = true;

        try {
            Thread.sleep(300);
        } catch(InterruptedException e) {}
        threadA.stop = true;
        threadB.stop = true;

    }
}
