package test23825;

import java.io.*;
import java.util.StringTokenizer;

public class SaSa {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int res = Math.min(m / 2, n / 2);

    bw.write(res + "");
    br.close();
    bw.flush();
    bw.close();
  }
}
