package test28453;

import java.io.*;
import java.util.StringTokenizer;

public class PreviousLevel {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    while (st.hasMoreTokens()) {
      int m = Integer.parseInt(st.nextToken());

      if (m < 250) {
        sb.append(4 + " ");
      } else if (m < 275) {
        sb.append(3 + " ");
      } else if (m < 300) {
        sb.append(2 + " ");
      } else if (m == 300) {
        sb.append(1 + " ");
      }
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
