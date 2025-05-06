package test29340;

import java.io.*;

public class Squad {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String aLine = br.readLine();
    String bLine = br.readLine();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < aLine.length(); i++) {
      int a = aLine.charAt(i) - '0';
      int b = bLine.charAt(i) - '0';

      sb.append(Math.max(a, b));
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
