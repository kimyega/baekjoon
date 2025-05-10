package test10250;

import java.io.*;
import java.util.StringTokenizer;

public class ACMHotel {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());

      int h = Integer.parseInt(st.nextToken());
      int w = Integer.parseInt(st.nextToken());
      int n = Integer.parseInt(st.nextToken());

      sb.append(String.format("%d%02d\n", n % h == 0 ? h : n % h, n % h == 0 ? n / h : n / h + 1));
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
