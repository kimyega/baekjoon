package test17284;

import java.io.*;
import java.util.StringTokenizer;

public class VendingMachine {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int money = 5000;

    while (st.hasMoreTokens()) {
      int n = Integer.parseInt(st.nextToken());
      money -= n == 1 ? 500 : n == 2 ? 800 : 1000;
    }

    bw.write(money + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
