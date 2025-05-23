package test31281;

import java.io.*;
import java.util.StringTokenizer;

public class GoldenMiddle {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    long sum = 0, max = Long.MIN_VALUE, min = Long.MAX_VALUE;

    StringTokenizer st = new StringTokenizer(br.readLine());

    while (st.hasMoreTokens()) {
      long n = Long.parseLong(st.nextToken());

      sum += n;
      max = Math.max(max, n);
      min = Math.min(min, n);
    }

    long middle = sum - (max + min);
    bw.write(middle + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
