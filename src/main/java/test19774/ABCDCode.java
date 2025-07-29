package test19774;

import java.io.*;

public class ABCDCode {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (caseNo-- > 0) {
      String nStr = br.readLine();
      int a = Integer.parseInt(nStr.substring(0, 2));
      int b = Integer.parseInt(nStr.substring(2));

      sb.append(isValid(a, b)).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }

  static String isValid(int a, int b) {
    return (a * a + b * b) % 7 == 1 ? "YES" : "NO";
  }
}
