package test28431;

import java.io.*;

public class SocksPair {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 5; i++) {
      sb.append(br.readLine());
    }
    String res = paring(sb.toString());
    bw.write(res);

    bw.flush();
    bw.close();
    br.close();
  }

  static String paring(String str) {
    if (str.length() == 1) return str;

    for (int i = 0; i < str.length(); i++) {
      int count = 0;
      char c = str.charAt(i);

      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == c) count++;
      }

      if (count >= 2) {
        str = str.replaceFirst(c + "", "").replaceFirst(c + "", "");
        break;
      }
    }
    return paring(str);
  }
}
