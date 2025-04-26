package test27332;

import java.io.*;

public class November {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());

    String s = a + b * 7 <= 30 ? "1" : "0";
    bw.write(s);

    bw.flush();
    bw.close();
    br.close();
  }
}
