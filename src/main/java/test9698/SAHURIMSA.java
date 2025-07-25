package test9698;

import java.io.*;
import java.util.StringTokenizer;

public class SAHURIMSA {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int caseNo = Integer.parseInt(br.readLine());


    for (int i = 1; i <= caseNo; i++) {
      st = new StringTokenizer(br.readLine());
      int h = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      int tm = h * 60 + m - 45;
      if (tm < 0) tm += 24 * 60;

      int hour = tm / 60;
      int min = tm % 60;

      sb.append("Case #").append(i).append(": ").append(hour).append(" ").append(min).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
