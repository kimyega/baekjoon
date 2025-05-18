package test4892;

import java.io.*;

public class GuessGame {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();
    int caseN0 = 0;

    while (true) {
      caseN0++;
      int n0 = Integer.parseInt(br.readLine());
      if (n0 == 0) break;

      boolean isEven = n0 % 2 == 0;
      int n4 = isEven ? n0 / 2 : (n0 - 1) / 2;

      sb.append(caseN0 + ". ").append(isEven ? "even" : "odd").append(" " + n4 +"\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
