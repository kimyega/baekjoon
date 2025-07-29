package test9773;

import java.io.*;

public class IDKey {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (n-- > 0) {
      String s = br.readLine();
      sb.append(makeIdKey(s)).append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }

  static int makeIdKey(String s) {
    int sum = 0;
    for (char c : s.toCharArray()) {
      sum += c - '0';
    }

    int last = Integer.parseInt(s.substring(s.length() - 3));
    sum += last * 10;

    return sum / 10000 == 0 ? sum + 10000 : sum % 100000;
  }
}
