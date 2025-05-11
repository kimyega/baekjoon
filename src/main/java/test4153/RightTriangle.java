package test4153;

import java.io.*;
import java.util.StringTokenizer;

public class RightTriangle {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    StringBuilder sb = new StringBuilder();

    while (true) {
      int max = Integer.MIN_VALUE, sum = 0;
      st = new StringTokenizer(br.readLine());

      while (st.hasMoreTokens()) {
        int num = Integer.parseInt(st.nextToken());
        sum += num * num;
        max = Math.max(max, num);
      }

      if (sum == 0) break;

      String isRightTriangle = sum == max * max * 2 ? "right" : "wrong";
      sb.append(isRightTriangle).append("\n");
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
