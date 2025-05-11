package test2443;

import java.io.*;

public class Star6 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    String bl = " ";
    String st = "*";

    for (int i = 0; i < n; i++) {
      System.out.print(bl.repeat(i));
      System.out.print(st.repeat(n * 2 - 1 - i * 2));
      System.out.println();
    }

  }
}
