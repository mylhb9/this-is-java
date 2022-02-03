package ch07;

public class InstanceofExample {
    public static void method1(Parent2 parent) {
        if(parent instanceof Child2) {
            Child2 child = (Child2) parent;
            System.out.println("method1 - Child로 변환 성공");
        } else {
            System.out.println("method1 - Child로 변환되지 않음");
        }
    }

    public static void method2(Parent2 parent) {
        Child2 child = (Child2) parent;
        System.out.println("method2 - Child로 변환 성공");
    }

    public static void main(String[] args) {
        Parent2 parentA = new Child2();
        method1(parentA);
        method2(parentA);

        Parent2 parentB = new Parent2();
        method1(parentB);
        // instanceof로 자식 객체를 참조하는지 확인을 안했으므로 자식 객체를 참조하지 않는 객체여서 캐스팅시 ClassCastException 이 발생함
//        method2(parentB);
    }
}
