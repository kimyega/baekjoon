package test21612;

import java.io.*;

public class BoilingWater {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int b = Integer.parseInt(br.readLine());
    int p = 5 * b - 400;

    int isSeaLevel = 0;
    if (b < 100) {
      isSeaLevel = 1;
    } else if (b > 100) {
      isSeaLevel = -1;
    }

    bw.write(p + "\n" + isSeaLevel);

    bw.flush();
    bw.close();
    br.close();
  }
}
