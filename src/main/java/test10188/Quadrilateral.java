package test10188;

import java.io.*;
import java.util.StringTokenizer;

public class Quadrilateral {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    String xStr = "X";

    while (caseNo-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      String line = xStr.repeat(a) + "\n";
      sb.append(line.repeat(b) + "\n");
    }

    sb.delete(sb.length() - 2, sb.length());
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
