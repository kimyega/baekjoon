package test32778;

import java.io.*;
import java.util.StringTokenizer;

public class GaheeAndAliasName {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();

    StringTokenizer st = new StringTokenizer(br.readLine(), "(");
    sb.append(st.nextToken().trim()).append("\n");

    if (st.countTokens() == 0) sb.append("-");
    else sb.append(st.nextToken().replaceAll("[)]", ""));

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
