package test33990;

import java.io.*;
import java.util.StringTokenizer;

public class ThreeVs512 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());

    int res = -1;

    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      int bp = Integer.parseInt(st.nextToken());
      int sq = Integer.parseInt(st.nextToken());
      int dl = Integer.parseInt(st.nextToken());

      int rm = bp + sq + dl;

      if (rm >= 512) {
        if (res == -1) res = rm;
        else res = Math.min(rm, res);
      }
    }

    bw.write(res + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
