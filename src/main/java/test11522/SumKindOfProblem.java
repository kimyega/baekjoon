package test11522;

import java.io.*;
import java.util.StringTokenizer;

public class SumKindOfProblem {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int caseNo = Integer.parseInt(br.readLine());

    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());
      int k = Integer.parseInt(st.nextToken());
      int n = Integer.parseInt(st.nextToken());

      int s1 = n * (n + 1) / 2;
      int s2 = n * n;
      int s3 = n * (n + 1);

      sb.append(k + " " + s1 + " " + s2 + " " + s3 + "\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
