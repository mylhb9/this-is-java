package ch12;

public class PrintThread2 extends Thread{
    @Override
    public void run() {
        try {
            while(true) {
                System.out.println("실행중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {}
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
