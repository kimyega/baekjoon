package test2765;

import java.io.*;
import java.util.StringTokenizer;

public class BicycleSpeed {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    for (int i = 1; ; i++){
      st = new StringTokenizer(br.readLine());
      double dm = Double.parseDouble(st.nextToken());
      int ro = Integer.parseInt(st.nextToken());
      double tm = Double.parseDouble(st.nextToken());

      if (ro == 0) break;

      double dt = Math.PI * dm * ro / 63360;
      double asp = dt / (tm / 3600);

      sb.append(String.format("Trip #%d: %.2f %.2f\n", i, dt, asp));
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
