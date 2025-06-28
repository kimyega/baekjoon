package test9724;

import java.io.*;
import java.util.StringTokenizer;

public class PerfectCube {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    StringBuilder sb = new StringBuilder();

    int caseNo = Integer.parseInt(br.readLine());

    for (int i = 1; i <= caseNo; i++) {
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      int idx = 1, cnt = 0;
      while (true) {
        int cube = idx * idx * idx;

        if (cube >= start && cube <= end) cnt++;
        else if (cube > end) break;

        idx++;
      }

      sb.append("Case #" + i + ": ").append(cnt).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
