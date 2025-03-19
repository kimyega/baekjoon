package test9086;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCase = sc.nextInt();
    if (testCase < 0 || testCase > 10) return;
    sc.nextLine();

    String[] results = new String[testCase];
    for (int i = 0; i < testCase; i++) {
      String word = sc.nextLine();
      if (word.length() > 1000) return;
      String reg = "[A-Z]+";
      Pattern pattern = Pattern.compile(reg);
      Matcher matcher = pattern.matcher(word);

      if (matcher.matches()) {
        results[i] = "" + word.charAt(0) + word.charAt(word.length() - 1);
      }
    }

    for (String result : results) {
      System.out.println(result);
    }
  }
}
