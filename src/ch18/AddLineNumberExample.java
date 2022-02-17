package ch18;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
    public static void main(String[] args) throws Exception{
        String filePath = "/Users/beomin/Desktop/this-is-java/src/ch18/AddLineNumberExample.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNum = 0;
        String rowData;
        while((rowData = br.readLine()) != null) {
            System.out.println(++rowNum + ":" + rowData);
        }
        br.close();
        fr.close();
    }
}
