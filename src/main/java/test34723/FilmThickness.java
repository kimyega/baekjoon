package test34723;

import java.io.*;
import java.util.StringTokenizer;

public class FilmThickness {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int P = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int X = Integer.parseInt(st.nextToken());

    int min = Integer.MAX_VALUE;

    for (int p = 1; p <= P; p++) {
      for (int m = 1; m <= M; m++) {
        for (int c = 1; c <= C; c++) {
          int pmc = Math.abs((p + m) * (m + c) - X);
          min = Math.min(min, pmc);
        }
      }
    }

    bw.write(min + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
