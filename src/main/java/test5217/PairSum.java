package test5217;

import java.io.*;

public class PairSum {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (caseNo-- > 0) {
      int n = Integer.parseInt(br.readLine());
      int end = n % 2 == 0 ? n / 2 : n / 2 + 1;
      sb.append("Pairs for " + n + ": ");

      for (int i = 1; i < end; i++) {
        sb.append(i + " " + (n - i) + ", ");
      }

      if (end > 1) sb.delete(sb.length() - 2, sb.length());
      sb.append("\n");
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
