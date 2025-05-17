
package test3034;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class AngryChangyoung {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int caseNo = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());
    int d = w * w + h * h;

    StringJoiner sj = new StringJoiner("\n");

    while (caseNo-- > 0) {
      int n = Integer.parseInt(br.readLine());

      String isBox = n * n <= d ? "DA" : "NE";
      sj.add(isBox);
    }

    bw.write(sj.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
