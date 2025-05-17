package test10178;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class HalloweenCandy {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int caseNo = Integer.parseInt(br.readLine());

    StringTokenizer st;
    StringJoiner sj = new StringJoiner("\n");

    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());
      int candy = Integer.parseInt(st.nextToken());
      int siblings = Integer.parseInt(st.nextToken());

      int you = candy / siblings;
      int dad = candy % siblings;

      sj.add("You get " + you + " piece(s) and your dad gets " + dad + " piece(s).");
    }

    bw.write(sj.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
