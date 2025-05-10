package test2588;

import java.io.*;

public class Multiplier {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    int multi = n * m;

    StringBuilder sb = new StringBuilder();

    while (m != 0){

      int res = n * (m % 10);
      sb.append(res + "\n");

      m /= 10;
    }

    sb.append(multi);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
