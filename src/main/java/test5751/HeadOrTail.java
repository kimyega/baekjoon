package test5751;

import java.io.*;
import java.util.StringTokenizer;

public class HeadOrTail {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    while (true) {
      int marry = 0, john = 0;
      int n = Integer.parseInt(br.readLine());
      if (n == 0) break;

      st = new StringTokenizer(br.readLine());
      while (st.hasMoreTokens()) {
        int x = Integer.parseInt(st.nextToken());
        if (x == 0) marry++;
        else john++;
      }

      sb.append("Mary won " + marry + " times and John won " + john + " times\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
