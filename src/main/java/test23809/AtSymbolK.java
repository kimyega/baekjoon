package test23809;

import java.io.*;

public class AtSymbolK {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String at = "@";
    String bl = " ";

    int n = Integer.parseInt(br.readLine());

    String edgeLine = at.repeat(n) + bl.repeat(3 * n) + at.repeat(n) + "\n";
    String edge = edgeLine.repeat(n);

    String midEdgeLine = at.repeat(n) + bl.repeat(2 * n) + at.repeat(n) + "\n";
    String midEdge = midEdgeLine.repeat(n);

    String midLine = at.repeat(3 * n) + "\n";
    String mid = midLine.repeat(n);

    StringBuilder sb = new StringBuilder();

    sb.append(edge).append(midEdge).append(mid).append(midEdge).append(edge);

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
