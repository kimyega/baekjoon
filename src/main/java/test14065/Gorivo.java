package test14065;

import java.io.*;

public class Gorivo {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    double mpg = Double.parseDouble(br.readLine());

    double meter = mpg * 1609.344;
    double liters = 3.785411784;
    double lphkm = liters * 100000 / meter;

    bw.write(lphkm + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
