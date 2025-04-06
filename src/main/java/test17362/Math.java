package test17362;

import java.io.*;

public class Math {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int result = 0;
    int n = Integer.parseInt(br.readLine());
    if (n % 8 == 0) {
      result = 2;
    } else if (n % 8 == 7) {
      result = 3;
    } else if (n % 8 == 6) {
      result = 4;
    } else {
      result = n % 8;
    }
    bw.write(result + "");
    br.close();
    bw.flush();
    bw.close();
  }
}
