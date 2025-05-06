package test31282;

import java.io.*;
import java.util.StringTokenizer;

public class Hound {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    int res = n % (k - m) == 0 ? n / (k - m) : n / (k - m) + 1;
    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
