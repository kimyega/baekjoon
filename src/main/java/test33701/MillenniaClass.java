package test33701;

import java.util.Random;

public class MillenniaClass {
  public static void main(String[] args) {
    Random random = new Random();
    String allChars = "abcdefghijklmnopqrstuvwxyz";
    String suffix = "gwan";

    while (true) {
      // 총 길이: 최소 6 (n, k, u, gwan 포함) ~ 최대 50
      int totalLength = random.nextInt(45) + 5; // 5~49 + gwan = 최대 50
      int bodyLength = totalLength - suffix.length(); // gwan 제외한 앞부분 길이

      if (bodyLength < 1) continue;

      StringBuilder sb = new StringBuilder();
      sb.append('n'); // 첫 글자 == 마지막 글자

      boolean hasK = false;
      boolean hasU = false;

      for (int i = 1; i < bodyLength - 1; i++) {
        char c = allChars.charAt(random.nextInt(allChars.length()));
        if (c == 'k') hasK = true;
        if (c == 'u') hasU = true;
        sb.append(c);
      }

      sb.append('n'); // 마지막 글자 == 첫 글자

      // k와 u 없으면 다시
      if (!hasK || !hasU) continue;

      sb.append(suffix); // gwan 붙이기

      String result = sb.toString();
      System.out.println(result);
      break;
    }
  }
}
