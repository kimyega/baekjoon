package test26314;

import java.io.*;

public class VowelCount {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (n-- > 0) {
      String s = br.readLine();
      int vowelCnt = 0, consonantCnt = 0;

      consonantCnt = s.replaceAll("[aeiou]", "").length();
      vowelCnt = s.length() - consonantCnt;

      sb.append(s).append("\n");
      sb.append(vowelCnt > consonantCnt ? 1 : 0).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
