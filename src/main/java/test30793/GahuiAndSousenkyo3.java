package test30793;

import java.io.*;
import java.util.StringTokenizer;

public class GahuiAndSousenkyo3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String res = "";
    StringTokenizer st = new StringTokenizer(br.readLine());

    int p = Integer.parseInt(st.nextToken());
    int r = Integer.parseInt(st.nextToken());

    double v = (double) p / r;

    if (v < 0.2) {
      res = "weak";
    } else if (v < 0.4) {
      res = "normal";
    } else if (v < 0.6) {
      res = "strong";
    } else {
      res = "very strong";
    }

    bw.write(res);

    bw.flush();
    bw.close();
    br.close();
  }
}
