package test4909;

import java.io.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class JudgingOlympia {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    while (true) {
      int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
      st = new StringTokenizer(br.readLine());

      while (st.hasMoreTokens()) {
        int n = Integer.parseInt(st.nextToken());
        min = Math.min(min, n);
        max = Math.max(max, n);
        sum += n;
      }

      if (sum == 0) break;

      double res = (sum - min - max) / 4.0;
      DecimalFormat df = new DecimalFormat("#.#########");

      sb.append(df.format(res)).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
