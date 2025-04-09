package test5928;

import java.io.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

public class ContestTiming {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long totalMinutes = 0;
    int endDay = Integer.parseInt(st.nextToken());
    int endHour = Integer.parseInt(st.nextToken());
    int endMinute = Integer.parseInt(st.nextToken());

    LocalDateTime startTime = LocalDateTime.of(2011, 11, 11, 11,11);
    LocalDateTime endTime = LocalDateTime.of(2011, 11, endDay, endHour,endMinute);
    Duration duration = Duration.between(startTime, endTime);
    long btwMinutes = duration.toMinutes();

    if(btwMinutes < 0) {
      totalMinutes = -1;
    } else {
      totalMinutes = btwMinutes;
    }

    bw.write(totalMinutes + "");
    bw.flush();
    bw.close();
    br.close();
  }
}
