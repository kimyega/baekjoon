package test23804;

import java.io.*;

public class AtSymbolDPrinter {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String at = "@";

    int n = Integer.parseInt(br.readLine());

    String edgeLine = at.repeat(n * 5) + "\n";
    String edge = edgeLine.repeat(n);
    String midLine = at.repeat(n) + "\n";
    String mid = midLine.repeat(n * 3);

    StringBuilder sb = new StringBuilder();

    sb.append(edge).append(mid).append(edge);

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
