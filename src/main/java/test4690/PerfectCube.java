package test4690;

import java.io.*;

public class PerfectCube {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();

    int max = 100;
    for (int a = 2; a <= max; a++) {
      for (int b = 2; b <= max; b++) {
        for (int c = b; c <= max; c++) {
          for (int d = c; d <= max; d++) {
            if (a * a * a == b * b * b + c * c * c + d * d * d) {
              sb.append("Cube = ").append(a).append(", Triple = (").append(b + "," + c +"," + d).append(")\n");
            }
          }
        }
      }
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
  }
}
