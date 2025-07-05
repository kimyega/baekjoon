package test8815;

import java.io.*;

public class Test {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (caseNo-- > 0) {
      int n = Integer.parseInt(br.readLine());

      sb.append(selection(n)).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }

  static char selection(int n) {
    if (n == 1) return 'A';

    int steps = n - 1;
    int cycle = steps / 3;
    int remain = steps % 3;

    int value = cycle;
    if (remain == 1) value += 1;
    else if (remain == 2) value += 2;

    value = value % 4;
    return (char) ('A' + value);
  }
}
