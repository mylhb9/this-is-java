package ch13;

public class UtilExample {
    public static void main(String[] args) {
        Pair1<String, Integer> pair = new Pair1<>("홍길동", 35);
        Integer age = Util3.getValue(pair, "홍길동");
        System.out.println(age);

        ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
        Integer childAge = Util3.getValue(childPair, "홍삼순");
        System.out.println(childAge);

        // OtherPair은 Pair1을 상속하지 않아 예외 발생
//        OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
//        int otherAge = Util3.getValue(otherPair, "홍삼원");
//        System.out.println(otherAge);
    }

}
