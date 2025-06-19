package test15340;

import java.io.*;
import java.util.StringTokenizer;

public class SimCard {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    while (true) {
      st = new StringTokenizer(br.readLine());
      int c = Integer.parseInt(st.nextToken());
      int d = Integer.parseInt(st.nextToken());
      if (c == 0 && d == 0) break;

      sb.append(calculateMinCost(c, d)).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }

  static int calculateMinCost(int c, int d) {
    int tel = c * 30 + d * 40;
    int cell = c * 35 + d * 30;
    int phone = c * 40 + d * 20;

    return Math.min(tel, Math.min(cell, phone));
  }
}
