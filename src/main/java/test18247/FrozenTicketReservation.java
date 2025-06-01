package test18247;

import java.io.*;
import java.util.StringTokenizer;

public class FrozenTicketReservation {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int caseNo = Integer.parseInt(br.readLine());

    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      if (n < 12 || m < 4) {
        sb.append(-1);
      } else {
        sb.append(11 * m + 4);
      }
      sb.append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
