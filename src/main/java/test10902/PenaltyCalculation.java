package test10902;

import java.io.*;
import java.util.StringTokenizer;

public class PenaltyCalculation {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int max = Integer.MIN_VALUE, p = 0;

    int n = Integer.parseInt(br.readLine().trim());

    for (int i = 1; i <= n; i++) {
      st = new StringTokenizer(br.readLine().trim());
      int t = Integer.parseInt(st.nextToken());
      int s = Integer.parseInt(st.nextToken());

      if (s > max) {
        max = s;
        p = s == 0 ? 0 : t + (i - 1) * 20;
      }
    }

    bw.write(p + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
