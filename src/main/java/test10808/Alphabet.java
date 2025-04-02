package test10808;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Alphabet {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    String word = br.readLine();
    for (char c = 'a'; c <= 'z'; c++) {
      map.put(c, 0);
    }
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      map.put(c, map.get(c) + 1);
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      bw.write(entry.getValue().toString() + " ");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
