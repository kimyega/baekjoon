package test13363;

import java.io.*;

public class JumbledCompass {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n1 = Integer.parseInt(br.readLine());
    int n2 = Integer.parseInt(br.readLine());

    int diff = (n2 - n1 + 360) % 360;

    if (diff == 180) {
      System.out.println(180);
    } else if (diff > 180) {
      System.out.println(diff - 360);
    } else {
      System.out.println(diff);
    }
  }
}
