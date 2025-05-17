package test11966;

import java.io.*;

public class IsPowerOfTwo {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    double sqrt = Math.log(n) / Math.log(2);
    int res = sqrt == (int) sqrt ? 1 : 0;
    bw.write(res + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}
