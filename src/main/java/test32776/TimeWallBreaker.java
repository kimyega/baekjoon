package test32776;

import java.io.*;
import java.util.StringTokenizer;

public class TimeWallBreaker {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int flight = 0;
    int rail = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    while (st.hasMoreTokens()) {
      flight += Integer.parseInt(st.nextToken());
    }

    String s = rail < flight ? "high speed rail" : "flight";
    bw.write(s);

    bw.flush();
    bw.close();
    br.close();
  }
}
