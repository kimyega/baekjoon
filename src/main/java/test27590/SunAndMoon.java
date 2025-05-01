package test27590;

import java.io.*;
import java.util.StringTokenizer;

public class SunAndMoon {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    StringTokenizer st2 = new StringTokenizer(br.readLine());

    int d1 = Integer.parseInt(st1.nextToken());
    int y1 = Integer.parseInt(st1.nextToken());
    int d2 = Integer.parseInt(st2.nextToken());
    int y2 = Integer.parseInt(st2.nextToken());

    for (int year = 1; year <= 5000; year++) {
      d1++;
      d2++;

      if (d1 % y1 == 0 && d2 % y2 == 0) {
        bw.write(year + "");
        break;
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
