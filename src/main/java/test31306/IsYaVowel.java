package test31306;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsYaVowel {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count1 =0, count2 = 0;
    String word = br.readLine();

    Pattern p1 = Pattern.compile("[aeiou]");
    Matcher m1 = p1.matcher(word);

    Pattern p2 = Pattern.compile("[aeiouy]");
    Matcher m2 = p2.matcher(word);

    while (m1.find()) {
      count1++;
    }
    while (m2.find()) {
      count2++;
    }

    bw.write(count1 + " " + count2);

    bw.flush();
    bw.close();
    br.close();
  }
}
