package ch07;

public class ChildExample1 {
    public static void main(String[] args) {
        Parent1 parent = new Child1();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        // 자식의 필드와 메소드이기 때문에 자동타입 변환시 사용 불가능
//        parent.field2;
//        parent.method3();

        Child1 child = (Child1) parent;
        child.field2 = "yyy";
        child.method3();
    }
}
