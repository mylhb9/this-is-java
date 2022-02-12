package ch13;

public class Container1<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }
}
