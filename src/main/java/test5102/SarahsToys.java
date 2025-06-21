package test5102;

import java.io.*;
import java.util.StringTokenizer;

public class SarahsToys {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    while (true) {
      st = new StringTokenizer(br.readLine());
      int toys = Integer.parseInt(st.nextToken());
      int away = Integer.parseInt(st.nextToken());
      if (toys == 0 && away == 0) break;

      int left = toys - away;
      int pairs = left / 2, haveThree = 0;

      if (left % 2 == 1 && left >= 3) {
        pairs--;
        haveThree++;
      }

      sb.append(pairs + " " + haveThree + "\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
