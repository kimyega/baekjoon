package test10179;

import java.io.*;
import java.util.StringJoiner;

public class Coupon {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int caseNo = Integer.parseInt(br.readLine());

    StringJoiner sj = new StringJoiner("\n");

    while (caseNo-- > 0) {
      double price = Double.parseDouble(br.readLine());
      sj.add(String.format("$%.2f", price * 0.8));
    }

    bw.write(sj.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
