package test34758;

import java.io.*;
import java.util.StringTokenizer;

public class WelcomeToKUPC {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int X = Integer.parseInt(st.nextToken());
    int Y = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());

    int dir = 0;

    StringBuilder sb = new StringBuilder();

    while (N-- > 0) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      sb.append(X == x || Y == y ? 0 : 1).append("\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
