package test23795;

import java.io.*;

public class FunOnlyCasino {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int sum = 0;

    while (true) {
      int n = Integer.parseInt(br.readLine());
      if (n == -1) break;
      sum += n;
    }

    bw.write(sum + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}
