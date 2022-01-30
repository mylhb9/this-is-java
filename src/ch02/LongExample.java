package ch02;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
//        long var3 = 10000000000; // 컴파일 에러 int 범위를 벗어나면 l or L을 붙여줘야한다.
        long var4 = 10000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
