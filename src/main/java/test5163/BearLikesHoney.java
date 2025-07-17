package test5163;

import java.io.*;
import java.util.StringTokenizer;

public class BearLikesHoney {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    double pi = Math.PI;

    int caseNo = Integer.parseInt(br.readLine());

    for (int i = 1; i <= caseNo; i++) {
      double bws = 0;

      st = new StringTokenizer(br.readLine());
      int b = Integer.parseInt(st.nextToken());
      double w = Double.parseDouble(st.nextToken());

      while (b-- > 0) {
        double ri = Double.parseDouble(br.readLine());
        bws += 4 / 3.0 * pi * ri * ri * ri;
      }

      sb.append("Data Set ").append(i).append(":\n");
      sb.append((bws / 1000.0) > w ? "Yes" : "No").append("\n\n");
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
