package ch06;

public class Calculator2Example {
    public static void main(String[] args) {
        Calculator2 myCalc = new Calculator2();

        double result1 = myCalc.areaRectangle(10);

        double result2 = myCalc.areaRectangle(10, 20);

        System.out.println("정사각형의 넓이=" + result1);
        System.out.println("직사각형의 넓이=" + result2);
    }
}
