package test25628;

import java.io.*;
import java.util.StringTokenizer;

public class BurgerMaker {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int res = Math.min(a / 2, b);
    bw.write(res + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
