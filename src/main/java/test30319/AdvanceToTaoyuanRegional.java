package test30319;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AdvanceToTaoyuanRegional {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String input = br.readLine();

    LocalDate contestDate = LocalDate.of(2023, 10, 21);
    LocalDate date = LocalDate.parse(input, DateTimeFormatter.ISO_LOCAL_DATE);

    long daysBetween = ChronoUnit.DAYS.between(date, contestDate);
    String result = daysBetween < 35 ? "TOO LATE" : "GOOD";
    bw.write(result);

    bw.flush();
    bw.close();
    br.close();
  }
}
