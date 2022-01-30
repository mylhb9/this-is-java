package ch02;

public class FromIntToFloat {
    public static void main(String[] args) {
        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2;
        num2 = (int) num3;

        int result = num1 - num2;
        System.out.println(result);
        // int 값을 float로 자동변환할 때, 문제가 발생 둘다 바이트 수가 동일하므로
    }
}
