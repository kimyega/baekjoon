package test31048;

import java.io.*;

public class LastFactorialDigit {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (caseNo-- > 0) {
      int total = 1;
      int n = Integer.parseInt(br.readLine());

      for (int i = 1; i <= n; i++) {
        total *= i;
        total %= 10;
      }

      sb.append(total + "\n");
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
