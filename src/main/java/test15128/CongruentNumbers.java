package test15128;

import java.io.*;
import java.util.StringTokenizer;

public class CongruentNumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int p1 = Integer.parseInt(st.nextToken());
    int q1 = Integer.parseInt(st.nextToken());
    int p2 = Integer.parseInt(st.nextToken());
    int q2 = Integer.parseInt(st.nextToken());

    long r1 = (long) p1 * p2;
    long r2 = (long) q1 * q2 * 2;

    if (r1 % r2 == 0) {
      bw.write("1");
    } else {
      bw.write("0");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
