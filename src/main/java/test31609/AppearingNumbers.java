package test31609;

import java.io.*;
import java.util.StringTokenizer;

public class AppearingNumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());

    boolean[] appeared = new boolean[10];
    StringTokenizer st = new StringTokenizer(br.readLine());

    while (st.hasMoreTokens()) {
      int a = Integer.parseInt(st.nextToken());
      appeared[a] = true;
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < 10; i++) {
      if (appeared[i]) {
        sb.append(i + "\n");
      }
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
