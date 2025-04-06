package test13886;

import java.io.*;
import java.util.StringTokenizer;

public class TeamDivider {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sum = 0, index = 0, max = 0, min = 0;
    while (st.hasMoreTokens()) {
      int n = Integer.parseInt(st.nextToken());
      sum += n;
      if (index == 0) {
        max = n;
        min = n;
      } else {
        max = Math.max(max, n);
        min = Math.min(min, n);
      }
      index++;
    }
    int result = Math.abs(sum - 2 * (max + min));
    bw.write(result + "");
    br.close();
    bw.flush();
    bw.close();
  }
}
