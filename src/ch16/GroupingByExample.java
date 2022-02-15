package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<Student3> totalList = Arrays.asList(
                new Student3("홍길동", 10, Student3.Sex.MALE, Student3.City.Seoul),
                new Student3("김수애", 6, Student3.Sex.FEMALE, Student3.City.Pusan),
                new Student3("신용권", 10, Student3.Sex.MALE, Student3.City.Pusan),
                new Student3("박수미", 6, Student3.Sex.FEMALE, Student3.City.Seoul)
        );

        Map<Student3.Sex, List<Student3>> mapBySex = totalList.stream()
                .collect(Collectors.groupingBy(Student3::getSex));

        System.out.println("[남학생] ");
        mapBySex.get(Student3.Sex.MALE).stream()
                .forEach(s-> System.out.println(s.getName() + " "));

        System.out.println("\n[여학생] ");
        mapBySex.get(Student3.Sex.FEMALE).stream()
                .forEach(s-> System.out.println(s.getName() + " "));

        System.out.println();

        // 도시를 key 로 하여 String 타입의 사람이름을 List 컬렉션으로 담아서 Map 을 만듬
        // 기존에 Student 객체를 List 컬렉션에 담았지만, Collectors.mapping 메소드를 이용하여 List 컬렉션에 String 타입을 담고 List 형식을 담아서 만듬
        Map<Student3.City, List<String>> mapByCity = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student3::getCity,
                                Collectors.mapping(Student3::getName, Collectors.toList())
                        )
                );

        System.out.println("\n[서울] ");
        mapByCity.get(Student3.City.Seoul).stream().forEach(s-> System.out.println(s + " "));

        System.out.println("\n[부산] ");
        mapByCity.get(Student3.City.Pusan).stream().forEach(s-> System.out.println(s + " "));
    }
}
