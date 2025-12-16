package test34759;

import java.io.*;

public class ZebraAndLion {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long N = Long.parseLong(br.readLine());

    bw.write(N * 2 + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
