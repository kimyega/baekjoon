package test10872;

import java.io.*;

public class Factorial {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int ft = 1;
    int n = Integer.parseInt(br.readLine());

    for (int i = 1; i <= n; i++) {
      ft *= i;
    }

    bw.write(ft + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
