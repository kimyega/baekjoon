package test25870;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ParityOfStrings {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Map<Character, Integer> charCount = new HashMap<>();

    String s = br.readLine();
    for (char c : s.toCharArray()) {
      charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }

    boolean isOdd = true, isEven = true;

    for (int count : charCount.values()) {
      if (count % 2 != 0) isEven = false;
      if (count % 2 == 0) isOdd = false;
    }

    bw.write(isEven ? "0" : isOdd ? "1" : "2");

    bw.flush();
    bw.close();
    br.close();
  }
}
