package test24783;

import java.io.*;
import java.util.StringTokenizer;

public class NumberFun {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int caseNo = Integer.parseInt(br.readLine());

    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());
      double a = Double.parseDouble(st.nextToken());
      double b = Double.parseDouble(st.nextToken());
      double c = Double.parseDouble(st.nextToken());


      sb.append(isPossible(a, b, c) ? "Possible" : "Impossible").append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }

  static boolean isPossible(double a, double b, double c) {
    return a + b == c || a - b == c || a * b == c || a / b == c || b - a == c || b / a == c;
  }
}
