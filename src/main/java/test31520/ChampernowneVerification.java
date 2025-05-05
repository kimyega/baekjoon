package test31520;

import java.io.*;

public class ChampernowneVerification {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String nStr = br.readLine();
    int ln = nStr.charAt(nStr.length() - 1) - '0';

    String diffStr = "";
    for (int i = 1; i <= ln; i++) {
      diffStr += i;
    }

    int res = nStr.equals(diffStr) ? ln : -1;
    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
