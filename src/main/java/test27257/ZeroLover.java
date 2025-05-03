package test27257;

import java.io.*;

public class ZeroLover {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String line = br.readLine();

    String regex = "^[0]+|[0]+$";
    line = line.replaceAll(regex, "");
    int len = line.length();
    int beauty = len - line.replaceAll("0", "").length();

    bw.write(beauty + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
