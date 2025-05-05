package test33701;

import java.io.*;
import java.util.Random;

public class MillenniaClass {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Random random = new Random();
    String allChars = "abcdefghijklmnopqrstuvwxyz";
    String suffix = "gwan";

    while (true) {

      int totalLength = random.nextInt(45) + 5; // 총 길이 : 5~49 + gwan = 최대 50
      int bodyLength = totalLength - suffix.length(); // gwan 제외한 앞부분 길이

      StringBuilder sb = new StringBuilder();
      sb.append('n'); // 첫 글자

      boolean hasK = false;
      boolean hasU = false;

      for (int i = 1; i < bodyLength - 1; i++) {
        char c = allChars.charAt(random.nextInt(allChars.length())); // 랜덤 글자 생성

        if (c == 'k') hasK = true;
        if (c == 'u') hasU = true;

        sb.append(c);
      }

      sb.append('n'); // 마지막 글자 == 첫 글자


      if (!hasK || !hasU) continue; // k와 u 없으면 다시 만들기

      sb.append(suffix); // gwan 붙이기

      String result = sb.toString();
      bw.write(result);
      break;
    }

    bw.flush();
    bw.close();
  }
}
