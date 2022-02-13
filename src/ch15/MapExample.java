package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) {
            String pivot = iterator.next();
            if(maxScore < map.get(pivot)) {
                name = pivot;
                maxScore = map.get(pivot);
            }
            totalScore += map.get(pivot);
        }
        System.out.println("평균점수: " + totalScore / 3);
        System.out.println("최고점수: " + maxScore);
        System.out.println("최고점수를 받은 아이디: " + name);
    }
}
