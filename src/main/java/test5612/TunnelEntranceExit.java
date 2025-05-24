package test5612;

import java.io.*;
import java.util.StringTokenizer;

public class TunnelEntranceExit {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int caseNo = Integer.parseInt(br.readLine());
    int tunnel = Integer.parseInt(br.readLine());

    int max = tunnel;
    boolean minus = false;

    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());
      int ent = Integer.parseInt(st.nextToken());
      int exit = Integer.parseInt(st.nextToken());

      tunnel += ent - exit;
      if (tunnel < 0) minus = true;

      max = Math.max(max, tunnel);
    }

    if (minus) max = 0;
    bw.write(max + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
