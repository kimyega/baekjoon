package test1830;

import java.io.*;

public class Petrol {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int nextQuota = Integer.parseInt(br.readLine());
    int monthQuota = Integer.parseInt(br.readLine());

    int quota = monthQuota + 60;
    int totalPrice = 0;

    if (quota < nextQuota) {
      totalPrice = quota * 1500 + (nextQuota - quota) * 3000;
    } else {
      totalPrice = nextQuota * 1500;
    }

    bw.write(totalPrice + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
