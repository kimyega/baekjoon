package test21185;

import java.io.*;

public class SomeSum {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    String s = "";

    if (n == 2) {
      s = "Odd";
    } else if ((n / 2) % 2 == 0) {
      s = "Even";
    } else {
      s = "Either";
    }

    bw.write(s);

    bw.flush();
    bw.close();
    br.close();
  }
}
