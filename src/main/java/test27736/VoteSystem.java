package test27736;

import java.io.*;
import java.util.StringTokenizer;

public class VoteSystem {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int total = 0, cnt = 0;
    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());

    while (st.hasMoreTokens()) {
      int vote = Integer.parseInt(st.nextToken());
      if (vote == 0) cnt++;
      total += vote;
    }

    bw.write(cnt * 2 >= n ? "INVALID" : total > 0 ? "APPROVED" : "REJECTED");

    bw.flush();
    bw.close();
    br.close();
  }
}
