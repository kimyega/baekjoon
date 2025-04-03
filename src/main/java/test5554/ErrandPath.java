package test5554;

import java.io.*;
import java.time.LocalDateTime;

public class ErrandPath {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += Integer.parseInt(br.readLine());
        }
        LocalDateTime now = LocalDateTime.now().withHour(0).withMinute(0).withSecond(0);
        now = now.plusSeconds(sum);
        bw.write(now.getMinute() + "\n");
        bw.write(now.getSecond() + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
