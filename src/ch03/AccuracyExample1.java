package ch03;

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number * pieceUnit;

        System.out.println("사과 한 개에서");
        System.out.println("0.7 조각을 빼면,");
        System.out.println(result + "조각이 남는다."); // float , double 형이 0.1을 정확히 표현할 수 없어서 생기는 문제이다
        // 따라서 정확한 계산이 필요할 시 가급적 정수 연산으로 변경해서 계산해야한다
    }
}
