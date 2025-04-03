package test2530;

import java.io.*;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

public class AIClock {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        LocalDateTime now = LocalDateTime.now().withHour(hour).withMinute(minute).withSecond(second);
        int addSeconds = Integer.parseInt(br.readLine());
        now = now.plusSeconds(addSeconds);

        bw.write(now.getHour() + " " + now.getMinute() + " " + now.getSecond());
        br.close();
        bw.flush();
        bw.close();
    }
}
