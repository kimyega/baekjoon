package test31612;

import java.io.*;

public class StrokeCount {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();

    int len = s.length();
    int oCnt = s.replaceAll("[ji]", "").length();
    int count = oCnt + (len - oCnt) * 2;
    bw.write(count + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
