package test3276;

import java.io.*;

public class ICONS {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int minSum = Integer.MAX_VALUE;
    int bestRow = 0, bestCol = 0;

    for (int row = 1; row <= Math.sqrt(n); row++) {
      int col = (n + row - 1) / row;
      if (row * col >= n) {
        if (row + col < minSum) {
          minSum = row + col;
          bestRow = row;
          bestCol = col;
        }
      }
    }

    bw.write(bestRow + " " + bestCol + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
