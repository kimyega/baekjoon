package test5597;

import java.io.*;

public class UnsubmittedStudent {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    boolean[] submitted = new boolean[30];

    for (int i = 0; i < 28; i++) {
      int n = Integer.parseInt(br.readLine());
      submitted[n - 1] = true;
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < 30; i++) {
      if (!submitted[i]) {
        sb.append(i + 1).append("\n");
      }
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
