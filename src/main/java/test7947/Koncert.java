package test7947;

import java.io.*;
import java.util.StringTokenizer;

public class Koncert {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st;

    StringBuilder sb = new StringBuilder();

    int caseNo = Integer.parseInt(br.readLine());


    while (caseNo-- > 0) {
      int rSum = 0, gSum = 0, vSum = 0;

      for (int i = 1; i <= 10; i++) {
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        rSum += r;
        gSum += g;
        vSum += v;
      }

      sb.append(Math.round(rSum / 10.0) + " "  + Math.round(gSum / 10.0) + " "  + Math.round(vSum / 10.0) + "\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
