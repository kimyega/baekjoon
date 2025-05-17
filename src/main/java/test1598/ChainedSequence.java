package test1598;

import java.io.*;
import java.util.StringTokenizer;

public class ChainedSequence {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int w = Math.abs((n - 1) / 4 - (m - 1) / 4);
    int h = Math.abs((3 - (m - 1) % 4) - (3 - (n - 1) % 4));
    int res = w + h;
    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
