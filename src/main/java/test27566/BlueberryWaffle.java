package test27566;

import java.io.*;
import java.util.StringTokenizer;

public class BlueberryWaffle {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int r = Integer.parseInt(st.nextToken());
    int f = Integer.parseInt(st.nextToken());

    int pl = f % (2 * r);

    String result = pl <= (double) r / 2 || pl >= (double) r * 3 / 2 ? "up" : "down";

    bw.write(result);

    bw.flush();
    bw.close();
    br.close();
  }
}
