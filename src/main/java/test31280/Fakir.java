package test31280;

import java.io.*;
import java.util.StringTokenizer;

public class Fakir {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int sum = 0, min = Integer.MAX_VALUE;

    StringTokenizer st = new StringTokenizer(br.readLine());

    while (st.hasMoreTokens()) {
      int n = Integer.parseInt(st.nextToken());
      min = Math.min(min, n);
      sum += n;
    }

    int res = sum - min + 1;
    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
