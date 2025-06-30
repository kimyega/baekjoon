package test6162;

import java.io.*;
import java.util.StringTokenizer;

public class Superlatives {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int caseNo = Integer.parseInt(br.readLine());

    for (int i = 1; i <= caseNo; i++) {
      st = new StringTokenizer(br.readLine());
      int e = Integer.parseInt(st.nextToken());
      int a = Integer.parseInt(st.nextToken());

      sb.append("Data Set ").append(i).append(":\n");
      sb.append(droughtStatus(e, a)).append("\n");

      if (i != caseNo) sb.append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }

  static String droughtStatus (int e, int a) {
    StringBuilder sb = new StringBuilder();

    if (e <= a) return "no drought";
    double status = (double) e / a;

    for (int i = 1; ; i++) {
      double pow = Math.pow(5, i);

      if (status <= pow) {
        sb.append("drought");
        break;
      } else {
        sb.append("mega ");
      }
    }

    return sb.toString();
  }
}
