package test28519;

import java.io.*;
import java.util.StringTokenizer;

public class DimensionTravel {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());

    int total = x == y ? x * 2 : Math.min(x, y) * 2 + 1;
    bw.write(total + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
