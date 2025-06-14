package test9493;

import java.io.*;
import java.util.StringTokenizer;

public class TrainIsFast {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    StringBuilder sb = new StringBuilder();

    while (true) {
      st = new StringTokenizer(br.readLine());
      double m = Double.parseDouble(st.nextToken());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      if (m == 0 && a == 0 && b == 0) break;

      double at = m / a;
      double bt = m / b;
      double dft = at - bt;

      int totalSeconds = (int) Math.round(dft * 3600);
      int hours = totalSeconds / 3600;
      int minutes = (totalSeconds % 3600) / 60;
      int seconds = totalSeconds % 60;

      sb.append(String.format("%d:%02d:%02d\n", hours, minutes, seconds));
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
