package test25915;

import java.io.*;

public class YonseiILoveYou {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String ily = "ILOVEYONSEI";
    int sum = 0;

    char stc = br.readLine().charAt(0);

    for (char c : ily.toCharArray()) {
      sum += Math.abs(stc - c);
      stc = c;
    }

    bw.write(sum + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
