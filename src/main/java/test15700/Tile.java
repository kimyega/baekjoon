package test15700;

import java.io.*;
import java.util.StringTokenizer;

public class Tile {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long n = Long.parseLong(st.nextToken());
    long m = Long.parseLong(st.nextToken());
    long res = n * m / 2;
    bw.write(res + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}
