package ch03;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "버민";
        String strVar2 = "버민";
        String strVar3 = new String("버민");

        System.out.println(strVar1 == strVar2);
        System.out.println(strVar1 == strVar3);
        System.out.println();
        System.out.println(strVar1.equals(strVar2));
        System.out.println(strVar1.equals(strVar3));
    }
}
