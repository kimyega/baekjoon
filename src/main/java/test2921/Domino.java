package test2921;

import java.io.*;

public class Domino {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int sum = 0;

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= i; j++) {
        sum += i + j;
      }
    }

    bw.write(sum + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
