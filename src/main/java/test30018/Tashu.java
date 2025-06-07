package test30018;

import java.io.*;
import java.util.StringTokenizer;

public class Tashu {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st1;
    StringTokenizer st2;

    int cnt = 0;
    int n = Integer.parseInt(br.readLine());


    st1 = new StringTokenizer(br.readLine());
    st2 = new StringTokenizer(br.readLine());

    while (st1.hasMoreTokens()) {
      int a = Integer.parseInt(st1.nextToken());
      int b = Integer.parseInt(st2.nextToken());

      if (a - b > 0) cnt += a - b;
    }

    bw.write(cnt + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
