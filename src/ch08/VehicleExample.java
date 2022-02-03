package ch08;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // Vehicle 인터페이스에 checkFare() 메소드가 없어서 안됨
//        vehicle.checkFare();

        // 강제 타입 변환으로 문제 해결
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
