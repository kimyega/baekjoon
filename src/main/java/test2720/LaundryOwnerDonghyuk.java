package test2720;

import java.io.*;

public class LaundryOwnerDonghyuk {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] coinValues = {25, 10, 5, 1};

    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (caseNo-- > 0) {
      int change = Integer.parseInt(br.readLine());

      for (int coin : coinValues) {
        sb.append(change / coin + " ");
        change %= coin;
      }

      sb.append("\n");
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
