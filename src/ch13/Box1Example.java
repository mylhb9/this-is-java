package ch13;

public class Box1Example {
    public static void main(String[] args) {
        Box1<String> box1 = new Box1<String>();
        box1.set("hello");
        String str = box1.get();

        Box1<Integer> box2 = new Box1<Integer>();
        box2.set(6);
        int value = box2.get();
    }
}
