package test18409;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingVowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int strLength = sc.nextInt();
    if (strLength < 1 || strLength > 50) return;
    sc.nextLine();
    String word = sc.nextLine().trim();

    String regex = "^[a-z]{" + strLength + "}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(word);
    if (!matcher.matches()) return;

    String vowels = "[aeiou]";
    Pattern patternVowel = Pattern.compile(vowels);
    Matcher matcherVowel = patternVowel.matcher(word);
    int count = 0;
    while (matcherVowel.find()) {
      count++;
    }
    System.out.println(count);
  }
}
