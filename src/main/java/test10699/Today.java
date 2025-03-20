package test10699;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Today {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String today = sdf.format(date);
        System.out.println(today);
    }
}
