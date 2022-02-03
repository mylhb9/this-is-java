package ch08;

public interface ChildInterface2 extends ParentInterface{
    @Override
    default void method2() {
        System.out.println("ChildInterface2-method2()");
    }

    void method3();
}
