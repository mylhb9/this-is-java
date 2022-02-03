package ch08;

public class RemoteControlExample1 {
    public static void main(String[] args) {
        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.setMute(true);

        rc = new Audio1();
        rc.turnOn();
        rc.setMute(true);

        // 정적메소드는 인터페이스에서 바로 사용이 가능하다
        RemoteControl.changeBattery();
    }
}
