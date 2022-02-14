package ch16;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student1> studentList = Arrays.asList(
                new Student1("홍길동", 92),
                new Student1("신용권", 95),
                new Student1("김자바", 88)
        );

        int sum1 = studentList.stream()
                .mapToInt(Student1::getScore)
                .sum();

        int sum2 = studentList.stream()
                .map(Student1::getScore)
                .reduce((a, b) -> a+b)
                .get();

        int sum3 = studentList.stream()
                .map(Student1::getScore)
                .reduce(0, (a, b) -> a+b);

        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        System.out.println("sum3: " + sum3);

    }
}
