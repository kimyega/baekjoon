package test24408;

import java.io.*;

public class Mult {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    boolean isMult = false;
    int mult = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 1; i < n; i++) {
      int a = Integer.parseInt(br.readLine());


      if (isMult) {
        mult = a;
        isMult = false;
      } else if (a % mult == 0) {
        isMult = true;
        sb.append(a).append("\n");
      }
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
