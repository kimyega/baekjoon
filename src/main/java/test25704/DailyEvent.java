package test25704;

import java.io.*;

public class DailyEvent {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int price = Integer.parseInt(br.readLine());

    double totalPrice = 0;
    if (n >= 20) {
      if (price >= 8000) {
        totalPrice = price * 0.75;
      } else {
        totalPrice = price - 2000;
      }
    } else if (n >= 15) {
      if (price >= 20000) {
        totalPrice =  price * 0.9;
      } else {
        totalPrice = price - 2000;
      }
    } else if (n >= 10) {
      if (price >= 5000) {
        totalPrice =  price * 0.9;
      } else {
        totalPrice = price - 500;
      }
    } else if (n >= 5) {
      totalPrice = price - 500;
    } else {
      totalPrice = price;
    }

    if (totalPrice < 0) {
      totalPrice = 0;
    }

    bw.write((int) totalPrice + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
