package test20233;

import java.io.*;

public class Bicycle {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int a = Integer.parseInt(br.readLine());
    int x = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    int t = Integer.parseInt(br.readLine());

    int aCost = t < 30 ? a : a + (t - 30) * x * 21;
    int bCost = t < 45 ? b : b + (t - 45) * y * 21;

    bw.write(aCost + " " + bCost);

    bw.flush();
    bw.close();
    br.close();
  }
}
