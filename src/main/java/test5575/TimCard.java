package test5575;

import java.io.*;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

public class TimCard {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int k = 0; k < 3; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int bfHour = Integer.parseInt(st.nextToken());
            int bfMin = Integer.parseInt(st.nextToken());
            int bfSec = Integer.parseInt(st.nextToken());
            int afHour = Integer.parseInt(st.nextToken());
            int afMin = Integer.parseInt(st.nextToken());
            int afSec = Integer.parseInt(st.nextToken());
            LocalDateTime bf = LocalDateTime.now().withHour(bfHour).withMinute(bfMin).withSecond(bfSec);
            LocalDateTime af = LocalDateTime.now().withHour(afHour).withMinute(afMin).withSecond(afSec);
            int workTime = bf.compareTo(af);

        }
    }
}
