package ch18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableReader {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("/Users/beomin/Desktop/this-is-java/src/ch18/Temp/Object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ClassA v = (ClassA) ois.readObject();
        System.out.println("field1: " + v.field1);
        System.out.println("field2.field1: " + v.field2.field1);
        System.out.println("field3: " + ClassA.field3);
        System.out.println("field4: " + v.field4);
    }
}
