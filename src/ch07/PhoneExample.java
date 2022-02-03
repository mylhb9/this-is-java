package ch07;

public class PhoneExample {
    public static void main(String[] args) {
        // 추상클래스이므로 생성자 호출이 불가능하다
//        Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
