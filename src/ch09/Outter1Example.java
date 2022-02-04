package ch09;

public class Outter1Example {
    public static void main(String[] args) {
        Outter1 outter = new Outter1();
        Outter1.Nested nested = outter.new Nested();
        nested.print();
    }
}
