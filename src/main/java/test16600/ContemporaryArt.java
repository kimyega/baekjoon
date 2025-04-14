package test16600;

import java.io.*;

public class ContemporaryArt {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    long n = Long.parseLong(br.readLine());
    double res = Math.sqrt(n) * 4;

    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
