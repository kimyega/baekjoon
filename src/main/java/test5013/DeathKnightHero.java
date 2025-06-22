package test5013;

import java.io.*;

public class DeathKnightHero {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int cnt = 0;

    while (n-- > 0) {
      char pre = '0';
      boolean isWin = true;

      String line = br.readLine();
      for (char c : line.toCharArray()) {
        if (pre == 'C' && c == 'D') isWin = false;
        pre = c;
      }

      if (isWin) cnt++;
    }

    bw.write(cnt + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
