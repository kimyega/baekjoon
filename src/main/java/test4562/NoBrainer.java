package test4562;

import java.io.*;
import java.util.StringTokenizer;

public class NoBrainer {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < caseNo; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      String str = x >= y ? "MMM BRAINS" : "NO BRAINS";
      sb.append(str + "\n");
    }

    bw.write(sb.toString());
    br.close();
    bw.flush();
    bw.close();
  }
}
