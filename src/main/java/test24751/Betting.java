package test24751;

import java.io.*;

public class Betting {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int per = Integer.parseInt(br.readLine());

    double opt1 = 100.0 / per;
    double opt2 = 100.0 / (100 - per);

    bw.write(opt1 + "\n" + opt2);

    bw.flush();
    bw.close();
    br.close();
  }
}
