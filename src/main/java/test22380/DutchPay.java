package test22380;

import java.io.*;
import java.util.StringTokenizer;

public class DutchPay {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    while (true) {
      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      if (n == 0 && m == 0) break;

      int pay = m / n;
      int total = 0;

      st = new StringTokenizer(br.readLine());
      while (st.hasMoreTokens()) {
        int money = Integer.parseInt(st.nextToken());

        if (money < pay) total += money;
        else total += pay;
      }

      sb.append(total + "\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
