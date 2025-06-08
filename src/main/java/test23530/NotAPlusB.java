package test23530;

import java.io.*;
import java.util.StringTokenizer;

public class NotAPlusB {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      int c = random(a + b);

      sb.append(c + "\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }

  static int random (int n) {
    int r = (int) (Math.random() * 50) + 1;
    if (r != n)  return r;
    return random(n);
  }
}
