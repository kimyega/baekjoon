package test15894;

import java.io.*;

public class MathIsPE {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    long n = Long.parseLong(br.readLine());

    bw.write(n * 4 + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
