package test2562;

import java.io.*;

public class MaxFinder {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int idx = 0, max = Integer.MIN_VALUE;

    for (int i = 1; i <= 9; i++) {
      int n = Integer.parseInt(br.readLine());

      if (n > max) {
        max = n;
        idx = i;
      }
    }

    bw.write(max + "\n" + idx);

    bw.flush();
    bw.close();
    br.close();
  }
}
