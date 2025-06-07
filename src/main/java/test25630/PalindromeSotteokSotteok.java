package test25630;

import java.io.*;

public class PalindromeSotteokSotteok {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int len = Integer.parseInt(br.readLine());
    int halfLen = len / 2;
    int count = 0;
    String s = br.readLine();

    String left = s.substring(0, halfLen);
    String right = s.substring(halfLen);

    String reverse = new StringBuilder(right).reverse().toString();

    for (int i = 0; i < halfLen; i++) {
      char lc = left.charAt(i);
      char rc = reverse.charAt(i);

      if (lc != rc) count++;
    }

    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
