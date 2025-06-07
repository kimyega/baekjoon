package test28417;

import java.io.*;
import java.util.StringTokenizer;

public class Skateboard {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int maxScore = 0;
    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      int maxRun = 0, maxTrick = 0, secondMaxTrick = 0;

      for (int i = 0; i < 2; i++) {
        int run = Integer.parseInt(st.nextToken());
        maxRun = Math.max(maxRun, run);
      }

      for (int i = 0; i < 5; i++) {
        int trick = Integer.parseInt(st.nextToken());

        if (trick > maxTrick) {
          secondMaxTrick = maxTrick;
          maxTrick = trick;
        } else if (trick > secondMaxTrick) {
          secondMaxTrick = trick;
        }
      }

      maxScore = Math.max(maxScore, maxRun + maxTrick + secondMaxTrick);
    }

    bw.write(maxScore + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
