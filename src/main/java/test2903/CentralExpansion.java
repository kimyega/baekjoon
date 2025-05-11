package test2903;

import java.io.*;

public class CentralExpansion {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());

    int res = (int) Math.pow(1 + Math.pow(2, n), 2);
    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
