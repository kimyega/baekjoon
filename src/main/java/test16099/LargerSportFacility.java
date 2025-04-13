package test16099;

import java.io.*;
import java.util.StringTokenizer;

public class LargerSportFacility {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < caseNo; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int lt = Integer.parseInt(st.nextToken());
      int wt = Integer.parseInt(st.nextToken());
      int le = Integer.parseInt(st.nextToken());
      int we = Integer.parseInt(st.nextToken());

      long areaT = (long) lt * wt;
      long areaE = (long) le * we;

      if (areaT < areaE) {
        sb.append("Eurecom\n");
      } else if (areaT > areaE) {
        sb.append("TelecomParisTech\n");
      } else {
        sb.append("Tie\n");
      }
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
