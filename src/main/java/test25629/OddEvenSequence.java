package test25629;

import java.io.*;
import java.util.StringTokenizer;

public class OddEvenSequence {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int oddCnt = 0, evenCnt = 0;
    boolean isSeq = true;

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(st.nextToken());

      if (a % 2 == 0) evenCnt++;
      else oddCnt++;
    }

    isSeq = n % 2 == 0 ? oddCnt == evenCnt : oddCnt == evenCnt + 1;

    bw.write(isSeq ? "1" : "0");

    bw.flush();
    bw.close();
    br.close();
  }
}
