package test27855;

import java.io.*;
import java.util.StringTokenizer;

public class Cornhole {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int h1 = Integer.parseInt(st.nextToken());
    int b1 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int h2 = Integer.parseInt(st.nextToken());
    int b2 = Integer.parseInt(st.nextToken());

    int sc1 = h1 * 3 + b1;
    int sc2 = h2 * 3 + b2;

    int abs = Math.abs(sc1 - sc2);
    String res = sc1 == sc2 ? "NO SCORE" : sc1 > sc2 ? "1 " + abs: "2 " + abs;
    bw.write(res);

    bw.flush();
    bw.close();
    br.close();
  }
}
