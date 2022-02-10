package ch12;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();

        ThreadA2 threadA = new ThreadA2(sharedObject);
        ThreadB2 threadB = new ThreadB2(sharedObject);

        threadA.start();
        threadB.start();
    }
}
