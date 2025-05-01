package test31615;

import java.io.*;

public class Digit {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());

    String s = "" + (a + b);
    int digit = s.length();

    bw.write(digit + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
