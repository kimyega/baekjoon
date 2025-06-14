package test10180;

import java.io.*;
import java.util.StringTokenizer;

public class ShipSelection {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (caseNo-- > 0) {
      int cnt = 0;

      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int d = Integer.parseInt(st.nextToken());

      while (n-- > 0) {
        st = new StringTokenizer(br.readLine());
        double vi = Double.parseDouble(st.nextToken());
        double fi = Double.parseDouble(st.nextToken());
        double ci = Double.parseDouble(st.nextToken());

        if (fi / ci * vi >= d) cnt++;
      }

      sb.append(cnt).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
