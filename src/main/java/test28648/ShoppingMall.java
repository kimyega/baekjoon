package test28648;

import java.io.*;
import java.util.StringTokenizer;

public class ShoppingMall {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st;
    int min = Integer.MAX_VALUE;

    int caseNo = Integer.parseInt(br.readLine());

    while (caseNo-- > 0) {
      int sum = 0;
      st = new StringTokenizer(br.readLine());

      while (st.hasMoreTokens()) {
        int n = Integer.parseInt(st.nextToken());
        sum += n;
      }

      min = Math.min(sum, min);
    }

    bw.write(min + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
