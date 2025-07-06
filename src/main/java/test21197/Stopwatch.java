package test21197;

import java.io.*;

public class Stopwatch {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    if (n % 2 != 0) {
      while (n-- > 0) {
        String s = br.readLine();
      }
      sb.append("still running");
    } else {
      int sec = 0;

      while (n > 0) {
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        sec += end - start;
        n -= 2;
      }

      sb.append(sec);
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
