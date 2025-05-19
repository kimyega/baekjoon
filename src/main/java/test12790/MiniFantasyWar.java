package test12790;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class MiniFantasyWar {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int[] weights = {1, 5, 2, 2};

    int caseNo = Integer.parseInt(br.readLine());

    StringJoiner sj = new StringJoiner("\n");

    while (caseNo-- > 0) {
      int[] stats = new int[weights.length];
      st = new StringTokenizer(br.readLine());
      int n = st.countTokens(), power = 0;

      for (int i = 0; i < n; i++) {
        int stat = Integer.parseInt(st.nextToken());
        int df = i % 4;
        stats[df] += stat;

      }

      for (int i = 0; i < stats.length; i++) {

        if (i <= 1 && stats[i] < 1) stats[i] = 1;
        else if (i == 2 && stats[i] < 0) stats[i] = 0;

        power += stats[i] * weights[i];
      }

      sj.add(power + "");
    }

    bw.write(sj.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
