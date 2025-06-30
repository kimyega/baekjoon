package test9838;

import java.io.*;

public class XMAS {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();

    int caseNo = Integer.parseInt(br.readLine());

    int[] gifted = new int[caseNo];

    for (int i = 1; i <= caseNo; i++) {
      int x = Integer.parseInt(br.readLine());

      gifted[x - 1] = i;
    }

    for (int gift : gifted) {
      sb.append(gift).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
