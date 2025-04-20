package test30868;

import java.io.*;

public class VoteCounter {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = Integer.parseInt(br.readLine());

    String five = "++++ ";
    String one = "|";

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < caseNo; i++) {
      int n = Integer.parseInt(br.readLine());
      String str = five.repeat(n / 5) + one.repeat(n % 5);
      sb.append(str.trim() + "\n");
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
