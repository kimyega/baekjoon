package test25784;

import java.io.*;
import java.util.StringTokenizer;

public class EasyToSolveExpressions {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sum = 0, multiply = 1, max = Integer.MIN_VALUE;

    while (st.hasMoreTokens()) {
      int n = Integer.parseInt(st.nextToken());
      sum += n;
      multiply *= n;
      max = Math.max(max, n);
    }

    boolean isPlus = sum == max * 2;
    boolean isMultiply = multiply == max * max;

    int result = isPlus ? 1 : isMultiply ? 2 : 3;
    bw.write(result + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
