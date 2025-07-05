package test20359;

import java.io.*;

public class ASimpleTask {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    bw.write(findOdd(n) + " " + cnt);

    bw.flush();
    bw.close();
    br.close();
  }

  static int cnt = 0;

  static int findOdd (int n) {
    while (n % 2 == 0) {
      n /= 2;
      cnt++;
    }
    return n;
  }
}
