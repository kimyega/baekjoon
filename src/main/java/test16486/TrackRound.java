package test16486;

import java.io.*;

public class TrackRound {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    double pie = 3.141592;

    double l = Double.parseDouble(br.readLine());
    double r = Double.parseDouble(br.readLine());

    double square = l * 2;
    double circle = 2 * pie * r;
    double result = square + circle;

    bw.write(result + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}
