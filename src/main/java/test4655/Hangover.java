package test4655;

import java.io.*;

public class Hangover {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();

    while (true) {
      double sum = 0;
      int res = 1;

      double x = Double.parseDouble(br.readLine());
      if (x == 0) break;

      while (res++ > 0){
        if (sum >= x) break;
        sum += 1.0 / res;
      }

      sb.append(res - 2).append(" card(s)\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
