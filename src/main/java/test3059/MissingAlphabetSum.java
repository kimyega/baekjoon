package test3059;

import java.io.*;
import java.util.StringJoiner;

public class MissingAlphabetSum {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int caseNo = Integer.parseInt(br.readLine());

    StringJoiner sj = new StringJoiner(" ");

    while (caseNo-- > 0) {
      int sum = 0, idx = 0;
      boolean[] isAlphabet = new boolean[26];

      String str = br.readLine();

      for (char ch : str.toCharArray()) {
        isAlphabet[ch - 'A'] = true;
      }

      for (boolean b : isAlphabet) {
        if (!b) {
          sum += 65 + idx;
        }

        idx++;
      }

      sj.add(String.valueOf(sum));
    }

    bw.write(sj.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
