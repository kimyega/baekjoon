package test20215;

import java.io.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class CuttingCorners {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    double w = Double.parseDouble(st.nextToken());
    double h = Double.parseDouble(st.nextToken());

    double cd = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
    double cr = w + h;
    double res  = cr - cd;

    DecimalFormat df = new DecimalFormat("#.#");
    df.setMaximumFractionDigits(9);

    bw.write(df.format(res));

    bw.flush();
    bw.close();
    br.close();
  }
}
