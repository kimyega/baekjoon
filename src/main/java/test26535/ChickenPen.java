package test26535;

import java.io.*;

public class ChickenPen {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    int sq = (int) Math.ceil(Math.sqrt(N));

    String x = "x";
    String dot = ".";

    String edge = x.repeat(sq + 2) + "\n";
    String inner = x + dot.repeat(sq) + x + "\n";

    StringBuilder sb = new StringBuilder();

    sb.append(edge).append(inner.repeat(sq)).append(edge);


    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
