package test17903;

import java.io.*;
import java.util.StringTokenizer;

public class CountingClauses {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());

    for (int i = 0; i < m; i++) {
      StringTokenizer st1 = new StringTokenizer(br.readLine());
      while (st1.hasMoreTokens()) {
        int a = Integer.parseInt(st1.nextToken());
      }
    }

    if (m < 8) {
      bw.write("unsatisfactory");
    } else {
      bw.write("satisfactory");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
