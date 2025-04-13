package test26575;

import java.io.*;
import java.util.StringTokenizer;

public class Pups {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int caseNo = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < caseNo; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      double dogs = Double.parseDouble(st.nextToken());
      double food = Double.parseDouble(st.nextToken());
      double price = Double.parseDouble(st.nextToken());

      sb.append(String.format("$%.2f\n", dogs * food * price));
    }
    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
