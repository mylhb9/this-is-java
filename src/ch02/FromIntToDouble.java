package ch02;

public class FromIntToDouble {
    public static void main(String[] args) {
        int num1 = 123456780;
        int num2 = 123456780;

        double num3 = num2;
        num2 = (int) num3;

        int result = num1 - num2;
        System.out.println(result);
        // double 8 바이트 이므로 int에서 자동변환해도 손실이 없다
    }
}
