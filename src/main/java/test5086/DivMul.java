package test5086;

import java.io.*;
import java.util.StringTokenizer;

public class DivMul {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    StringBuilder sb = new StringBuilder();

    while (true) {
      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      if (n == 0 && m == 0) break;

      if (m % n == 0) {
        sb.append("factor");
      } else if (n % m == 0) {
        sb.append("multiple");
      } else {
        sb.append("neither");
      }

      sb.append("\n");
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
