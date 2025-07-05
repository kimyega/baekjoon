package test5365;

import java.io.*;
import java.util.StringTokenizer;

public class Decoder {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());

    StringBuilder sb = new StringBuilder();
    int preLen = 1;

    while (st.hasMoreTokens()) {
      String s = st.nextToken();
      int len = s.length();

      if (len < preLen) sb.append(" ");
      else sb.append(s.charAt(preLen - 1));

      preLen = len;
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
