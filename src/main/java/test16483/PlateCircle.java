package test16483;

import java.io.*;

public class PlateCircle {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());

    int res = (int) Math.round(t / 2.0 * t / 2.0);

    bw.write(res + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
