package test5949;

import java.io.*;

public class AddingCommas {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    bw.write(String.format("%,d\n", n));

    bw.flush();
    bw.close();
    br.close();
  }
}
