package test11006;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class ChickenCoop {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int caseNo = Integer.parseInt(br.readLine());

    StringJoiner sj = new StringJoiner("\n");

    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      int t = n - m;
      int u = m - t;

      sj.add(u + " " + t);
    }

    bw.write(sj.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
