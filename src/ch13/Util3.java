package ch13;

public class Util3 {
    public static <T extends Pair1<K, V>, K, V> V getValue(T t, K k) {
        if(t.getKey().equals(k)) {
            return t.getValue();
        } else {
            return null;
        }
    }
}
