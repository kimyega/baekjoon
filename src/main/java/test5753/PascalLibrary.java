package test5753;

import java.io.*;
import java.util.StringTokenizer;

public class PascalLibrary {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    while (true) {
      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int d = Integer.parseInt(st.nextToken());
      if (n == 0 && d == 0) break;


      int[] arr = new int[n];
      boolean flag = false;

      for (int i = 0; i < d; i++) {
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < n; j++) {
          arr[j] += Integer.parseInt(st.nextToken());
        }
      }

      for (int i = 0; i < n; i++) {
        if (arr[i] == d) flag = true;
      }

      sb.append(flag ? "yes" : "no").append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}
