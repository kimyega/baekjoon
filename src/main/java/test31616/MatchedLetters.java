package test31616;

import java.io.*;

public class MatchedLetters {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();

    int rmLen = s.replaceAll(s.charAt(0) + "", "").length();
    String res = rmLen == 0 ? "Yes" : "No";
    bw.write(res);

    bw.flush();
    bw.close();
    br.close();
  }
}
