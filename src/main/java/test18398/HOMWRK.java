package test18398;

import java.io.*;
import java.util.StringTokenizer;

public class HOMWRK {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < caseNo; i++) {
      int problemNo = Integer.parseInt(br.readLine());

      for (int j = 0; j < problemNo; j++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0, mult = 1;

        while (st.hasMoreTokens()) {
          int n = Integer.parseInt(st.nextToken());
          sum += n;
          mult *= n;
        }

        sb.append(sum + " " + mult + "\n");
      }
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
