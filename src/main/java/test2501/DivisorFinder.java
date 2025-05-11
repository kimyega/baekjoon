package test2501;

import java.io.*;
import java.util.StringTokenizer;

public class DivisorFinder {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int idx = 0, div = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        idx++;

        if (idx == k) {
          div = i;
          break;
        }
      }
    }

    bw.write(div + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
