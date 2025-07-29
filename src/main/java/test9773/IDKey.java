package test9773;

import java.io.*;

public class IDKey {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      String s = br.readLine();
      long N = Long.parseLong(s);

      // 마지막 3자리 * 10
      long val = (N % 1000) * 10;

      // 13자리 숫자의 각 자리 더하기
      for (char c : s.toCharArray()) {
        val += c - '0';
      }

      if (val > 9999) {
        val %= 10000;  // 뒤 4자리만 남김
      } else if (val < 1000) {
        val += 1000;
      }

      // 4자리 숫자 앞에 0 붙여 출력
      String output = String.format("%04d", val);
      bw.write(output + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
