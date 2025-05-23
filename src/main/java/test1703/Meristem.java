package test1703;

import java.io.*;
import java.util.StringTokenizer;

public class Meristem {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    while (true) {
      int tsf = 1;
      st = new StringTokenizer(br.readLine());
      int caseNo = Integer.parseInt(st.nextToken());
      if (caseNo == 0) break;

      while (caseNo-- > 0) {
        int sf = Integer.parseInt(st.nextToken());
        int prune = Integer.parseInt(st.nextToken());

        tsf *= sf;
        tsf -= prune;
      }

      sb.append(tsf + "\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
