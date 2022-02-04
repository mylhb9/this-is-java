package ch09;

public class A1 {
    int field1;

    void method1() {

    }
    static int field2;

    static void method2() {}

    class B {
        void method() {
            field1 = 10;
            method1();

            field2 = 10;
            method2();
        }
    }

    static class C {
        void method() {
            // static 메모리에 떠있지 않으므로 사용이 불가능 / 인스턴스 필드와 메소드는 접근할 수 없다
//        fiedl1 = 10;
//        method1();

            field2 = 10;
            method2();
        }
    }
}
