package test15923;

import java.io.*;
import java.util.StringTokenizer;

public class WookjeTheBuilder {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());
    int[][] points = new int[n][2];

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());

      points[i][0] = Integer.parseInt(st.nextToken());
      points[i][1] = Integer.parseInt(st.nextToken());
    }

    int perimeter = 0;


    for (int i = 0; i < n; i++) {
      int x1 = points[i][0];
      int y1 = points[i][1];
      int x2 = points[(i + 1) % n][0];
      int y2 = points[(i + 1) % n][1];
      perimeter += Math.abs(x2 - x1) + Math.abs(y2 - y1);
    }

    bw.write(perimeter + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
