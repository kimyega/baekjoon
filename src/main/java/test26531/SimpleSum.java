package test26531;

import java.io.*;
import java.util.StringTokenizer;

public class SimpleSum {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int count = 0, sum = 0, c = 0;

    while (st.hasMoreTokens()) {
      count++;

      if (count == 1 || count == 3) {
        sum += Integer.parseInt(st.nextToken());
      } else if (count == 5) {
        c = Integer.parseInt(st.nextToken());
      } else {
        st.nextToken();
      }
    }

    if (sum == c) {
      bw.write("YES");
    } else {
      bw.write("NO");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
