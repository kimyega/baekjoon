package test6750;

import java.io.*;

public class Rotatingletters {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String s = br.readLine();

    bw.write(s.replaceAll("[IOSHZXN]", "").isEmpty() ? "YES" : "NO");

    bw.flush();
    bw.close();
    br.close();
  }
}
