package test10786;

import java.io.*;
import java.time.LocalDate;

public class SpecialDay {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        LocalDate special = LocalDate.of(2015, 2, 18);
        LocalDate now = LocalDate.of(2015, month, day);
        String isSpecial = now.isAfter(special) ? "After" : now.isBefore(special) ? "Before" : "Special";
        bw.write(isSpecial);
        br.close();
        bw.flush();
        bw.close();
    }
}
