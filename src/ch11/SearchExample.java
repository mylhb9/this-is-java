package ch11;

import java.util.Arrays;

public class SearchExample {
    public static void main(String[] args) {
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);
        int index = Arrays.binarySearch(scores, 99);
        System.out.println("찾은 인덱스: " + index);

        String[] names = {"홍길동", "박동수", "김민수"};
        Arrays.sort(names);
        index = Arrays.binarySearch(names, "홍길동");
        System.out.println("찾은 인덱스: " + index);

        Member3 m1 = new Member3("홍길동");
        Member3 m2 = new Member3("박동수");
        Member3 m3 = new Member3("김민수");
        Member3[] members = {m1, m2, m3};
        Arrays.sort(members);
        index = Arrays.binarySearch(members, m1);
        System.out.println("찾은 인덱스: " + index);

    }
}
