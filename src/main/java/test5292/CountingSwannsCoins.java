package test5292;

import java.io.*;
import java.util.StringJoiner;

public class CountingSwannsCoins {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine().trim());

    StringJoiner sjLine = new StringJoiner(" ");
    StringJoiner sjNextLine = new StringJoiner("\n");

    for (int i = 1; i <= n; i++) {
      String res = i % 3 == 0 && i % 5 == 0 ? "DeadMan" : i % 3 == 0 ? "Dead" : i % 5 == 0 ? "Man" : String.valueOf(i);

      sjLine.add(res);
      if (!res.matches("\\d+") || i == n) {
        sjNextLine.add(sjLine.toString());
        sjLine = new StringJoiner(" ");
      }
    }

    bw.write(sjNextLine.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
