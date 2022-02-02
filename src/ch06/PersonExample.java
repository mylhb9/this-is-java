package ch06;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);


        // final 필드는 값 수정이 불가능함
        p1.name = "을지문덕";
    }
}
