package test26530;

import java.io.*;
import java.util.StringTokenizer;

public class Shipping {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (caseNo-- > 0) {
      double sum = 0;
      int n = Integer.parseInt(br.readLine());

      while (n-- > 0) {
        st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        int qty = Integer.parseInt(st.nextToken());
        double price = Double.parseDouble(st.nextToken());

        sum += qty * price;
      }
      sb.append(String.format("$%.2f\n", sum));
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
