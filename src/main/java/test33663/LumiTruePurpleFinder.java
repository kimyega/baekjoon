package test33663;

import java.io.*;
import java.util.StringTokenizer;

public class LumiTruePurpleFinder {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int hlo = Integer.parseInt(st.nextToken());
    int hhi = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int slo = Integer.parseInt(st.nextToken());
    int shi = Integer.parseInt(st.nextToken());



    st = new StringTokenizer(br.readLine());
    int vlo = Integer.parseInt(st.nextToken());
    int vhi = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int R = Integer.parseInt(st.nextToken());
    int G = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    int M = Math.max(Math.max(R, G), B);
    int m = Math.min(Math.min(R, G), B);

    double V = M;
    double S = (V == 0) ? 0 : (255.0 * (V - m) / V);

    double H = 0;

    if (V == R) H = 60.0 * (G - B) / (M - m);
    else if (V == G) H = 120.0 + 60.0 * (B - R) / (M - m);
    else H = 240.0 + 60.0 * (R - G) / (M - m);

    if (H < 0) H += 360.0;

    bw.write(H >= hlo && H <= hhi && S >= slo && S <= shi && V >= vlo && V <= vhi ? "Lumi will like it." : "Lumi will not like it.");

    bw.flush();
    bw.close();
    br.close();
  }
}
