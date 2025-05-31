package test13698;

import java.io.*;
import java.util.Map;

public class HawkEyes {

  static class SwapCase {
    int pos1, pos2;

    SwapCase(int pos1, int pos2) {
      this.pos1 = pos1;
      this.pos2 = pos2;
    }

    int swap (int ball) {
      return pos1 == ball ? pos2 : pos2 == ball ? pos1 : ball;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Map<Character, SwapCase> swapCases = Map.of(
            'A', new SwapCase(1, 2),
            'B', new SwapCase(1, 3),
            'C', new SwapCase(1, 4),
            'D', new SwapCase(2, 3),
            'E', new SwapCase(2, 4),
            'F', new SwapCase(3, 4)
    );

    int small = 1, big = 4;

    String moves = br.readLine();

    for (char move : moves.toCharArray()) {
      SwapCase swapCase = swapCases.get(move);

      small = swapCase.swap(small);
      big = swapCase.swap(big);
    }

    bw.write(small + "\n" + big);

    bw.flush();
    bw.close();
    br.close();
  }
}
