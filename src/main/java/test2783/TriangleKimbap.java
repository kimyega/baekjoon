package test2783;

import java.io.*;
import java.util.StringTokenizer;

public class TriangleKimbap {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sx = Integer.parseInt(st.nextToken());
    int sy = Integer.parseInt(st.nextToken());

    double minGpp = (double) sx / sy, minPrice = minGpp * 1000;
    int caseNo = Integer.parseInt(br.readLine());

    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      double gpp = (double) x / y;

      if (gpp < minGpp) {
        minGpp = gpp;
        minPrice = minGpp * 1000;
      }
    }

    bw.write(String.format("%.2f", minPrice));

    bw.flush();
    bw.close();
    br.close();
  }
}
