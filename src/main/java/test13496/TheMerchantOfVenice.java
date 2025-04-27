package test13496;

import java.io.*;
import java.util.StringTokenizer;

public class TheMerchantOfVenice {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < caseNo; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int speed = Integer.parseInt(st.nextToken());
      int day = Integer.parseInt(st.nextToken());
      int totalPrice = 0;

      sb.append("Data Set " + (i + 1) + ":\n");

      while (n-- > 0) {
        StringTokenizer stShip = new StringTokenizer(br.readLine());
        int di = Integer.parseInt(stShip.nextToken());
        int vi = Integer.parseInt(stShip.nextToken());
        int arrDay = di % speed == 0 ? di / speed : di / speed + 1;

        if (arrDay <= day) {
          totalPrice += vi;
        }
      }

      sb.append(totalPrice + "\n\n");
    }

    sb.delete(sb.length() - 2, sb.length());
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
