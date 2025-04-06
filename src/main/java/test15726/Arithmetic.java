package test15726;

import java.io.*;
import java.util.StringTokenizer;

public class Arithmetic {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    double resultDouble = (double) a * Math.max(b, c) / Math.min(b, c);
    int result = (int) resultDouble;
    bw.write(result + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}
