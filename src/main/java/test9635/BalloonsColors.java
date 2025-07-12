package test9635;

import java.io.*;
import java.util.StringTokenizer;

public class BalloonsColors {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int caseNo = Integer.parseInt(br.readLine());

    while (caseNo-- > 0) {
      boolean isEasy = false, isHard = false;
      int first = 0, end = 0;
      st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      st = new StringTokenizer(br.readLine());

      for (int i = 1; i <= n; i++) {
        int color = Integer.parseInt(st.nextToken());
        if (i == 1) first = color;
        if (i == n) end = color;
      }

      if (first == x) isEasy = true;
      if (end == y) isHard = true;

      sb.append(isEasy && isHard ? "BOTH" : isEasy ? "EASY" : isHard ? "HARD" : "OKAY").append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
