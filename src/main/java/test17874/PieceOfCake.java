package test17874;

import java.io.*;
import java.util.StringTokenizer;

public class PieceOfCake {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());
    int v = Integer.parseInt(st.nextToken());

    int res = Math.max(n - h, h) * Math.max(n - v, v) * 4;
    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
