package test23971;

import java.io.*;
import java.util.StringTokenizer;

public class ZOAC4 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int h = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int mh = (h - 1) / (n + 1) + 1;
    int mw = (w - 1) / (m + 1) + 1;
    int res = mh * mw;
    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
