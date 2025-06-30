package test11176;

import java.io.*;
import java.util.StringTokenizer;

public class InTheShower {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int caseNo = Integer.parseInt(br.readLine());

    while (caseNo-- > 0) {
      int cnt = 0;
      st = new StringTokenizer(br.readLine());
      int e = Integer.parseInt(st.nextToken());
      int n = Integer.parseInt(st.nextToken());

      while (n-- > 0) {
        int atp = Integer.parseInt(br.readLine());
        if (atp > e) cnt++;
      }

      sb.append(cnt + "\n");
    }

    bw.write(sb.toString().trim());
    bw.flush();
    bw.close();
    br.close();
  }
}
