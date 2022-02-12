package ch14;

public class UsingLocalVariable {
    void method(int arg) {
        int localVar = 40;


        // 람다식 내에서 사용되는 매개 변수 또는 로컬 변수는 final 특성을 갖게 됨
        MyFunctionalInterface fi = () -> {
            System.out.println("arg: " + arg);
            System.out.println("localVar: " + localVar);
        };
        fi.method();
    }
}
