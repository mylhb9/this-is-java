package ch18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample2 {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localhost", 5001));

        System.out.println("[서버 시작]");

        while(true) {
            try {
                Socket socket = serverSocket.accept();

                InputStream is = socket.getInputStream();

                byte[] bytes = new byte[100];
                int readByteCount = -1;

                readByteCount = is.read(bytes);
                String fileName = new String(bytes, 0, readByteCount, "UTF-8");
                fileName = fileName.trim();

                System.out.println("[파일 받기 시작] " + fileName);
                FileOutputStream fos = new FileOutputStream("/Users/beomin/Desktop/this-is-java/src/ch18/house1.jpg");
                while((readByteCount = is.read(bytes)) != -1) {
                    fos.write(bytes, 0, readByteCount);
                }
                System.out.println("[파일 받기 완료]");

                fos.close();
                is.close();
                socket.close();
            } catch (Exception e) {
                break;
            }
            serverSocket.close();
            System.out.println("[서버 종료]");
        }
    }
}
