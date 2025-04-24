package test24183;

import java.io.*;
import java.util.StringTokenizer;

public class Affischutskicket {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int e = Integer.parseInt(st.nextToken());
    int p = Integer.parseInt(st.nextToken());
    int i = Integer.parseInt(st.nextToken());

    double total = 229 * 324 * 2 * e + 297 * 420 * 2 * p + 210 * 297 * i;
    total /= 1000000;
    bw.write(total + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
