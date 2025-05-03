package test32941;

import java.io.*;
import java.util.StringTokenizer;

public class RudeScheduler {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int count = 0;

    st = new StringTokenizer(br.readLine());
    int t = Integer.parseInt(st.nextToken());
    int x = Integer.parseInt(st.nextToken());

    int caseNo = Integer.parseInt(br.readLine());
    int num = caseNo;

    while (num-- > 0) {
      int n = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());

      while (st.hasMoreTokens()) {
        if (st.nextToken().equals(x + "")) {
          count++;
          break;
        }
      }
    }

    String isAtt = count == caseNo ? "YES" : "NO";
    bw.write(isAtt);

    bw.flush();
    bw.close();
    br.close();
  }
}
