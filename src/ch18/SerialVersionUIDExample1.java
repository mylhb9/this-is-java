package ch18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample1 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("/Users/beomin/Desktop/this-is-java/src/ch18/Temp/Object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ClassC classC = new ClassC();
        classC.field1 = 1;
        oos.writeObject(classC);
        oos.flush();
        oos.close();
        fos.close();
    }
}
