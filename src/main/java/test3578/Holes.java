package test3578;

import java.io.*;

public class Holes {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    String s = "";

    if (n == 0) {
      s += 1;
    } else if (n == 1) {
      s += 0;
    } else {
      s = (n % 2 == 0 ? "" : "4") + "8".repeat(n / 2);
    }

    bw.write(s);

    bw.flush();
    bw.close();
    br.close();
  }
}
