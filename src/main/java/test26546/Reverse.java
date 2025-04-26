package test26546;

import java.io.*;
import java.util.StringTokenizer;

public class Reverse {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (caseNo-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String word = st.nextToken();
      int fstIdx = Integer.parseInt(st.nextToken());
      int endIdx = Integer.parseInt(st.nextToken());

      String sub = word.substring(0, fstIdx) + word.substring(endIdx);

      sb.append(sub + "\n");
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
