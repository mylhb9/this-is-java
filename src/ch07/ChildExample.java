package ch07;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;
        parent.method1();
        // 오버라이딩 된 자식 메소드를 호출할 수 있음
        parent.method2();
        // 타입이 달라서 자식의 메소드는 호출이 불가능함
//        parent.method3();
    }
}
