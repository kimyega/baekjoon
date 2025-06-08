package test19572;

import java.io.*;
import java.util.StringTokenizer;

public class SmallDrought {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    double a, b, c;

    StringTokenizer st = new StringTokenizer(br.readLine());
    int d1 = Integer.parseInt(st.nextToken());
    int d2 = Integer.parseInt(st.nextToken());
    int d3 = Integer.parseInt(st.nextToken());

    b = (d1 - d2 + d3) / 2.0;
    a = d1 - b;
    c = d3 - b;

    if (a <= 0 || b <= 0 || c <= 0) {
      bw.write("-1\n");
    } else {
      bw.write("1\n");
      bw.write(String.format("%.1f %.1f %.1f\n", a, b, c));
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
