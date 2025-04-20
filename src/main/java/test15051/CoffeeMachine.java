package test15051;

import java.io.*;

public class CoffeeMachine {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] stairs = new int[3];

    for (int i = 0; i < 3; i++) {
      stairs[i] = Integer.parseInt(br.readLine());
    }

    int minTime = Integer.MAX_VALUE;

    for (int i = 0; i < 3; i++) {
      int time = 0;

      for (int j = 0; j < 3; j++) {
        int dist = Math.abs(i - j);
        time += stairs[j] * dist * 2;
      }

      minTime = Math.min(minTime, time);
    }

    bw.write(minTime + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
