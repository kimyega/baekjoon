package test16625;

import java.io.*;
import java.util.StringTokenizer;

public class DasBlinkenlights {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int p = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());
    int s = Integer.parseInt(st.nextToken());

    int t = lcm(p, q);

    bw.write(t <= s ? "yes" : "no");

    bw.flush();
    bw.close();
    br.close();
  }

  // 최대공약수
  public static int gcd(int a, int b) {
    while (b != 0) {
      int tmp = b;
      b = a % b;
      a = tmp;
    }
    return a;
  }

  // 최소공배수
  public static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }
}
