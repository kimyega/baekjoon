package test12840;

import java.io.*;
import java.util.StringTokenizer;

public class ChangyongClock {

  static class Clock {
    int hour, minute, second, totalSeconds;

    public Clock(int hour, int minute, int second) {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
      this.totalSeconds = hour * 3600 + minute * 60 + second;
    }

    public void updateClock (int t, int updateSeconds) {
      totalSeconds += (t == 1 ? updateSeconds : -updateSeconds);
      totalSeconds = (totalSeconds % 86400 + 86400) % 86400;

      hour = totalSeconds / 3600;
      minute = totalSeconds % 3600 / 60;
      second = totalSeconds % 60;
    }

    public String currentClock() {
      return hour + " " + minute + " " + second;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int hour = Integer.parseInt(st.nextToken());
    int minute = Integer.parseInt(st.nextToken());
    int second = Integer.parseInt(st.nextToken());

    Clock clock = new Clock(hour, minute, second);

    int q = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (q-- > 0) {
      st = new StringTokenizer(br.readLine());

      if (st.countTokens() != 1) {
        int t = Integer.parseInt(st.nextToken());
        int updateSeconds = Integer.parseInt(st.nextToken());
        clock.updateClock(t, updateSeconds);
      } else {
        st.nextToken();
        sb.append(clock.currentClock()).append("\n");
      }
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
