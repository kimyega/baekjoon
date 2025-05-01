package test26731;

import java.io.*;

public class ZagubionaLitera {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String line = br.readLine();

    for (char c = 'A'; c <= 'Z'; c++) {
      int len = line.length();
      int rpLen = line.replace("" + c, "").length();

      if (len == rpLen) {
        bw.write(c + "");
        break;
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
