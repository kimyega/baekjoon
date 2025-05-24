package test15667;

import java.io.*;

public class Yonsei2018Contest {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int start = (int) Math.sqrt(n);
    int k = 0;

    for (int i = start; i < n; i++) {
      if (i * i + i + 1 == n) {
        k = i;
        break;
      }
    }

    bw.write(k + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
