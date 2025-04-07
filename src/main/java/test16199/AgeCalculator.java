package test16199;

import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String birthStr = br.readLine();
    String todayStr = br.readLine();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy M d");
    LocalDate birth = LocalDate.parse(birthStr, formatter);
    LocalDate today = LocalDate.parse(todayStr, formatter);

    Period age = Period.between(birth, today);
    int manAge = age.getYears();
    bw.write(manAge + "\n");

    int birthYear = birth.getYear();
    int todayYear = today.getYear();
    int senunAge = todayYear - birthYear + 1;
    bw.write(senunAge + "\n");

    int yeonAge = todayYear - birthYear;
    bw.write(yeonAge + "");

    br.close();
    bw.flush();
    bw.close();
  }
}
