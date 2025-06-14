package test28454;

import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GiftExpireDate {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    LocalDate now = LocalDate.parse(br.readLine());

    int n = Integer.parseInt(br.readLine());
    int cnt = 0;

    while (n-- > 0) {
      LocalDate exprDate = LocalDate.parse(br.readLine());
      long diff = ChronoUnit.DAYS.between(now, exprDate);

      if (diff >= 0) cnt++;
    }

    bw.write(cnt + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
