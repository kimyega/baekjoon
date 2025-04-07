package test6778;

import java.io.*;

public class WhichAlien {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int antenna = Integer.parseInt(br.readLine());
    int eyes = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    if (antenna > 2 && eyes < 5) {
      sb.append("TroyMartian\n");
    }
    if (antenna < 7 && eyes > 1) {
      sb.append("VladSaturnian\n");
    }
    if (antenna < 3 && eyes < 4) {
      sb.append("GraemeMercurian\n");
    }
    bw.write(sb.toString());

    br.close();
    bw.flush();
    bw.close();
  }
}
