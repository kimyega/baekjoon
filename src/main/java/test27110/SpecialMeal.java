package test27110;

import java.io.*;
import java.util.StringTokenizer;

public class SpecialMeal {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int res = 0;
    while (st.hasMoreTokens()) {
      res += Math.min(n, Integer.parseInt(st.nextToken()));
    }
    bw.write(res + "");

    br.close();
    bw.flush();
    bw.close();
  }
}
