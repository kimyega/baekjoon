package test28061;

import java.io.*;
import java.util.StringTokenizer;

public class LemonHarvestor {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());

    int max = 0;

    for (int i = 1; i <= n; i++) {
      int l = Integer.parseInt(st.nextToken());
      int lc = l - (n - i + 1);

      max = Math.max(max, lc);
    }

    bw.write(max + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
