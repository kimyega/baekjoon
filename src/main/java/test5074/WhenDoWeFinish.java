package test5074;

import java.io.*;
import java.util.StringTokenizer;

public class WhenDoWeFinish {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st1;
    StringTokenizer st2;
    StringBuilder sb = new StringBuilder();

    while (true) {
      String line = br.readLine();
      if (line.equals("00:00 00:00")) break;

      st1 = new StringTokenizer(line);
      int totalMinutes = 0;

      while (st1.hasMoreTokens()) {
        String time = st1.nextToken();
        st2 = new StringTokenizer(time, ":");
        int hour = Integer.parseInt(st2.nextToken());
        int minute = Integer.parseInt(st2.nextToken());

        totalMinutes += hour * 60 + minute;
      }

      int minutes = totalMinutes % 60;
      int hours = totalMinutes / 60 % 24;
      int day = totalMinutes / 60 / 24;

      sb.append(String.format("%02d:%02d", hours, minutes)).append(day == 0 ? "" : " +" + day).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
