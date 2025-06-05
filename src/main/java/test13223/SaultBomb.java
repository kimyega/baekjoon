package test13223;

import java.io.*;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SaultBomb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nowStr = br.readLine();
        String startStr = br.readLine();

        LocalTime now = LocalTime.parse(nowStr, DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime start = LocalTime.parse(startStr, DateTimeFormatter.ofPattern("HH:mm:ss"));

        Duration diff = Duration.between(now, start);

        if (diff.isZero()) {
            bw.write("24:00:00");
        } else {
            if (diff.isNegative()) {
                diff = diff.plusHours(24);
            }

            long seconds = diff.getSeconds();
            long h = seconds / 3600;
            long m = (seconds % 3600) / 60;
            long s = seconds % 60;

            bw.write(String.format("%02d:%02d:%02d", h, m, s));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
