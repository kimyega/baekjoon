package test23375;

import java.io.*;
import java.util.StringTokenizer;

public class ArmCoordination {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    long x = Long.parseLong(st.nextToken());
    long y = Long.parseLong(st.nextToken());
    long r = Long.parseLong(br.readLine());

    long x1 = x - r;
    long y1 = y - r;

    long x2 = x - r;
    long y2 = y + r;

    long x3 = x + r;
    long y3 = y + r;

    long x4 = x + r;
    long y4 = y - r;

    System.out.println(x1 + " " + y1);
    System.out.println(x2 + " " + y2);
    System.out.println(x3 + " " + y3);
    System.out.println(x4 + " " + y4);
  }
}
