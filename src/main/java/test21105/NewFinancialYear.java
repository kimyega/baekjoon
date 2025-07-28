package test21105;

import java.io.*;
import java.util.StringTokenizer;

public class NewFinancialYear {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int caseNo = Integer.parseInt(br.readLine());



    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());
      double p = Double.parseDouble(st.nextToken());
      double c = Double.parseDouble(st.nextToken());

      double o = p / (c / 100 + 1);
      sb.append(o + "\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
