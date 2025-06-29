package test6721;

import java.io.*;
import java.util.StringTokenizer;

public class BackwardNumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int caseNo = Integer.parseInt(br.readLine());

    while (caseNo-- > 0) {
      st = new StringTokenizer(br.readLine());
      int revA = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
      int revB = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

      int sum = revA + revB;
      int revSum = Integer.parseInt(new StringBuilder(Integer.toString(sum)).reverse().toString());

      sb.append(revSum).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
