package test6438;

import java.io.*;

public class ReverseText {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int caseNo = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    while (caseNo-- > 0) {
      String line = br.readLine();
      String reversed = new StringBuilder(line).reverse().toString();

      sb.append(reversed).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
