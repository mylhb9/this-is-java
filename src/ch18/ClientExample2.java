package ch18;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample2 {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 5001);
        OutputStream os = socket.getOutputStream();

        String filePath = "/Users/beomin/Desktop/this-is-java/src/ch18/house.jpg";
        File file = new File(filePath);

        String fileName = file.getName();
        byte[] bytes = new byte[100];
        bytes = fileName.getBytes("UTF-8");
        os.write(bytes);

        System.out.println("[파일 보내기 시작] " + fileName);
        int readNo;
        FileInputStream fis = new FileInputStream(file);
        while((readNo = fis.read(bytes)) != -1) {
            os.write(bytes, 0, readNo);
        }
        os.flush();
        System.out.println("[파일 보내기 완료]");

        fis.close();
        os.close();
        socket.close();
    }
}
