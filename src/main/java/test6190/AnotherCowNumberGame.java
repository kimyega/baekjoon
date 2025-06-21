package test6190;

import java.io.*;

public class AnotherCowNumberGame {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long n = Long.parseLong(br.readLine());
    long score = 0;

    while (n != 1) {
      if ((n & 1) == 0) n /= 2;
      else n = 3 * n + 1;
      score++;
    }

    bw.write(score + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
