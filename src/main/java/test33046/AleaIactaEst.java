package test33046;

import java.io.*;
import java.util.StringTokenizer;

public class AleaIactaEst {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] players = {4, 1, 2, 3};
    int jindong = 0, sum = 0;

    StringTokenizer st;

    for (int i = 0; i < 2; i++) {
      st = new StringTokenizer(br.readLine());

      while (st.hasMoreTokens()) {
        sum += Integer.parseInt(st.nextToken());
      }
    }
    jindong = players[(sum - 1) % players.length];


    bw.write(jindong + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
