package ch07;

public abstract class Phone {
    public String owner;

    public Phone(String owener) {
        this.owner = owener;
    }

    public void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
