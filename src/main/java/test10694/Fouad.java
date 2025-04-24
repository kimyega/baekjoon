package test10694;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Fouad {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < caseNo; i++) {
      Set<String> result = new HashSet<>();
      String remaining = br.readLine();

      permute("", remaining, result);

      int count = 0;
      for (String s : result) {
        if (s.charAt(0) != '0' && Integer.parseInt(s) % 7 == 0) {
          count++;
        }
      }

      sb.append("Case " + (i + 1) + ": " + count + "\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }

  static void permute(String prefix, String remaining, Set<String> result) {
    if (remaining.isEmpty()) {
      result.add(prefix);
    } else {
      Set<Character> used = new HashSet<>();
      for (int i = 0; i < remaining.length(); i++) {
        char ch = remaining.charAt(i);
        if (used.contains(ch)) continue; // 중복 문자 스킵
        used.add(ch);
        permute(
                prefix + ch,
                remaining.substring(0, i) + remaining.substring(i + 1),
                result
        );
      }
    }
  }
}
