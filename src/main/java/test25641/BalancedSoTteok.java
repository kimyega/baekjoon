package test25641;

import java.io.*;

public class BalancedSoTteok {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();

    while (!check(s)) {
      s = pop(s);
    }

    bw.write(s);

    bw.flush();
    bw.close();
    br.close();
  }
  static boolean check(String s) {
    int sCount = 0, tCount = 0;
    for (char c : s.toCharArray()) {
      if (c == 's') sCount++;
      else if (c == 't') tCount++;
    }
    return sCount == tCount;
  }

  static String pop (String s) {
    return s.length() % 2 == 1 ? s.substring(1) : s.substring(2);
  }
}
