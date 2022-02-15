package ch16;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream()
                .filter(e -> e.contains("java") || e.contains("Java"))
                .forEach(e -> System.out.println(e));
    }
}
