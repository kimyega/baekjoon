package test32246;

import java.io.*;

public class BingoBlocker {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    bw.write(n == 2 ? "3" : n + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
