package test22279;

import java.io.*;
import java.util.StringTokenizer;

public class QualityAdjustedLifeYear {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    double qaly = 0;

    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      double q = Double.parseDouble(st.nextToken());
      double y = Double.parseDouble(st.nextToken());

      qaly += q * y;
    }

    bw.write(qaly + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
