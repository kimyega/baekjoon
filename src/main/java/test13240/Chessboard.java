package test13240;

import java.io.*;
import java.util.StringTokenizer;

public class Chessboard {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      for (int j = (i % 2 == 0 ? 2 : 1); j <= (i % 2 == 0 ? m + 1 : m); j++) {
        sb.append(j % 2 == 0 ? "." : "*");
      }
      sb.append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
