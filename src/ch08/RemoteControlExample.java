package ch08;

public class RemoteControlExample {
    public static void main(String[] args) {
//        RemoteControl rc;
//        rc = new Television();
//        rc = new Audio();

//        RemoteControl rc = new RemoteControl() {
//            @Override
//            public void turnOn() {
//
//            }
//
//            @Override
//            public void turnOff() {
//
//            }
//
//            @Override
//            public void setVolume(int volume) {
//
//            }
//        }

        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
    }
}
