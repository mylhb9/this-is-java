package ch02;

public class PromotionExample {
    public static void main(String[] args) {
        // byte -> int
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);

        // char -> int
        char charValue = '가';
        intValue = charValue;
        System.out.println(intValue);

        // int -> long
        intValue = 500;
        long longValue = intValue;
        System.out.println(longValue);

        // int -> double
        intValue = 200;
        double doubleValue = intValue;
        System.out.println(doubleValue);
    }
}
