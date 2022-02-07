package ch11;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regExp = "[a-zA-z][a-zA-Z_0-9]{7,11}";
        boolean isMatch = Pattern.matches(regExp, id);
        if(isMatch) {
            System.out.println("ID로 사용할 수 있습니다");
        } else {
            System.out.println("ID로 사용할 수 없습니다");
        }
        // 첫 번째는 알파벳으로 시작 / 두번째부터 숫자와 알파벳으로 구성/ 8~12자 사이 / 대소문자 모두 허용
    }
}
