package test18198;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasketballOneOnOne {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String line = br.readLine();

    String regex = "[AB][12]";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(line);

    int countA = 0, countB = 0, countMinus = 0;

    while (m.find()) {
      String s = m.group();
      int score = Integer.parseInt(s.substring(1));

      if (s.charAt(0) == 'A') {
        countA += score;
      } else {
        countB += score;
      }

      countMinus = Math.abs(countA - countB);

      if (countA >= 10 && countB >= 10) {
        if (countMinus >= 2) break;
      }  else if (countA >= 11 || countB >= 11) break;

    }

    String winner = countA > countB ? "A" : "B";
    bw.write(winner);

    bw.flush();
    bw.close();
    br.close();
  }
}
