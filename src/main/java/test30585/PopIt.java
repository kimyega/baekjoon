package test30585;

import java.io.*;
import java.util.StringTokenizer;

public class PopIt {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int zCount = 0, oCount = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    int h = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());

    while (h-- > 0) {
      String line = br.readLine();

      for (int i = 0; i < w; i++) {
        char c = line.charAt(i);

        if (c == '0') {
          zCount++;
        } else if (c == '1') {
          oCount++;
        }
      }
    }

    int res = Math.min(zCount, oCount);
    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
