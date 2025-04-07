package test25377;

import java.io.*;
import java.util.StringTokenizer;

public class Bread {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = Integer.parseInt(br.readLine());
    int min = -1;

    for (int i = 0; i < caseNo; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      if (a > b) continue;
      if (min == -1) {
        min = b;
      } else {
        min = Math.min(min, b);
      }
    }

    bw.write(min + "");
    br.close();
    bw.flush();
    bw.close();
  }
}
