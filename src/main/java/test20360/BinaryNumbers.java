package test20360;

import java.io.*;

public class BinaryNumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();
    int pos = 0;

    int n = Integer.parseInt(br.readLine());

    while (n > 0) {
      if ((n & 1) == 1) {
        sb.append(pos).append(" ");
      }

      n >>= 1;
      pos++;
    }

    bw.write(sb.toString().trim());

    bw.flush();
    bw.close();
    br.close();
  }
}
