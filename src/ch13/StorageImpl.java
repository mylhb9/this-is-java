package ch13;

public class StorageImpl<T> implements Storage<T>{
    private T[] array;

    @Override
    public void add(T item, int index) {
        array[index] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    public StorageImpl(int capacity) {
        this.array = (T[]) (new Object[capacity]);
    }
}
