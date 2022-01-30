package ch02;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
//        byte byteValue3 = byteValue1 + byteValue2; // 컴파일에러: 기본 연산은 int 타입으로 진행되기 때문에
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1);

        char charValue1 = 'A';
        char charValue2 = 1;
//        char charValue3 = charValue1 + charValue2; // 컴파일에러: 기본 연산은 int 타입으로 진행되기 때문에
        int intValue2 = charValue1 + charValue2;
        System.out.println(intValue2);
        System.out.println((char) intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3 / 4;
        System.out.println(intValue4);

        int intValue5 = 10;
//        int intValue6 = intValue5/4.0; // 컴파일에러: 연산 중에 double 타입이 들어갔으므로 double 타입으로 받아줘야 함
        double doubleValue = intValue5/4.0;
        System.out.println(doubleValue);

    }
}
