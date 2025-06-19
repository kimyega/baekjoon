package test14541;

import java.io.*;
import java.util.StringTokenizer;

public class SpeedLimit {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    while (true) {
      int pret = 0, sum = 0;
      int n = Integer.parseInt(br.readLine().trim());
      if (n == -1) break;

      while (n-- > 0) {
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        sum += s * (t - pret);
        pret = t;

      }

      sb.append(sum + " miles\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
