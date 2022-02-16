package ch18;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) throws Exception{
        String originalFileName = "/Users/beomin/Desktop/this-is-java/src/ch18/house.jpg";
        String targetFileName = "/Users/beomin/Desktop/this-is-java/src/ch18/Temp/house.jpg";

        File file1 = new File(originalFileName);
        if(!file1.exists()) {
            file1.createNewFile();
        }
        File file2 = new File(targetFileName);
        if(!file2.exists()) {
            file1.createNewFile();
        }
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        int readByteNo;
        byte[] readBytes = new byte[100];
        while((readByteNo = fis.read(readBytes)) != -1) {
            fos.write(readBytes, 0, readByteNo);
        }

        fos.flush();
        fos.close();
        fis.close();

        System.out.println("복사가 잘 되었습니다.");
    }
}
