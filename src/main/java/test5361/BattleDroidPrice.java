package test5361;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class BattleDroidPrice {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    double[] prices = {350.34, 230.90, 190.55, 125.30, 180.90};
    StringTokenizer st;
    int caseNo = Integer.parseInt(br.readLine());

    StringJoiner sj = new StringJoiner("\n");

    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());
      double sum = 0;
      int n = st.countTokens();

      for (int i = 0; i < n; i++) {
        int itemCnt = Integer.parseInt(st.nextToken());
        sum += itemCnt * prices[i];
      }
      sj.add(String.format("$%.2f", sum));
    }

    bw.write(sj.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
