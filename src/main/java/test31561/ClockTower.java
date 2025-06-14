package test31561;

import java.io.*;

public class ClockTower {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int m = Integer.parseInt(br.readLine());

    double time = 0;

    if (m <= 30) time = m / 2.0;
    else time = (m - 30) / 2.0 * 3 + 15;

    bw.write(String.format("%.1f", time));

    bw.flush();
    bw.close();
    br.close();
  }
}
