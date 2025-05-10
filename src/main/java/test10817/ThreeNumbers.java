package test10817;

import java.io.*;
import java.util.StringTokenizer;

public class ThreeNumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int first = 0, second = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());

    while (st.hasMoreTokens()) {
      int n = Integer.parseInt(st.nextToken());

      if (n > first) {
        second = first;
        first = n;
      } else if (n > second) {
        second = n;
      }

    }

    bw.write(second + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
