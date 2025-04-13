package test27310;

import java.io.*;

public class UnderBar {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String line = br.readLine();
    int length = line.length();
    int ubLength = length - line.replaceAll("_", "").length();
    int colLength = length - line.replaceAll(":", "").length();
    int level = length + colLength + ubLength * 5;

    bw.write(level + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
