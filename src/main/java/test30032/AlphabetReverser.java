package test30032;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class AlphabetReverser {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int d = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();

    while (n-- > 0) {
      String s = br.readLine();
      sb.append(flipString(s, d)).append('\n');
    }

    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }

  private static final Map<Character, Character> verticalFlip = new HashMap<>();
  private static final Map<Character, Character> horizontalFlip = new HashMap<>();

  static {
    verticalFlip.put('p', 'b');
    verticalFlip.put('b', 'p');
    verticalFlip.put('q', 'd');
    verticalFlip.put('d', 'q');

    horizontalFlip.put('p', 'q');
    horizontalFlip.put('q', 'p');
    horizontalFlip.put('b', 'd');
    horizontalFlip.put('d', 'b');
  }

  public static String flipString(String input, int direction) {
    Map<Character, Character> flipMap;

    if (direction == 1) {
      flipMap = verticalFlip;
    } else if (direction == 2) {
      flipMap = horizontalFlip;
    } else {
      throw new IllegalArgumentException("Invalid direction: " + direction);
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      sb.append(flipMap.getOrDefault(c, c));
    }

    return sb.toString();
  }
}
