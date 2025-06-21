package test13221;

import java.io.*;
import java.util.StringTokenizer;

public class Manhattan {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st;
    int min = Integer.MAX_VALUE, minX = 0, minY = 0;

    st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());

    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      int tx = Integer.parseInt(st.nextToken());
      int ty = Integer.parseInt(st.nextToken());

      int td = Math.abs(x - tx) + Math.abs(y - ty);

      if (td < min) {
        min = td;
        minX = tx;
        minY = ty;
      }
    }

    bw.write(minX + " " + minY + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
