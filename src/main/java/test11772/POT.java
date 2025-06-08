package test11772;

import java.io.*;

public class POT {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int sum = 0;

    while (n-- > 0) {
      String s = br.readLine();
      int num = Integer.parseInt(s.substring(0, s.length() - 1));
      int pot = Integer.parseInt(s.substring(s.length() - 1));

      sum += (int) Math.pow(num, pot);
    }

    bw.write(sum + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
