package test13163;

import java.io.*;
import java.util.StringTokenizer;

public class Godifier {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      st.nextToken();
      sb.append("god");

      while (st.hasMoreTokens()) {
        sb.append(st.nextToken());
      }

      sb.append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
