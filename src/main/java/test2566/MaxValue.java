package test2566;

import java.io.*;
import java.util.StringTokenizer;

public class MaxValue {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int y = 1, count = 9, max = -1;
    String pos = "";
    StringTokenizer st;

    while (count-- > 0) {
      int x = 1;
      st = new StringTokenizer(br.readLine());

      while (st.hasMoreTokens()) {
        int n = Integer.parseInt(st.nextToken());

        if (n > max) {
          max = n;
          pos = y + " " + x;
        }

        x++;
      }

      y++;
    }

    bw.write(max + "\n" + pos);

    bw.flush();
    bw.close();
    br.close();
  }
}
