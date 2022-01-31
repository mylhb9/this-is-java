package ch03;

public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1; // 리터럴 간의 연산은 타입변환이 일어나지 않는다
        char c2 = 'A';
//        char c3 = c1 + 1; // 컴파일에러: 연산하면서 int 타입으로 변환되었기 때문에
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
//        System.out.println("c3: " + c3);
    }
}
