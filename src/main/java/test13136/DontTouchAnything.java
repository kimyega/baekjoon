package test13136;

import java.io.*;
import java.util.StringTokenizer;

public class DontTouchAnything {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int r = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());

    int rn = r % n == 0 ? r / n : r / n + 1;
    int cn = c % n == 0 ? c / n : c / n + 1;
    long res = (long) rn * cn;
    bw.write(res + "");

    br.close();
    bw.flush();
    bw.close();
  }
}
