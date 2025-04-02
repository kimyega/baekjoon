package test5543;

import java.io.*;

public class SangGeunBurger {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int minBurger = 0, minBeverage = 0;
    for (int i = 0; i < 5; i++) {
      int price = Integer.parseInt(br.readLine());
      if (i == 0) {
        minBurger = price;
      } else if (i < 3) {
        minBurger = Math.min(price, minBurger);
      } else if (i == 3) {
        minBeverage = price;
      } else {
        minBeverage = Math.min(price, minBeverage);
      }
    }
    int minPrice = minBurger + minBeverage - 50;
    bw.write(minPrice + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}
