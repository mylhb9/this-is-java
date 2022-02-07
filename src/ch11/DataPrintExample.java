package ch11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DataPrintExample {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분", Locale.KOREA);
        System.out.println(sdf.format(now));

    }
}
