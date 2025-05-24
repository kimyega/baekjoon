package test14909;

import java.io.*;
import java.util.StringTokenizer;

public class PositiveCounter {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int cnt = 0;

    while (st.hasMoreTokens()) {
      int n = Integer.parseInt(st.nextToken());
      if (n > 0) cnt++;
    }

    bw.write(cnt + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
