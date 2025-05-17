package test4504;

import java.io.*;
import java.util.StringJoiner;

public class MultipleFinder {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    StringJoiner sj = new StringJoiner("\n");

    while (true) {
      int a = Integer.parseInt(br.readLine());
      if (a == 0) break;

      String not = a % n != 0 ? "NOT " : "";

      sj.add(a + " is " + not + "a multiple of " + n + ".");
    }

    bw.write(sj.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
