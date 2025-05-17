package test17614;

import java.io.*;

public class ThreeSixNineGame {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int count = 0;

    for (int i = 1; i <= n; i++) {
      int num = i;

      while (num > 0) {
        int digit = num % 10;

        if (digit == 3 || digit == 6 || digit == 9) {
          count++;
        }
        num /= 10;
      }
    }

    bw.write(count + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
